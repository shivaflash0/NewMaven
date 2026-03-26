package Maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select10thSuggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); 
		// Launch Chrome browser

		driver.manage().window().maximize(); 
		// Maximize browser window

		driver.get("https://www.google.co.in/"); 
		// Open Google website

		Thread.sleep(2000); 
		// Wait for page to load

		WebElement searchBox = driver.findElement(By.name("q")); 
		// Locate Google search box

		searchBox.sendKeys("Top 10 News"); 
		// Type search text to trigger auto suggestions

		Thread.sleep(2000); 
		// Wait for suggestions to appear

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li")); 
		// Capture all auto suggestion elements

		System.out.println("Total suggestions: " + suggestions.size()); 
		// Print total number of suggestions

		WebElement tenthSuggestion = suggestions.get(9); 
		// Select the 10th suggestion (index starts from 0)

		System.out.println("Selecting: " + tenthSuggestion.getText()); 
		// Print the text of 10th suggestion

		tenthSuggestion.click(); 
		// Click the 10th suggestion

	}
}