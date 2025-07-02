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

public class settingtest {

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
    public void ClickOnTheSettingTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();

        Thread.sleep(1000);
setting.clickOnSetting();
    }

    @Test
    public void ClickOnThePrefrenceTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
setting.clickOnTheRefreshToken();
    }

    @Test
    public void ClickOnTheMapTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.clickOnTheMap();
    }

    @Test
    public void ClickOnTheActiveMapTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.clickOnTheMap();
        Thread.sleep(1000);
setting.clickOnTheActiveMap();
    }
    @Test
    public void ClickOnTheMapOverlayTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.clickOnTheMap();
        Thread.sleep(1000);
setting.clickOnTheMapOverlay();
    }
    @Test
    public void SeeTheLivePathTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.clickOnTheMap();
        Thread.sleep(1000);
setting.clickOnTheLivePath();
    }
    @Test
    public void SelectShowDirectionTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.clickOnTheMap();
        Thread.sleep(1000);
setting.clickOnTheShowDirection();
        Thread.sleep(1000);
        setting.SelectTheShowDirection();
    }
    @Test
    public void ClickOnTheDeviceManagmentTest() throws IOException, InterruptedException
    {
        setting setting=new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.ClickonTheDeviceManagment();
        Thread.sleep(1000);
        setting.ClickonTheDeviceDetail();
        Thread.sleep(1000);
setting.SelectTheDeviceDetail();
        Thread.sleep(1000);

        setting.ClickonTheDeviceTitle();
        Thread.sleep(1000);
        setting.SelectTheDevicTitle();
        Thread.sleep(1000);

    }
    @Test
    public void ClickOnTheNotificationSoundTest() throws IOException, InterruptedException {
        setting setting = new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.ClickOnTheSoundNotification();
        Thread.sleep(1000);

    }
    @Test
    public void SelectTheSoundEventAndSoundAlarmTest() throws IOException, InterruptedException {
        setting setting = new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.ClickOnTheSoundNotification();
        Thread.sleep(1000);
//   setting.ClickOnTheSoundAlarm();
//        Thread.sleep(1000);
//     setting.SelectTheSoundAlarm();
//        Thread.sleep(1000);
//        setting.ClickOnTheSoundEvent();
//        Thread.sleep(1000);
//setting.SelectOnTheSoundEvent();
//        Thread.sleep(1000);
//        setting.AgainClickOnTheNotification();
        //driver.navigate().refresh();
    }

    @Test
    public void SeeTheInfoTest() throws IOException, InterruptedException {
        setting setting = new setting(driver);

        setting.enterUsername("discretalfms@gmail.com");
        setting.enterPassword("Leader@123");
        setting.clickLogin();
        Thread.sleep(1000);
        setting.clickOnSetting();
        Thread.sleep(1000);
        setting.clickOnTheRefreshToken();
        Thread.sleep(1000);
        setting.ClickOnTheInfo();
        Thread.sleep(1000);
        setting.ClickOnTheSave();
        }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }


}
