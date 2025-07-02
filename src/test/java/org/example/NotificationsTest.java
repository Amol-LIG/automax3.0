package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class NotificationsTest {


//     WebDriver driver = new ChromeDriver();
//
//    public  WebDriver driver ;
////    public WebDriverWait wait;
//    ExtentReports extent;
//   ExtentTest test;




    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leader-fms.discretal.com");
    }

//
//    void launchBrowser() {
//        WebDriverManager.chromedriver().setup();
//
////
////        System.out.println("Chrome binary: " + System.getProperty("webdriver.chrome.driver"));
////
////
////        // Set Chrome options for headless mode
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless");
////        options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
////        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
////        options.addArguments("--no-sandbox"); // Bypass OS security model
////
////
////
////        // Initialize driver with Chrome options
////        driver = new ChromeDriver(options);
////
//
//
//        driver.manage().window().maximize();
//        driver.get("https://leader-fms.discretal.com");
//
//
//    }

//
//    @BeforeMethod
//    public void setup() {
//        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(sparkReporter);
//
//        test = extent.createTest("LoginTest", "Verifying login functionality");
//        launchBrowser();
//    }


    @Test
    public void ClickOnTheNotificationTest() throws IOException, InterruptedException
    {
        Notifications notifications=new Notifications(driver);
        notifications.enterUsername("discretalfms@gmail.com");
        notifications.enterPassword("Leader@123");
notifications.clickLogin();
        Thread.sleep(2000);
        notifications.clickOnSetting();


        Thread.sleep(2000);
        notifications.clickOnNotifications();

    }

    @Test
    public void ClickCreateTheNotificationsTest() throws IOException, InterruptedException
    {
        Notifications notifications=new Notifications(driver);
        notifications.enterUsername("discretalfms@gmail.com");
        notifications.enterPassword("Leader@123");
        notifications.clickLogin();
        Thread.sleep(2000);
        notifications.clickOnSetting();
        Thread.sleep(1000);


        notifications.clickOnNotifications();
        Thread.sleep(1000);
        notifications.clickOnTheCreateNotifications();
        Thread.sleep(1000);

        notifications.clickOnTheType();
        Thread.sleep(1000);
        notifications.SelectTheType();
        Thread.sleep(1000);

        notifications.clickOnTheChaneel();
        Thread.sleep(1000);
        notifications.SelectTheChaneel();
        Thread.sleep(1000);
//
//
//        WebElement hiddenElement = driver.findElement(By.cssSelector("#root > div > div > div.jss19 > div > div.jss6 > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.bg-default.css-1u2neql"));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", hiddenElement);
//
//
//
//
//
//
//
//
//
//        notifications.AgainclickOnTheDeviceManagment();
//        Thread.sleep(1000);
//        notifications.ClickOnTheFilterArrow();
//        Thread.sleep(1000);
//       notifications.ClickOnTheFilterArrow();
//       Thread.sleep(1000);
//        notifications.AgainClickOnTheFilter();
//        Thread.sleep(1000);
//        notifications.AgainClickOnTheFilter();
//        Thread.sleep(1000);
//        notifications.ClickOnTheSave();

    }

    @Test
    public void EditNotificationsTest() throws IOException, InterruptedException
    {
        Notifications notifications=new Notifications(driver);
        notifications.enterUsername("discretalfms@gmail.com");
        notifications.enterPassword("Leader@123");
        notifications.clickLogin();
        Thread.sleep(2000);
        notifications.clickOnSetting();
        Thread.sleep(1000);


        notifications.clickOnNotifications();
        Thread.sleep(1000);
       notifications.ClickOnTheEdit();
        Thread.sleep(1000);
     notifications.clickOnTheType();
     Thread.sleep(1000);
    notifications.SelectTheType();
      Thread.sleep(1000);
notifications.ClickOnTheSave();

    }

    @Test
    public void DeleteTheNotificationsTest() throws IOException, InterruptedException
    {
        Notifications notifications=new Notifications(driver);
        notifications.enterUsername("discretalfms@gmail.com");
        notifications.enterPassword("Leader@123");
        notifications.clickLogin();
        Thread.sleep(1000);
        notifications.clickOnSetting();
        Thread.sleep(1000);


        notifications.clickOnNotifications();
        Thread.sleep(1000);
        notifications.ClickOnTheDeleteNotification();
        Thread.sleep(1000);
//notifications.ClickOnTheRemove();

    }


    @AfterMethod
    public void teardown() {
            driver.quit();
        }
    }












