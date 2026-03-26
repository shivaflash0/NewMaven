package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WETest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement text= driver.findElement(By.id("email"));
		text.sendKeys("nagillshiva@gmail.com");
		text.clear();
	    text.sendKeys("loggin@gmail.com");
	   String label= text.getAttribute("aria-label");
     System.out.println(label);
      WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
      createAccountButton.click();
      WebElement signUpButton = driver.findElement(By.name("websubmit"));
      System.out.println("Text of signup button is " +signUpButton.getText() );
   //   System.out.println("Sign Up button text: " + driver.findElement(By.name("websubmit")).getText());

    //  signUpButton.submit(); 
      signUpButton.click();// diff between submit and click method is submit will work when type=submit present in html. click will always work
      System.out.println("Display  " +signUpButton.isDisplayed() );
      System.out.println("Enable " +signUpButton.isEnabled() );
      System.out.println("color " +signUpButton.getCssValue("color"));
      driver.quit();
	
	}

}
