package Maven1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class parallelrealtime {
	public static WebDriver driver;
	@Test
	public void Gooletest() throws InterruptedException
	{
   System.out.println("First test " + Thread.currentThread().getId());
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    String title = driver.getTitle();
    Assert.assertEquals(title, "Google");
   Thread.sleep(2000);
   driver.close();
}
	@Test
	public void Facebook() throws InterruptedException
	{
   System.out.println("First test " + Thread.currentThread().getId());
    driver = new EdgeDriver();
    driver.get("https://www.facebook.com/");
    String title = driver.getTitle();
    Assert.assertEquals(title, "Facebook");
   Thread.sleep(2000);
   driver.close();
}
}
