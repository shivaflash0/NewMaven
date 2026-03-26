package Maven1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignupTest {

		public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		    // Click Create new account
		    WebElement createBtn = wait.until(
		            ExpectedConditions.elementToBeClickable(
		                    By.xpath("//a[contains(@href,'reg')]"))
		    );
		    createBtn.click();

		    // Wait until dialog appears
		  
		    System.out.println("new account page opened successfully.");
		    
		}
	
}