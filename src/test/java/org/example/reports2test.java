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

public class reports2test {

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
    public void SeeTheTripsReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);
        reports2.clickOnTheTripsReports();
        Thread.sleep(1000);
        reports2.clickOnTheDevice();
        Thread.sleep(1000);
        reports2.SelectOnTheDevice();
        Thread.sleep(1000);
        reports2.ClickOnTheTime();
        Thread.sleep(1000);
        reports2.SelectOnTheTime();
        Thread.sleep(1000);
        reports2.ClickOnTheShow();

    }

    @Test
    public void SeeTheStopsReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        reports2.clickOnTheDevice();
        Thread.sleep(1000);
        reports2.SelectOnTheDevice();
        Thread.sleep(1000);
        reports2.ClickOnTheTime();
        Thread.sleep(1000);
        reports2.SelectOnTheTime();
        Thread.sleep(1000);
        reports2.ClickOnTheShow();
    }

    @Test
    public void SeeTheVechileReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(8) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        reports2.ClickOnTheUnitGroup();
        Thread.sleep(1000);
        reports2.SelectTheUnitGroup();
        Thread.sleep(1000);
        reports2.AgainclickOnTheDeviceManagment();

        Thread.sleep(1000);
        reports2.CClickOnTheTime();
        Thread.sleep(1000);
        reports2.SelectTTime();
//        Thread.sleep(1000);
//        reports2.ClickOnTheSummery();
//        Thread.sleep(1000);
//
//
//        reports2.SelectTheSummery();
//        reports2.AgainclickOnTheDeviceManagment();
//        Thread.sleep(1000);
        reports2.ClickOnTheShow();

    }
    @Test
    public void SeeTheSummeryReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(10) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        reports2.ClickOnTheUnitGroup();
        Thread.sleep(1000);
        reports2.SelectTheUnitGroup();
        Thread.sleep(1000);
        reports2.AgainclickOnTheDeviceManagment();

  Thread.sleep(1000);
        reports2.CClickOnTheTime();
        Thread.sleep(1000);
        reports2.SelectTTime();
//        Thread.sleep(1000);
//        reports2.ClickOnTheSummery();
//        Thread.sleep(1000);
//
//
//        reports2.SelectTheSummery();
//        reports2.AgainclickOnTheDeviceManagment();
//        Thread.sleep(1000);
        reports2.ClickOnTheShow();

    }

    @Test
    public void SeeTheChartReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(11) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        reports2.clickOnTheDevice();
        Thread.sleep(1000);
        reports2.SelectOnTheDevice();
        Thread.sleep(1000);
        reports2.ClickOnTheTime();
        Thread.sleep(1000);
        reports2.SelectOnTheTime();
        Thread.sleep(1000);
        reports2.ClickOnTheShow();


    }

    @Test
    public void SeeTheReplayReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(12) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        reports2.clickOnTheDevice();
        Thread.sleep(1000);
        reports2.SelectOnTheDevice();
        Thread.sleep(1000);
        reports2.ClickOnTheTime();
        Thread.sleep(1000);
        reports2.SelectOnTheTime();
        Thread.sleep(1000);
        reports2.ClickOnTheShow();
    }


    @Test
    public void SeeTheLogReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(5) > div:nth-child(1) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
    }

    @Test
    public void SeeTheScheduleReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(5) > div:nth-child(2) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
    }

    @Test
    public void SeeTheStasticsReportsTest() throws IOException, InterruptedException {
        reports2 reports2 = new reports2(driver);

        reports2.enterUsername("discretalfms@gmail.com");
        reports2.enterPassword("Leader@123");
        reports2.clickLogin();
        Thread.sleep(2000);
        reports2.clickOnTheReports();
        Thread.sleep(1000);

        WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(5) > div:nth-child(3) > a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        Thread.sleep(1000);
        reports2.clickOnTheDevice();
        Thread.sleep(1000);
        reports2.SelectOnTheDevice();
        Thread.sleep(1000);
          reports2.ClickOnTheShow();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}





