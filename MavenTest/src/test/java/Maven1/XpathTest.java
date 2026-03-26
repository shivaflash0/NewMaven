package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathTest {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new EdgeDriver();
		//driver.get("file:///C:/Program%20Files/Notepad++/html.html");
	     //driver.manage().window().maximize();
		//driver.findElement(By.xpath("html/body/input[1]")).sendKeys("Testfun"); // this is absolute xpath, here it was small html but real time web apps will have long html xpaths hence not recommended
		WebDriver driver2= new ChromeDriver();
		driver2.get("https://www.facebook.com/");
	     driver2.manage().window().maximize();
	     WebElement link = driver2.findElement(By.linkText("Create new account"));
         link.click();	  
         WebElement send = driver2.findElement(By.xpath("//input[@id='u_0_l' or @name='firstname' or @aria-label='First name']"));// xpath by attribute
         send.sendKeys("Shiva ROCKS");
         send.clear();
         Thread.sleep(2000);
         WebElement send1 = driver2.findElement(By.xpath("//input[@id='u_0_l' or @name='firstname' or @aria-label='First name']"));// xpath by attribute
         send1.sendKeys("Shiva Fly");
         driver2.findElement(By.xpath("//input[@type='text'] [@aria-label='Surname']")).sendKeys("HEHEHE");
         Thread.sleep(3000);
         driver2.navigate().back();
         Thread.sleep(1000);
       //  driver2.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); // xpath using text function
      //   driver2.findElement(By.xpath) //xpath relative we need to find webelement using syntx like driver2.findElement(By.xpath("//input[@id='u_0_l' or @name='firstname' or @aria-label='First name']"));
         driver2.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click(); //xpath with contains
         Thread.sleep(2000);
         driver2.quit();
		
		
	}
}
