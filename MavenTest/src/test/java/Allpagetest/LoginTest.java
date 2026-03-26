package Allpagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import AllPages.FBlogin;

public class LoginTest {
    FBlogin p;
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void Invoidlogintest() {
        p = new FBlogin(driver);
        p.loginhome("Shivanagilla@gmail", "sdfghjkooiuytr");
    }

  /*  @AfterMethod
    public void close() {
        driver.quit();
    }*/
}