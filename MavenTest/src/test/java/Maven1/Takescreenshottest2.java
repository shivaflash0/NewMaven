package Maven1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshottest2 {

    static WebDriver driver; // declare driver globally so all methods can use it

	public static void main(String[] args) throws IOException {
		  driver= new ChromeDriver(); // launch Chrome browser
	      driver.manage().window().maximize(); // maximize browser window
	      driver.get("https://www.facebook.com/"); // open Facebook website
	      getScreenshot("login page"); // call screenshot method and pass file name
	      System.out.println("Screenshot printed"); // print confirmation in console
	}

    public static void getScreenshot(String filename) throws IOException
 // public → method can be accessed from anywhere
 // static → can be called without creating an object of the class
 // void → method does not return any value
 // getScreenshot → method name used to capture screenshot
 // (String filename) → parameter to receive screenshot file name
 // throws IOException → handles file input/output exceptions during file copy
    {
	       TakesScreenshot t = (TakesScreenshot)driver; 
	       // convert WebDriver into TakesScreenshot

	       File srcfile =t.getScreenshotAs(OutputType.FILE); 
	       // capture screenshot and store in temporary file

	       FileUtils.copyFile(srcfile, new File("C:\\Users\\nagil\\OneDrive\\Pictures\\"+filename+".jpg")); 
	       // copy screenshot to the given location with filename
    }
}