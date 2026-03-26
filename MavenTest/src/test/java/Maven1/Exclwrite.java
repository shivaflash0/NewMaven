package Maven1;

import java.io.File;                 // Used to handle file path
import java.io.FileInputStream;      // Used to read Excel file
import java.io.FileOutputStream;     // Used to write data into Excel
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;   // Represents a cell in Excel
import org.apache.poi.ss.usermodel.Row;    // Represents a row in Excel
import org.apache.poi.ss.usermodel.Sheet;  // Represents a sheet in Excel
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // Used for .xlsx Excel files

public class Exclwrite {

	// Method to write data into Excel
	public static void setexceldata(String sheetName, int rowno, int cellno, String data) throws IOException {

		File file = new File("C:\\Users\\nagil\\Downloads\\Automation.xlsx"); 
		// Locating the Excel file

		FileInputStream fis = new FileInputStream(file); 
		// Opening the Excel file for reading

		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		// Loading the Excel workbook

		Sheet sheet = wb.getSheet(sheetName); 
		// Accessing the sheet using sheet name

		Row row = sheet.getRow(rowno); 
		// Accessing the required row

		if (row == null) {               
			row = sheet.createRow(rowno); 
			// If row does not exist, create a new row
		}

		Cell cell = row.createCell(cellno); 
		// Creating a cell in the specified column

		cell.setCellValue(data); 
		// Writing the value into the cell

		FileOutputStream fos = new FileOutputStream(file); 
		// Opening file for writing updated data

		wb.write(fos); 
		// Saving the changes into Excel file

		wb.close(); 
		// Closing workbook to avoid memory leak
	}

	public static void main(String[] args) throws IOException {

		setexceldata("data", 3, 3, "Setting"); 
		// Calling method:
		// Sheet name = data
		// Row number = 3
		// Cell number = 3
		// Value written = "Setting"

		System.out.println("Excel write complete"); 
		// Print message after writing data
	}
}