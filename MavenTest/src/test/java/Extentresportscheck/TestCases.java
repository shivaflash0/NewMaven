package Extentresportscheck;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

public class TestCases extends Basesetup {

    @Test
    public void verifyTitle() {
        ExtentTest test = report.createTest("Verify Google Title");

        driver.get("https://www.google.com");
        String title = driver.getTitle();

        if (title.contains("Google")) {
            test.pass("Google title verified successfully");
        } else {
            test.fail("Google title verification failed");
        }
    }

    @Test
    public void verifyFBTitle() {
        ExtentTest test = report.createTest("Verify Facebook Title");

        driver.get("https://www.facebook.com");
        String title = driver.getTitle();

        if (title.contains("Facebook")) {
            test.pass("Facebook title verified successfully");
        } else {
            test.fail("Facebook title verification failed");
        }
    }
}