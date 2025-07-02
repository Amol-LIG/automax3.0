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
import java.util.Set;

public class containertypetest {


//    WebDriver driver = new ChromeDriver();
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
    public void ClickOnTheContainerTypeTest() throws IOException, InterruptedException {
        containertype containertype = new containertype(driver);
        containertype.enterUsername("discretalfms@gmail.com");
        containertype.enterPassword("Leader@123");
        containertype.clickLogin();
        Thread.sleep(1000);
        containertype.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);


    }


    @Test
    public void CreateTheContainerTypeTest() throws IOException, InterruptedException {
        containertype containertype = new containertype(driver);
        containertype.enterUsername("discretalfms@gmail.com");
        containertype.enterPassword("Leader@123");
        containertype.clickLogin();
        Thread.sleep(1000);
        containertype.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);

        Thread.sleep(1000);
        containertype.clickCreateOnContainerType();
        Thread.sleep(1000);
        containertype.EnterTheNameContainerType("Commercial Container");
        Thread.sleep(1000);
        containertype.ClickOnTheSave();
    }


    @Test
    public void SearchTheContainerTypeTest() throws IOException, InterruptedException {
        containertype containertype = new containertype(driver);
        containertype.enterUsername("discretalfms@gmail.com");
        containertype.enterPassword("Leader@123");
        containertype.clickLogin();
        Thread.sleep(1000);
        containertype.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);

        Thread.sleep(1000);
        containertype.SearchTheNameContainerType("Commercial Container");


    }


    @Test
    public void EditTheContainerTypeTest() throws IOException, InterruptedException {
        containertype containertype = new containertype(driver);
        containertype.enterUsername("discretalfms@gmail.com");
        containertype.enterPassword("Leader@123");
        containertype.clickLogin();
        Thread.sleep(1000);
        containertype.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);

        Thread.sleep(1000);
        containertype.EditTheContainerType();
        Thread.sleep(1000);
        containertype.ClickOnTheSave();

    }

    @Test
    public void DeleteTheContainerTypeTest() throws IOException, InterruptedException {
        containertype containertype = new containertype(driver);
        containertype.enterUsername("discretalfms@gmail.com");
        containertype.enterPassword("Leader@123");
        containertype.clickLogin();
        Thread.sleep(1000);
        containertype.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);

        Thread.sleep(1000);
containertype.DeleteTheContainerType();

    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }


}