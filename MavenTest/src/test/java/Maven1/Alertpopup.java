package Maven1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		// Launch Chrome browser

		driver.manage().window().maximize();
		// Maximize browser window

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Open demo page which contains JavaScript alert

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		// Click button to trigger alert popup

		Thread.sleep(2000);
		// Wait so alert becomes visible

		Alert al = driver.switchTo().alert();
		// Switch Selenium control from browser to alert popup

		System.out.println("Alert Message is > " + al.getText());
		// Print alert message text in console

		al.accept();
		// Click OK button on alert
		al.dismiss();
		// dismiss i.e cancel

		//driver.quit();
		// Close browser
	}
}