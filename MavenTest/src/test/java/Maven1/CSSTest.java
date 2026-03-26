package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Testing@test.com");
     //    driver.findElement(By.cssSelector("input#email")).sendKeys("Testing@test.com");
      //   driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Testing@test.com");
    //     driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("Testing@test.com");
      //  driver.findElement(By.cssSelector("input[id^=email]")).sendKeys("Testing@test.com");
    //    driver.findElement(By.cssSelector("input[id$=ail]")).sendKeys("Testing@test.com");
    //    driver.findElement(By.cssSelector("input[id*=mai]")).sendKeys("Testing@test.com");

         
         try {
	            Thread.sleep(5000);
	        } 
		 catch (InterruptedException e) 
		    {
	            e.printStackTrace();
	        }
       driver.quit();


	}

}
