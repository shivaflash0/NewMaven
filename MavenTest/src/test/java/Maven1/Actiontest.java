package Maven1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actiontest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.amazon.in/");
		driver.get("https://www.facebook.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions act = new Actions(driver);
        WebElement usr=driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
        Action all = act.sendKeys(usr, "Shiva").keyDown(Keys.SHIFT) .sendKeys("nagilla").keyUp(Keys.SHIFT).build();
        all.perform();
	/*	WebElement fresh = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//a[contains(@href,'fresh')]")
		    )
		);

		Actions act = new Actions(driver);
		act.moveToElement(fresh).perform();
	}*/
		
	}
}
