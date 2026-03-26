package Maven1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshottest{

	public static void main(String[] args) throws IOException {
		
       WebDriver driver= new ChromeDriver(); 
       // Launch Chrome browser using Selenium

       driver.manage().window().maximize(); 
       // Maximize the browser window

       driver.get("https://www.facebook.com/"); 
       // Open Facebook website

       TakesScreenshot t = (TakesScreenshot)driver; 
       // Type casting WebDriver to TakesScreenshot interface

       File srcfile =t.getScreenshotAs(OutputType.FILE); 
       // Capture screenshot and store it as a file

       FileUtils.copyFile(srcfile, new File("C:\\Users\\nagil\\OneDrive\\Pictures\\Test1.jpg")); 
       // Copy screenshot file to the given location

       System.out.println("Screenshot printed"); 
       // Print message in console after screenshot saved
		
	}
}