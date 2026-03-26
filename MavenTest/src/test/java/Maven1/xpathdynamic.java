package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdynamic {
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		SelectGender("Female");	
	}
		
		public static void SelectGender(String gender)
			{
			   driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
			    driver.findElement(By.xpath("//a[contains(text(),'new account')]")).click();
			    WebElement radiobtn=  driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding::input[1]")); //dynamic xpath
			}
		}