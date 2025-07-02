package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class reportstest {



//
//
//    //WebDriver driver = new ChromeDriver();
//
//   public  WebDriver driver ;
//   public WebDriverWait wait;
////    ExtentReports extent;
////   ExtentTest test;
////


protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leader-fms.discretal.com");
    }
//    void launchBrowser() {
//        WebDriverManager.chromedriver().setup();
//
//
//       System.out.println("Chrome binary: " + System.getProperty("webdriver.chrome.driver"));
//
//
//        // Set Chrome options for headless mode
//        ChromeOptions options = new ChromeOptions();
//       options.addArguments("--headless");
//       options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
//        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model
//
//
//
//        // Initialize driver with Chrome options
//        driver = new ChromeDriver(options);
//
//
//
//        driver.manage().window().maximize();
//        driver.get("https://leader-fms.discretal.com/login/");
//
//
//    }
//
//
//    @BeforeMethod
//    public void setup() {
////        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
////        extent = new ExtentReports();
////        extent.attachReporter(sparkReporter);
////
////        test = extent.createTest("LoginTest", "Verifying login functionality");
//        launchBrowser();
//    }


    @Test
    public void ClickOnTheReportsTest() throws IOException, InterruptedException {
        reports reports=new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);

    }

    @Test
    public void SeeTheCombinedReportsTest() throws IOException, InterruptedException {
        reports reports=new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);
        reports.clickOnTheDeviceManagment();
        Thread.sleep(1000);
        reports.SelectTheDeviceManagment();
        Thread.sleep(1000);
        reports.AgainclickOnTheDeviceManagment();
        Thread.sleep(1000);
reports.clickOnUnitGroup();
        Thread.sleep(1000);
        reports.SelectTheUnitGroup();
        Thread.sleep(1000);
        reports.AgainclickOnTheDeviceManagment();
        Thread.sleep(1000);
        reports.clickOnTheCreatedTime();
        Thread.sleep(1000);
        reports.SelectTheCreatedTime();
        Thread.sleep(1000);
        reports.ClickOnTheShow();

    }

    @Test
    public void SeeTheRouteReportsTest() throws IOException, InterruptedException {
        reports reports=new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);
        reports.ClickOnTheRouteReports();
        Thread.sleep(1000);

        reports.clickOnTheDeviceManagment();
        Thread.sleep(1000);

        reports.SelectTheDeviceManagment();
        Thread.sleep(1000);
        reports.AgainclickOnTheDeviceManagment();
        Thread.sleep(1000);
       reports.AgainClickCreatedTheTime();
        Thread.sleep(1000);
        reports.AgainSelectTheTime();


        Thread.sleep(1000);
        reports.ClickOnTheShow();


    }


    @Test
    public void SeeTheEventReportsTest() throws IOException, InterruptedException {
        reports reports = new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);
        reports.ClickOnTheEventReport();
        Thread.sleep(1000);
        reports.ClickOnTheDevice();
        Thread.sleep(1000);
        reports.SelectOnTheDevice();
        Thread.sleep(1000);
        reports.ClickOnTheEventTime();
        Thread.sleep(1000);
        reports.SelectOnTheEventTime();
        Thread.sleep(1000);
        reports.ClickOnTheShow();
    }


    @Test
    public void SeeThePeriodOfPresenceReportsTest() throws IOException, InterruptedException {
        reports reports = new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);
        reports.ClickOnThePresenceofPeriodReport();
        Thread.sleep(1000);
        reports.ClickOnTheDevice();
        Thread.sleep(1000);
        reports.SelectOnTheDevice();
        Thread.sleep(1000);
        reports.ClickOnTheEventTime();
        Thread.sleep(1000);
        reports.SelectOnTheEventTime();
        Thread.sleep(1000);
        reports.ClickOnTheShow();

    }

    @Test
    public void SeeTheContainersEventReportsTest() throws IOException, InterruptedException {
        reports reports = new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);
        reports.ClickOnTheContainerEventReport();
        Thread.sleep(1000);
        reports.ClickOnTheDevice();
        Thread.sleep(1000);
        reports.SelectOnTheDevice();
        Thread.sleep(1000);
        reports.ClickOnTheEventTime();
        Thread.sleep(1000);
        reports.SelectTheContainerTime();
        Thread.sleep(1000);
        reports.ClickOnTheShow();

    }

    @Test
    public void SeeTheContainerStatusReportsTest() throws IOException, InterruptedException {
        reports reports = new reports(driver);

        reports.enterUsername("discretalfms@gmail.com");
        reports.enterPassword("Leader@123");
        reports.clickLogin();
        Thread.sleep(2000);
        reports.clickOnTheReports();
        Thread.sleep(1000);
        reports.ClickOnTheContainerStatusReport();
        Thread.sleep(1000);
        reports.ClickOnTheZones();
        Thread.sleep(1000);
        reports.SelectOnTheZones();
        Thread.sleep(1000);
        reports.AgainclickOnTheDeviceManagment();
        Thread.sleep(1000);
       reports.ClickOnTheContainerType();
        Thread.sleep(1000);
         reports.SelectOnTheContainerType();
        Thread.sleep(1000);
        reports.AgainclickOnTheDeviceManagment();
//        Thread.sleep(1000);
//        reports.ClickOnTheContainer();
//        Thread.sleep(1000);
//        reports.SelectOnTheContainer();
//        Thread.sleep(1000);
//

       // reports.AgainClickOnTheContainer();
        Thread.sleep(1000);
       // reports.ClickOnTheContainer();
        reports.ClickOnTheShow();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
