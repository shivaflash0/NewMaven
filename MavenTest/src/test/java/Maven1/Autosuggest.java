package Maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(2000);
        List <WebElement> all= driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
     // Find all elements on the page whose text contains the word "selenium"

     int size = all.size();
     // Get the total number of matching WebElements

     System.out.println("Size of webelement is "+size);
     // Print the number of elements found

     for (int i=0; i< size; i++ )
     {
     	String txt = all.get(i).getText();
     	// Get the text of each WebElement using index

     	System.out.println(txt);
     	// Print the text of each element
     }
	}

}
