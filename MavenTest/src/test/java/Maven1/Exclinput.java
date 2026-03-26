package Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exclinput {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\nagil\\Downloads\\Automation.xlsx");

		FileInputStream fis = new FileInputStream(file);// initialize the file

		XSSFWorkbook wb = new XSSFWorkbook(fis);// go to file

		//Sheet sheet = wb.getSheet("data");// go to sheet
		Sheet sheet = wb.getSheetAt(0);// go to sheet

		Row row = sheet.getRow(1);// go to row

		Cell cell = row.getCell(1);// go to cell

		String value = cell.getStringCellValue();

		System.out.println(value);
	}
}