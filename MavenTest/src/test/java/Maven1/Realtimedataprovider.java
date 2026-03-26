package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Realtimedataprovider {
    
    @Test (dataProvider = "loginData")
    public void logincheck( String user, String pass)
       {
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open Facebook
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys(user);
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.name("login")).click();  
        driver.quit();
    }
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"testuser1@gmail.com", "password1"},
            {"testuser2@gmail.com", "password2"}
        };
    }

}
