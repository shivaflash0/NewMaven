package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEtest2 {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement Createaccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
			Createaccount.click();
			WebElement radiobuttongender= driver.findElement(By.className("_58mt"));
			System.out.println("Radio button gender test " +radiobuttongender.isSelected());
			WebElement signupbutton = driver.findElement(By.name("websubmit"));
			Dimension d= signupbutton.getSize();
			System.out.println("height & width of the submit button= " +d.getHeight()+ " " +d.getWidth());
			Point p= signupbutton.getLocation();
			System.out.println("X & Y location of the submit button= " +p.getX()+ " " +p.getY());
			driver.quit();
	}

}
