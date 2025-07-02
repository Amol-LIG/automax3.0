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

public class usermanagmenttest {

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
    public void ClickOnTheUserManagmentTest() throws IOException, InterruptedException {
        usermanagment usermanagment=new usermanagment(driver);
        usermanagment.enterUsername("discretalfms@gmail.com");
        usermanagment.enterPassword("Leader@123");
        usermanagment.clickLogin();
        Thread.sleep(1000);
        usermanagment.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(3) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);


    }


    @Test
    public void SearchTheUserManagmentTest() throws IOException, InterruptedException {
        usermanagment usermanagment=new usermanagment(driver);
        usermanagment.enterUsername("discretalfms@gmail.com");
        usermanagment.enterPassword("Leader@123");
        usermanagment.clickLogin();
        Thread.sleep(1000);
        usermanagment.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(3) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        usermanagment.SearchTheNameUserManagment("tiger");

    }


    @Test
    public void EditTheUserManagmentTest() throws IOException, InterruptedException {
        usermanagment usermanagment=new usermanagment(driver);
        usermanagment.enterUsername("discretalfms@gmail.com");
        usermanagment.enterPassword("Leader@123");
        usermanagment.clickLogin();
        Thread.sleep(1000);
        usermanagment.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(3) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        usermanagment.EditTheUserManagment();
        Thread.sleep(1000);
        usermanagment.ClickOnTheSave();

    }

    @Test
    public void DeleteTheUserManagmentTest() throws IOException, InterruptedException {
        usermanagment usermanagment=new usermanagment(driver);
        usermanagment.enterUsername("discretalfms@gmail.com");
        usermanagment.enterPassword("Leader@123");
        usermanagment.clickLogin();
        Thread.sleep(1000);
        usermanagment.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(3) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        usermanagment.DeleteTheUserManagment();



    }



    @Test
    public void CreateTheUserManagmentTest() throws IOException, InterruptedException {
        usermanagment usermanagment=new usermanagment(driver);
        usermanagment.enterUsername("discretalfms@gmail.com");
        usermanagment.enterPassword("Leader@123");
        usermanagment.clickLogin();
        Thread.sleep(1000);
        usermanagment.clickOnSetting();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(6) > div:nth-child(3) > a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        usermanagment.clickCreateOntheUserManagment();
        Thread.sleep(1000);
        usermanagment.ClickTheNameUserManagment("amolmaharashtra");
        Thread.sleep(1000);
        usermanagment.EnterTheEmail("amolleader@gmail.com");
        Thread.sleep(1000);
        usermanagment.EnterThePassword("Amol@12345");
        Thread.sleep(1000);
        usermanagment.ClickOnTheSave();
    }



    @AfterMethod
    public void teardown() {
        driver.quit();
    }


}
