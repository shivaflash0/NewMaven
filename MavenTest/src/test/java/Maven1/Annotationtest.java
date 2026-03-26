package Maven1;

import org.testng.annotations.*;

public class Annotationtest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }
}