package Maven1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onlinepngtools.com/convert-jpg-to-png");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/nagil/OneDrive/Pictures/Lion.jpg"); without autoIT approach
		driver.findElement(By.xpath("//div[@id='tour-input']//canvas[@class='preview']")).click();
		Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\2026\\Fileuploader1.exe");
		System.out.println("File uploaded successfully");
	}

}
