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

public class unitgrouptest {


//
//
//   // WebDriver driver = new ChromeDriver();
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

//    void launchBrowser()
//    {
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
    public void ClickOnTheUnitGroupTest() throws IOException, InterruptedException
    {
        unitgroup unitgroup=new unitgroup(driver);
        unitgroup.enterUsername("discretalfms@gmail.com");
        unitgroup.enterPassword("Leader@123");
        unitgroup.clickLogin();
        Thread.sleep(1000);
        unitgroup.clickOnSetting();
        Thread.sleep(1000);
        unitgroup.clickOnTheunitgroup();

    }


    @Test
    public void CreateTheUnitGroupTest() throws IOException, InterruptedException
    {
        unitgroup unitgroup=new unitgroup(driver);
        unitgroup.enterUsername("discretalfms@gmail.com");
        unitgroup.enterPassword("Leader@123");
        unitgroup.clickLogin();
        Thread.sleep(1000);
        unitgroup.clickOnSetting();
        Thread.sleep(1000);
        unitgroup.clickOnTheunitgroup();
        Thread.sleep(1000);
        unitgroup.clickOnCreateTheunitgroup();
        Thread.sleep(1000);
        unitgroup.EnterTheNameunitgroup("BENGULLAR3");
        Thread.sleep(1000);
        unitgroup.ClickOnTheSave();
    }


    @Test
    public void EditTheUnitGroupTest() throws IOException, InterruptedException
    {
        unitgroup unitgroup=new unitgroup(driver);
        unitgroup.enterUsername("discretalfms@gmail.com");
        unitgroup.enterPassword("Leader@123");
        unitgroup.clickLogin();
        Thread.sleep(1000);
        unitgroup.clickOnSetting();
        Thread.sleep(1000);
        unitgroup.clickOnTheunitgroup();
        Thread.sleep(1000);
unitgroup.ClickOnTheEdit();
        Thread.sleep(1000);
        unitgroup.ClickOnTheClearField();
       // driver.navigate().refresh();
        Thread.sleep(2000);
        unitgroup.ClickOnTheSave();

       }

    @Test
    public void SearchTheUnitGroupTest() throws IOException, InterruptedException {
        unitgroup unitgroup = new unitgroup(driver);
        unitgroup.enterUsername("discretalfms@gmail.com");
        unitgroup.enterPassword("Leader@123");
        unitgroup.clickLogin();
        Thread.sleep(1000);
        unitgroup.clickOnSetting();
        Thread.sleep(1000);
        unitgroup.clickOnTheunitgroup();
        Thread.sleep(1000);
unitgroup.SerachTheUnit("BENGULLAR");

    }


    @Test
    public void DeleteTheUnitGroupTest() throws IOException, InterruptedException {
        unitgroup unitgroup = new unitgroup(driver);
        unitgroup.enterUsername("discretalfms@gmail.com");
        unitgroup.enterPassword("Leader@123");
        unitgroup.clickLogin();
        Thread.sleep(1000);
        unitgroup.clickOnSetting();
        Thread.sleep(1000);
        unitgroup.clickOnTheunitgroup();
        Thread.sleep(1000);
        unitgroup.DeleteTheUnit();
        Thread.sleep(1000);
//unitgroup.ClickOnTheRemove();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }



    }
