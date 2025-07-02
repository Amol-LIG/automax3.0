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

public class accounttest {


//
//
//    //WebDriver driver = new ChromeDriver();
//
//   public  WebDriver driver ;
//   public WebDriverWait wait;
////    ExtentReports extent;
////   ExtentTest test;
//
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
    public void ClickOnTheAccountTest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);

    }



    @Test
    public void ClickOnTheEnableMFATest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
account.ClickOnTheEnablemfa();


    }


    @Test
    public void ClickOnThePrefrenceTest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
account.ClickOnThePrefrence();
        Thread.sleep(1000);
        account.ClickOnTheSave();

    }

    @Test
    public void ClickOnTheLocationTest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
account.ClickOnTheLocation();
        Thread.sleep(1000);
        account.ClickOnTheSave();

    }

    @Test
    public void ClickOnThePermissonTest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        account.ClickOnThePermissons();
        Thread.sleep(1000);
        account.ClickOnTheSave();

    }

    @Test
    public void ClickOnTheAttributeTest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        account.ClickOnTheAttribute();
        Thread.sleep(1000);
        account.ClickOnTheSave();

    }

    @Test
    public void ClickOnTheConnectionsTest() throws IOException, InterruptedException {
        account account=new account(driver);
        account.enterUsername("discretalfms@gmail.com");
        account.enterPassword("Leader@123");
        account.clickLogin();
        Thread.sleep(1000);
        account.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(2) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        account.ClickOnTheConnections();
        Thread.sleep(1000);
        account.ClickOnTheSave();

    }




    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
















