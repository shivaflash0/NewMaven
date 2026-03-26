package Extentresportscheck;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreporttest {
    ExtentReports report;
    ExtentSparkReporter spark;

    public Extentreporttest() {
        // Reporter setup (run once)
        spark = new ExtentSparkReporter("ExtentReport.html");
        report = new ExtentReports();
        report.attachReporter(spark);
    }

    @Test
    public void Validation() {
        ExtentTest test = report.createTest("verify the title");

        System.out.println("Launch the browser");
        test.pass("Launching the browser success");

        System.out.println("Enter the url");
        test.pass("URL is success");

        System.out.println("Verify the title");
        test.pass("Title is correct");
    }

    @Test
    public void FBValidation() {
        ExtentTest test2 = report.createTest("verify the FB page");

        System.out.println("Launch the browser");
        test2.pass("Launching the browser success");

        System.out.println("Enter the FB url");
        test2.pass("FB URL is success");

        System.out.println("Verify the FB title");
        test2.pass("FB Title is correct");
    }

    @org.testng.annotations.AfterSuite
    public void tearDown() {
        // Flush report after all tests
        report.flush();
    }
}