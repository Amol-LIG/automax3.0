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

public class devicemanagmenttest {


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

//
//
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
    public void ClickOnTheDeviceManagmentTest() throws IOException, InterruptedException
    {
        devicemanagment devicemanagment=new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();

    }

    @Test
    public void CreateTheDeviceManagmentTest() throws IOException, InterruptedException
    {
        devicemanagment devicemanagment=new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(2000);
        devicemanagment.clickOnTheCreateDeviceManagment();
        Thread.sleep(1000);
devicemanagment.EnterTheName("Navetestt");
        Thread.sleep(1000);
devicemanagment.EnterTheIdentifier("1929394855");
        Thread.sleep(1000);
        devicemanagment.EnterThePlateNumber("SDC-8856");
        Thread.sleep(1000);
devicemanagment.EnterTheChasisNumber("4561278");
        Thread.sleep(1000);
        devicemanagment.clickOnContractor();
        Thread.sleep(1000);
devicemanagment.SelectOnContractor();
        Thread.sleep(1000);
devicemanagment.ClickOnSave();

    }

    @Test
    public void SeeTheDeviceManagmentStatusTest() throws IOException, InterruptedException {
        devicemanagment devicemanagment = new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(1000);
        devicemanagment.ClickOnSeeStatus();
    }


    @Test
    public void EditTheDeviceManagmentTest() throws IOException, InterruptedException {
        devicemanagment devicemanagment = new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(1000);
devicemanagment.ClickOnEditTheDeviceManagment();
        Thread.sleep(1000);
devicemanagment.clickOnContractor();
        Thread.sleep(1000);
devicemanagment.SelectTheQwell();
        Thread.sleep(1000);
devicemanagment.ClickOnSave();

    }

    @Test
    public void SearchTheDeviceManagmentTest() throws IOException, InterruptedException {
        devicemanagment devicemanagment = new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(1000);
    devicemanagment.SearchTheDevice("Navetestt");
    }

    @Test
    public void FilterTheDeviceTest() throws IOException, InterruptedException {
        devicemanagment devicemanagment = new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(1000);
devicemanagment.ClickOnTheFilter();
        Thread.sleep(1000);
        devicemanagment.ClickTheFilterStatus();
        Thread.sleep(1000);
devicemanagment.SelectTheFilterStatus();
        Thread.sleep(1000);
        devicemanagment.ClickOnTheFilterArrow();
        Thread.sleep(1000);
devicemanagment.AgainClickOnTheFilter();

    }


    @Test
    public void ClearFilterTheDeviceTest() throws IOException, InterruptedException {
        devicemanagment devicemanagment = new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(1000);
        devicemanagment.ClickOnTheFilter();
        Thread.sleep(1000);
        devicemanagment.ClickTheFilterStatus();
        Thread.sleep(1000);
        devicemanagment.SelectTheFilterStatus();
        Thread.sleep(1000);
        devicemanagment.ClickOnTheFilterArrow();
        Thread.sleep(1000);
        devicemanagment.AgainClickOnTheFilter();
        Thread.sleep(1000);
        devicemanagment.ClickOnTheFilter();
        Thread.sleep(1000);
devicemanagment.ClickOnTheClearFilter();
        Thread.sleep(1000);
        devicemanagment.AgainClickOnTheFilter();

    }


    @Test
    public void DeleteTheDeviceTest() throws IOException, InterruptedException {
        devicemanagment devicemanagment = new devicemanagment(driver);

        devicemanagment.enterUsername("discretalfms@gmail.com");
        devicemanagment.enterPassword("Leader@123");
        devicemanagment.clickLogin();
        Thread.sleep(1000);
        devicemanagment.clickOnSetting();
        Thread.sleep(1000);
        devicemanagment.clickOnTheDeviceManagment();
        Thread.sleep(1000);
devicemanagment.ClickOnTheDeleteDevice();
        Thread.sleep(1000);
        //devicemanagment.ClickOnTheRemove();
    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }



}
