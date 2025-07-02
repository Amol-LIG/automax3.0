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

public class containergrouptest {

//
//
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
    public void ClickOnTheContainerGroupTest() throws IOException, InterruptedException
    {
        containergroup containergroup=new containergroup(driver);
        containergroup.enterUsername("discretalfms@gmail.com");
        containergroup.enterPassword("Leader@123");
        containergroup.clickLogin();
        Thread.sleep(1000);
        containergroup.clickOnSetting();
        Thread.sleep(1000);
        containergroup.clickOnContainergroup();

    }

    @Test
    public void CreateTheContainerGroupTest() throws IOException, InterruptedException
    {
        containergroup containergroup=new containergroup(driver);
        containergroup.enterUsername("discretalfms@gmail.com");
        containergroup.enterPassword("Leader@123");
        containergroup.clickLogin();
        Thread.sleep(1000);
        containergroup.clickOnSetting();
        Thread.sleep(1000);
        containergroup.clickOnContainergroup();
        Thread.sleep(1000);
        containergroup.ClickOnCreateContainergroup();
        Thread.sleep(1000);
containergroup.EnterTheName("arsan1");
        Thread.sleep(1000);
        containergroup.ClickOnTheSave();

    }

    @Test
    public void SearchTheContainerGroupTest() throws IOException, InterruptedException {
        containergroup containergroup = new containergroup(driver);
        containergroup.enterUsername("discretalfms@gmail.com");
        containergroup.enterPassword("Leader@123");
        containergroup.clickLogin();
        Thread.sleep(1000);
        containergroup.clickOnSetting();
        Thread.sleep(1000);
        containergroup.clickOnContainergroup();
        Thread.sleep(1000);
        containergroup.SearchTheContainerGroup("arsan1");

    }


    @Test
    public void EditTheContainerGroupTest() throws IOException, InterruptedException {
        containergroup containergroup = new containergroup(driver);
        containergroup.enterUsername("discretalfms@gmail.com");
        containergroup.enterPassword("Leader@123");
        containergroup.clickLogin();
        Thread.sleep(1000);
        containergroup.clickOnSetting();
        Thread.sleep(1000);
        containergroup.clickOnContainergroup();
        Thread.sleep(1000);
containergroup.ClickOnTheEdit();
        Thread.sleep(1000);
        containergroup.ClickOnTheSave();

    }


    @Test
    public void DeleteTheContainerGroupTest() throws IOException, InterruptedException {
        containergroup containergroup = new containergroup(driver);
        containergroup.enterUsername("discretalfms@gmail.com");
        containergroup.enterPassword("Leader@123");
        containergroup.clickLogin();
        Thread.sleep(1000);
        containergroup.clickOnSetting();
        Thread.sleep(1000);
        containergroup.clickOnContainergroup();
        Thread.sleep(1000);
        containergroup.ClickOnTheDelete();
        Thread.sleep(1000);
      //  containergroup.ClickOnTheRemove();

    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}





