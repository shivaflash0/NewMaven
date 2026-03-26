package Allpagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import AllPages.PFM_FBloginTest;

public class PFM_LoginTest {
    public WebDriver driver;
    PFM_FBloginTest f;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test(priority=1)
    public void invalidtest() {
        f = new PFM_FBloginTest(driver);
        f.logintopage("shiva@gmail.com", "dfghjk");
    }

    @Test(priority=2)
    public void invalidtest2() {
        f = new PFM_FBloginTest(driver);
        f.logintopage("shiva22@gmail.com", "dfghjk");
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}