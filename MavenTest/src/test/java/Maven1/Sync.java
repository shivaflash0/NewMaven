package Maven1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[contains(@href,'/deals?ref_=nav_cs_gb')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Mobiles']")).click();
        WebElement refbr= driver.findElement(By.xpath("//span[normalize-space()='Refurbished & Open Box']")) ;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Refurbished & Open Box']")));
        refbr.click();
		//span[normalize-space()='Refurbished & Open Box']
	}

}
