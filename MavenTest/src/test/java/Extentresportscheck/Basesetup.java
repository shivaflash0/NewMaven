package Extentresportscheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basesetup {
    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentSparkReporter spark;

    @BeforeSuite
    public void setUp() {
        // WebDriverManager handles driver automatically
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Extent report setup
        spark = new ExtentSparkReporter("ExtentReport.html");
        report = new ExtentReports();
        report.attachReporter(spark);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        report.flush();
    }
}