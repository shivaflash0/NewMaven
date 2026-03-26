package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBlogin {
    WebDriver driver;

    public FBlogin(WebDriver driver) {
        this.driver = driver;
    }

    // Reliable locators
    By username = By.name("email");
    By password = By.name("pass");
    By loginbutton = By.name("login");

    public void loginhome(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginbutton).click();
    }
}