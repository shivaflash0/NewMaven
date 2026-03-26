package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath3 {
	    public static WebDriver driver;
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[contains(text(),'new account')]")).click();
		    driver.findElement(By.xpath("//Select[@id='month']/following-sibling::select")).click(); //xpath using following sibling
		    driver.findElement(By.xpath("//Select[@id='month']/preceding-sibling::select")).click(); //xpath using preceding sibling
		    driver.findElement(By.xpath("//Select[starts-with(@name,'birthday_m')]")).click();//xpath using starts-with 
		    driver.findElement(By.xpath("//Select[@id='month']/descendant::option[2]")).click();	// xpath using descendant & ancestor 
		
		    driver.findElement(By.xpath("(//label[text()='Female']/following::input)[2]")).click();// group xpath
		    }
}
