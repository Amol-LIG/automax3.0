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

public class maintancetest {


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

//    void launchBrowser() {
//        WebDriverManager.chromedriver().setup();
//
////
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
    public void ClickOnTheMaintanceTest() throws IOException, InterruptedException {
        maintance maintance=new maintance(driver);
        maintance.enterUsername("discretalfms@gmail.com");
        maintance.enterPassword("Leader@123");
        maintance.clickLogin();
        Thread.sleep(1000);
        maintance.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(13) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);


    }



    @Test
    public void SearchTheMaintanceTest() throws IOException, InterruptedException {
        maintance maintance=new maintance(driver);
        maintance.enterUsername("discretalfms@gmail.com");
        maintance.enterPassword("Leader@123");
        maintance.clickLogin();
        Thread.sleep(1000);
        maintance.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(13) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
maintance.SearchTheNameMaintance("For Test");

    }




    @Test
    public void EditTheMaintanceTest() throws IOException, InterruptedException {
        maintance maintance=new maintance(driver);
        maintance.enterUsername("discretalfms@gmail.com");
        maintance.enterPassword("Leader@123");
        maintance.clickLogin();
        Thread.sleep(1000);
        maintance.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(13) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        maintance.EditTheMaintance();
        Thread.sleep(1000);
        maintance.ClickOnTheSave();
    }



    @Test
    public void DeleteTheMaintanceTest() throws IOException, InterruptedException {
        maintance maintance=new maintance(driver);
        maintance.enterUsername("discretalfms@gmail.com");
        maintance.enterPassword("Leader@123");
        maintance.clickLogin();
        Thread.sleep(1000);
        maintance.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(13) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        maintance.DeleteTheMaintance();


    }


    @Test
    public void CreateTheMaintanceTest() throws IOException, InterruptedException {
        maintance maintance=new maintance(driver);
        maintance.enterUsername("discretalfms@gmail.com");
        maintance.enterPassword("Leader@123");
        maintance.clickLogin();
        Thread.sleep(1000);
        maintance.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(13) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        maintance.clickCreateOntheMaintance();
        Thread.sleep(1000);
        maintance.ClickTheNameMaintance();
        Thread.sleep(1000);
        maintance.SelectTheMaintanceName();
        Thread.sleep(1000);
maintance.EnterTheDistance("12");
        Thread.sleep(1000);
        maintance.EnterTheMassage("For Test");
        Thread.sleep(1000);
        maintance.EnterTheDate("12-06-0020251112");
        Thread.sleep(1000);
maintance.ClickOnTheSave();

    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }






}
