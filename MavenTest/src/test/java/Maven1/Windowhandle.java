package Maven1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver(); 
		// Launch Chrome browser

		driver.manage().window().maximize(); 
		// Maximize browser window

		driver.get("https://demoqa.com/browser-windows"); 
		// Open demo site for window handling

		driver.findElement(By.id("windowButton")).click(); 
		// Click button that opens a new window

		String mainWindow = driver.getWindowHandle(); 
		// Get main window ID

		Set<String> allWindows = driver.getWindowHandles(); 
		// Get all window IDs

		Iterator<String> it = allWindows.iterator(); 
		// Create iterator to loop through window IDs

		while(it.hasNext())
		{
			String childWindow = it.next(); 
			// Get next window ID

			if(!mainWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow); 
				// Switch control to child window

				String text = driver.findElement(By.id("sampleHeading")).getText();
				// Capture text from child window

				System.out.println(text);
			}
		}

		// Close all browser windows
	}
}