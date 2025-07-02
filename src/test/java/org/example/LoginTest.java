package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
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

public class LoginTest {

//
//   WebDriver driver = new ChromeDriver();
//
////   public  WebDriver driver ;
////   public WebDriverWait wait;
//   // ExtentReports extent;
//  // ExtentTest test;
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
////
////       System.out.println("Chrome binary: " + System.getProperty("webdriver.chrome.driver"));
////
////
////        // Set Chrome options for headless mode
////        ChromeOptions options = new ChromeOptions();
////       options.addArguments("--headless");
////       options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
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
//        driver.get("https://leader-fms.discretal.com/login/");
//
//
//    }
//
//
//    @BeforeMethod
//    public void setup() {
////
////        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
////        extent = new ExtentReports();
////        extent.attachReporter(sparkReporter);
////
////        test = extent.createTest("LoginTest", "Verifying login functionality");
//        launchBrowser();
//    }

    @Test
    public void LoginTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("discretalfms@gmail.com");
        loginPage.enterPassword("Leader@123");

        loginPage.clickLogin();
         // extent.flush();
    }

    @Test
    public void InvalidLoginTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@123");

        loginPage.clickLogin();
         // extent.flush();
    }

    @Test
    public void SelectTheLanguageTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickonthelanguage();
        Thread.sleep(500);
        loginPage.Selectnthelanguage();
       // extent.flush();
    }


    @Test
    public void ResetPasswordTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.ClickResetPassword();
        Thread.sleep(1000);
        loginPage.EnterTheEmailR("discretalfms@gmail.com");
       // extent.flush();
    }


    @Test
    public void LogoutTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("discretalfms@gmail.com");
        loginPage.enterPassword("Leader@123");

        loginPage.clickLogin();
        Thread.sleep(1000);
        loginPage.ClickOnAccount();
        Thread.sleep(1000);
        loginPage.ClickOnLogout();


        //  extent.flush();
    }


    @Test
    public void EditAccountTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("discretalfms@gmail.com");
        loginPage.enterPassword("Leader@123");

        loginPage.clickLogin();
        Thread.sleep(1000);
        loginPage.ClickOnAccount();
        Thread.sleep(1000);
        loginPage.ClickOntheAccount();
        Thread.sleep(1000);
loginPage.ClickOntheSaveAccount();
        //extent.flush();
    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }




}