package Maven1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onlinepngtools.com/convert-jpg-to-png");

		Thread.sleep(4000);

		// open upload window
		driver.findElement(By.xpath("//div[@id='tour-input']//canvas")).click();

		Thread.sleep(2000);

		// copy file path
		StringSelection sel = new StringSelection("C:\\Users\\nagil\\OneDrive\\Pictures\\Lion.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		Robot robot = new Robot();

		// paste path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		// press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("File uploaded successfully");
	}
}