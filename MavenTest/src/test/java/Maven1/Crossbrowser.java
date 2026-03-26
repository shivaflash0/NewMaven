package Maven1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Crossbrowser {

   @Test
   public void googleTitletest()
   {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       
       String title = driver.getTitle();
       Assert.assertEquals(title, "Google");

       System.out.println("chrome test pass");
   }
}