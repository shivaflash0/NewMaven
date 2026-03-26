package Maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestTest {

	public static void main(String[] args) throws InterruptedException {

		String textToSelect = "headlines today";
		// Text we want to select from Google auto suggestions

		WebDriver driver = new ChromeDriver();
		// Launch Chrome browser

		driver.manage().window().maximize();
		// Maximize browser window

		driver.get("https://www.google.co.in/");
		// Open Google website

		Thread.sleep(2000);
		// Wait for page to load

		WebElement autoOptions = driver.findElement(By.name("q"));
		// Locate Google search textbox

		autoOptions.sendKeys("he");
		// Type "he" so Google shows auto suggestions

		Thread.sleep(2000);
		// Wait for suggestions to appear

		List<WebElement> optionsToSelect = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		// Capture all suggestion elements from the dropdown list

		for(WebElement option : optionsToSelect)
		// Loop through each suggestion element
		{

			System.out.println(option.getText());
			// Print each suggestion text in console

			if(option.getText().equalsIgnoreCase(textToSelect))
			// Check if suggestion matches the required text
			{

				System.out.println("Trying to select: "+textToSelect);
				// Print confirmation message

				option.click();
				// Click the matched suggestion

			//	break;
				// Stop the loop after selecting the suggestion
			}
		}

	}
}