package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		 driver= new ChromeDriver();
		 driver.get("file:///C:/Program%20Files/Notepad++/html.html");
	//	 WebElement link = driver.findElement(By.tagName("a"));
	//	 WebElement link = driver.findElement(By.id("fb"));
	//	 WebElement link = driver.findElement(By.name("facebook"));
		// WebElement link = driver.findElement(By.className("fblogin"));
	// WebElement link = driver.findElement(By.linkText("Click here to login Facebook"));
		 WebElement link = driver.findElement(By.partialLinkText("Facebook"));
          link.click();
		 WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		 pass.sendKeys("Testing");
		/* try {
	            Thread.sleep(5000);
	        } 
		 catch (InterruptedException e) 
		    {
	            e.printStackTrace();
	        }*/
		// WebElement link2 = driver.findElement(By.partialLinkText("password"));
		 //link2.click();
		// driver.quit();
		 

	}

}
