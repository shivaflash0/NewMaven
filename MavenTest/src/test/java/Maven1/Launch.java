package Maven1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver.get("https://www.google.com/");
	 driver.get("https://www.youtube.com/");
	 driver.navigate().to("https://www.facebook.com/");
	// driver.navigate().back();
	// driver.navigate().forward();
	// driver.navigate().refresh();
	// driver.findElement(By.linkText("Forgotten password?")).click();  one way
	 WebElement forgetlink = driver.findElement(By.linkText("Forgotten password?"));
	 forgetlink.click();
	 List<WebElement> list= driver.findElements(By.tagName("a"));
	 System.out.println("Page title is: " + driver.getTitle());
	 for (WebElement l : list)
	 {
		 System.out.println(l.getAttribute("href"));
	 }

     // Close browser after 5 seconds
   /*  try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
         driver.quit();*/
	}
}
