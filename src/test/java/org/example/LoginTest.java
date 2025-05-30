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


 // WebDriver driver = new ChromeDriver();

   public  WebDriver driver ;
   public WebDriverWait wait;
    ExtentReports extent;
   ExtentTest test;


    void launchBrowser() {
        WebDriverManager.chromedriver().setup();


       System.out.println("Chrome binary: " + System.getProperty("webdriver.chrome.driver"));


        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
       options.addArguments("--headless");
       options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model



        // Initialize driver with Chrome options
        driver = new ChromeDriver(options);



        driver.manage().window().maximize();
        driver.get("https://automax.discretal.com");


    }


    @BeforeMethod
    public void setup()
    {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        test = extent.createTest("LoginTest", "Verifying login functionality");
        launchBrowser();
    }

    @Test
    public void LoginTest() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.ClickShowpassword();
        loginPage.enterthecaptcha("wytrsi");
        //loginPage.clickonForgotPasword();
        // loginPage.clickonremeberme() ;
        // loginPage.ClickOnEye();
        loginPage.clickLogin();
        extent.flush();
    }

    @Test
    public void CreateNewAccountTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickonnewaccount();
        Thread.sleep(5000);
        loginPage.Enteremail("amolgiram96@gmail.com");
        loginPage.enternewpassword("Amol@9975");
        loginPage.EnterFullName("Amol Giram");
        loginPage.clickonsubmit();
        extent.flush();
    }

    @Test
    public void UpdateProfileTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(7000);
        loginPage.clickOnProfile();
        Thread.sleep(1000);
        loginPage.ClickOnTheProfile();

        Set<String> windowIds = driver.getWindowHandles();
        for (String windowid : windowIds)
            driver.switchTo().window(windowid);
        Thread.sleep(1000);
        //loginPage.UpdateTheProfullname("giram amol");
        loginPage.SelectTheLanguage();
        Thread.sleep(1000);
      //  loginPage.SelectTheAr();
        Thread.sleep(1000);
        loginPage.SubmitTheProfile();
        extent.flush();
    }

    @Test
    public void SeeSecurityTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");
        Thread.sleep(1000);

        loginPage.clickLogin();
        Thread.sleep(7000);
        loginPage.clickOnProfile();
        Thread.sleep(1000);
        loginPage.ClickOnTheProfile();
        Thread.sleep(1000);
        Set<String> windowIds = driver.getWindowHandles();
        for (String windowid : windowIds)
            driver.switchTo().window(windowid);
        loginPage.ClickOnSecurity();
        extent.flush();
    }

    @Test
    public void SeeLoginDessionsTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(1000);
        loginPage.clickOnProfile();
        Thread.sleep(1000);
        loginPage.ClickOnTheProfile();
        Thread.sleep(1000);
        Set<String> windowIds = driver.getWindowHandles();
        for (String windowid : windowIds)
            driver.switchTo().window(windowid);
        loginPage.ClickOnLoginSession();
       extent.flush();
    }

    @Test
    public void SeeAuthorizedClientTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(1000);
        loginPage.clickOnProfile();
        Thread.sleep(1000);
        loginPage.ClickOnTheProfile();
        Thread.sleep(1000);
        Set<String> windowIds = driver.getWindowHandles();
        for (String windowid : windowIds)
            driver.switchTo().window(windowid);
        loginPage.ClickOnAuthorizedClient();
        extent.flush();
    }



    @Test
    public void ClickOnLogoutTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(7000);

        loginPage.clickOnProfile();

        Thread.sleep(7000);
        loginPage.ClickOnLogout();
        extent.flush();
    }
    @Test
    public void ChangeThemeTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(7000);
        loginPage.clickOnProfile();
        Thread.sleep(500);
        loginPage.ChangeTheme();
        Thread.sleep(500);
        //loginPage.SelectTheTheme();
        extent.flush();
    }
    // @Test
    // public void ChangePasswordTest() throws InterruptedException {

    //    LoginPage loginPage = new LoginPage(driver);
    //  loginPage.enterUsername("g.amol@leadergroup.com");
    //  loginPage.enterPassword("Leader@1234");
    //  loginPage.enterthecaptcha("wytrsi");

    //   loginPage.clickLogin();
    //  Thread.sleep(7000);
    //   loginPage.clickOnProfile();
    //  Thread.sleep(1000);
//loginPage.ClickOnChangePassword();
    // Thread.sleep(1000);
    //   Set<String> windowIds = driver.getWindowHandles();
    //   for(String windowid :windowIds)
    //  driver.switchTo().window(windowid);
    //  Thread.sleep(1000);
//
    //   loginPage.EnterTheOldPassword("Giram@9975");
//Thread.sleep(2000);
//loginPage.EnterTheNewPassword("Leader@1234");
//        Thread.sleep(1000);
//loginPage.ClickOnSubmitPassword();
    //  }


}
