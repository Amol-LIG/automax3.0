package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class zonestest {

//    // WebDriver driver = new ChromeDriver();
//
//    public  WebDriver driver ;
//    public WebDriverWait wait;
////    ExtentReports extent;
////   ExtentTest test;
//

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
//        System.out.println("Chrome binary: " + System.getProperty("webdriver.chrome.driver"));
//
//
//        // Set Chrome options for headless mode
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
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
    public void ClickOnTheZonesTest() throws IOException, InterruptedException
    {
        zones zones=new zones(driver);
        zones.enterUsername("discretalfms@gmail.com");
        zones.enterPassword("Leader@123");
        zones.clickLogin();
        Thread.sleep(1000);
        zones.clickOnSetting();
        Thread.sleep(2000);
        zones.clickOnTheZones();

    }

    @Test
    public void EditTheZonesTest() throws IOException, InterruptedException
    {
        zones zones=new zones(driver);
        zones.enterUsername("discretalfms@gmail.com");
        zones.enterPassword("Leader@123");
        zones.clickLogin();
        Thread.sleep(1000);
        zones.clickOnSetting();
        Thread.sleep(1000);
        zones.clickOnTheZones();
        Thread.sleep(1000);
zones.clickOnTheEditZones();
        Thread.sleep(1500);
        zones.ClickOnTheSave();
    }


    @Test
    public void DeleteTheZonesTest() throws IOException, InterruptedException
    {
        zones zones=new zones(driver);
        zones.enterUsername("discretalfms@gmail.com");
        zones.enterPassword("Leader@123");
        zones.clickLogin();
        Thread.sleep(1000);
        zones.clickOnSetting();
        Thread.sleep(1000);
        zones.clickOnTheZones();
        Thread.sleep(1000);
        zones.ClickOnTheDelete();
        Thread.sleep(1500);
     //   zones.ClickOnTheRemove();
    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }







}
