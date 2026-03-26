package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
    public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'new account')]")).click();
	    driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("HJkLMKl@abc.cim");
	    WebElement radiobtn=  driver.findElement(By.xpath("//label[contains(text(),'Female')]/input[@type='radio' and @value='1']")); //xpath for selecting radio button using traversing i.e in html identifying element and going up or down wards in html to find the exact option
	    radiobtn.click();
	    WebElement customrdo = driver.findElement(By.xpath("//label[contains(text(),'Male')]/following::input[1]"));
	    customrdo.click();
	   //driver.findElement(By.xpath("//button[text()='Sign Up']/preceding::label[2]")).click(); //using preceding selecting male radio button
	    driver.findElement(By.xpath("//label[text()='Female']/following::input[1]")).click(); //using following 
	    driver.findElement(By.xpath("//label[text()='Female']/preceding::input[3]")).sendKeys("Nagilla") ;
	 //   driver.quit();
	    
	}

}
