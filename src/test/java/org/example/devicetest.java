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

public class devicetest {
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
    public void AddDeviceTest() throws IOException, InterruptedException {
        device device=new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
device.clickLogin();
Thread.sleep(1000);
device.clickOnAdddevice();
        Thread.sleep(1000);
device.enterdevicename("OBD-1");
        Thread.sleep(500);
device.enterIdentifier("86371906029161");
        Thread.sleep(500);

device.enterPlateNumber("ABC-3356");
        Thread.sleep(500);
device.enterChassisNumber("77345");
        Thread.sleep(500);
device.clickOnContractor();
        Thread.sleep(500);
device.SelectOnContractor();
        Thread.sleep(500);
device.ClickOnSave();

        //  extent.flush();
    }

    @Test
    public void EditDeviceTest() throws IOException, InterruptedException {
        device device=new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
device.SelectTheOBD();
        Thread.sleep(1000);
device.ClickOnEdit();
        Thread.sleep(500);
device.clickOnContractor();
        Thread.sleep(500);
device.SelectTheQwell();
        Thread.sleep(500);

        device.ClickOnSave();

        //  extent.flush();
    }

    @Test
    public void CommandOnDeviceTest() throws IOException, InterruptedException {
        device device=new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
        device.SelectTheOBD();
        Thread.sleep(1000);
       device.ClickOnCommand();
        Thread.sleep(1000);
device.ClickOnTypeCommand();
        Thread.sleep(1000);
device.SelectTypeCommand();
        Thread.sleep(1000);
device.ClickOntheSend();
        //  extent.flush();
    }

    @Test
    public void ViewReplyDeviceTest() throws IOException, InterruptedException {
        device device=new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
device.ClickOntheOBD2();
        Thread.sleep(500);
device.ClickOntheReply();


        //  extent.flush();
    }


    @Test
    public void DeleteDeviceTest() throws IOException, InterruptedException {
        device device=new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
        device.SelectTheOBD();
        Thread.sleep(1000);
        device.ClickOnDeleteDevice();
        Thread.sleep(1000);
//device.ClickOnRemove();
        //  extent.flush();
    }
    @Test
    public void SearchDeviceTest() throws IOException, InterruptedException {
        device device = new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
        device.SearchTheDevice("OBD-1");


    }

    @Test
    public void FilterDeviceTest() throws IOException, InterruptedException {
        device device = new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
device.ClickOnTheFilter();
        Thread.sleep(500);
device.ClickOnTheStatus();
        Thread.sleep(500);
        device.SelectOnTheStatus();
        Thread.sleep(500);
device.ClickOnTheStatusArrow();
        Thread.sleep(500);

device.AgainClickOnTheFilter();
    }

    @Test
    public void ClickOnDeviceTest() throws IOException, InterruptedException {
        device device = new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
        device.ClickDeviceEvent();


    }
    @Test
    public void ClickOnLocationIQTest() throws IOException, InterruptedException {
        device device = new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
        device.ClickOnTheLocationIQStreet();
        Thread.sleep(1000);
        device.SelectOpenStreet();
    }
    @Test
    public void ClickOnMapViewTest() throws IOException, InterruptedException {
        device device = new device(driver);
        device.enterUsername("discretalfms@gmail.com");
        device.enterPassword("Leader@123");
        device.clickLogin();
        Thread.sleep(1000);
        device.ClickOnTheMapView();
          }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
