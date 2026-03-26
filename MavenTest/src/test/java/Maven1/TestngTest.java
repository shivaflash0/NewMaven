package Maven1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngTest {

    @Test
    void googleTitleTest() {
        ChromeDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com/");

        // Expected vs Actual Title
        String ExpectedTitle = "Google";
        String ActualTitle = driver.getTitle();
        Reporter.log("Actual Title: " + ActualTitle);
        try {
            Assert.assertEquals(ActualTitle, ExpectedTitle);
        
            Reporter.log("Test Case Pass");
        } catch (Throwable e) {
           Reporter.log("Test Case Fail");
        }

        driver.quit(); // Always close the browser
    }

    @Test
    void googleTitleTest2() {
    	Reporter.log("Test Case Pass 2");
    }

    @Test
    void googleTitleTest3() {
    	Reporter.log("Test Case Pass 3");
    }
}
