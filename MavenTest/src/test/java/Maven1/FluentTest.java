package Maven1;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentTest {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();

		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("selenium");
		Search.sendKeys(Keys.ENTER);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(4588))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement Search2 = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.className("VwiC3b yXK7lf p4wth r025kc Hdw6tb"));
			}
		});

		Search2.click();
	}
}
