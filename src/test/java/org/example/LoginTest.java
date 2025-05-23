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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.Set;

public class LoginTest {


    WebDriver driver = new ChromeDriver();


    void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://automax.discretal.com");


    }


    @BeforeMethod
    public void setup() {
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
    }

    @Test
    public void UpdateProfileTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(1000);
        loginPage.clickOnProfile();
        Thread.sleep(1000);
        loginPage.ClickOnTheProfile();

        Set<String> windowIds = driver.getWindowHandles();
        for(String windowid :windowIds)
            driver.switchTo().window(windowid);
        Thread.sleep(1000);
   //loginPage.UpdateTheProfullname("giram amol");
loginPage.SelectTheLanguage();
        Thread.sleep(1000);
loginPage.SelectTheAr();
        Thread.sleep(1000);
loginPage.SubmitTheProfile();
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
        for(String windowid :windowIds)
            driver.switchTo().window(windowid);
        loginPage.ClickOnSecurity();

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
        for(String windowid :windowIds)
            driver.switchTo().window(windowid);
        loginPage.ClickOnLoginSession();

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
        for(String windowid :windowIds)
            driver.switchTo().window(windowid);
        loginPage.ClickOnAuthorizedClient();

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
        loginPage.SelectTheTheme();
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
    }

    @Test
    public void ChangePasswordTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("g.amol@leadergroup.com");
        loginPage.enterPassword("Leader@1234");
        loginPage.enterthecaptcha("wytrsi");

        loginPage.clickLogin();
        Thread.sleep(7000);
        loginPage.clickOnProfile();
        Thread.sleep(1000);
loginPage.ClickOnChangePassword();
       Thread.sleep(1000);
        Set<String> windowIds = driver.getWindowHandles();
        for(String windowid :windowIds)
            driver.switchTo().window(windowid);
        Thread.sleep(1000);

        loginPage.EnterTheOldPassword("Giram@9975");
Thread.sleep(2000);
loginPage.EnterTheNewPassword("Leader@1234");
        Thread.sleep(1000);
loginPage.ClickOnSubmitPassword();
    }



}


























      //  @Test
      //  public void ValidloginTest() throws InterruptedException, IOException {

          //  LoginPage loginPage = new LoginPage(driver);
          //  loginPage.enterUsername("qaqc@takasolutions.com");
           // loginPage.enterPassword("QaQc@2024!");
            // loginPage.clickonForgotPasword();
            // loginPage.clickonremeberme() ;g
           // loginPage.ClickOnEye();
          // loginPage.clickLogin();

       // }


        // @AfterMethod // This method will run after each test method
        // public void tearDown() {
        //     if (driver != null) {
        //       driver.quit(); // Close the browser
        //     }

   // }
