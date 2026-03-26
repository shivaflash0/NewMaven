package Maven1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class proptest {


	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\nagil\\eclipse-workspace\\MavenTest\\src\\test\\java\\Maven1\\Input.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("URL");
		System.out.println("URL is "+ url);
		ChromeDriver driver = new ChromeDriver();
		driver.get(p.getProperty("URL"));
		driver.findElement(By.xpath("html/body/input[1]")).sendKeys(p.getProperty("user")); 
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys(p.getProperty("pass")); 
		
	}

}
