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

public class containerstest {

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
    public void ClickOnTheContainersTest() throws IOException, InterruptedException
    {
        containers containers=new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();

    }

    @Test
    public void CreateTheContainersTest() throws IOException, InterruptedException
    {
        containers containers=new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.clickOnTheCreateContainers();
        Thread.sleep(1000);
        containers.EnterTheIdentifier("24");
        Thread.sleep(1000);
        containers.EnterTheLatitude("3.99");
        Thread.sleep(1000);
        containers.EnterTheLongitude("3.8");
        Thread.sleep(1000);
        containers.EnterTheDistictName("kerala");
        Thread.sleep(1000);
        containers.EnterTheSerialNumber("7777");
        Thread.sleep(1000);
        containers.EnterTheTagNumber("8888");

        Thread.sleep(1000);
containers.clickOnTheContainersType();
        Thread.sleep(1000);
        containers.SelectOnTheContainersType();
        Thread.sleep(1000);
containers.ClickOnTheContractors();
        Thread.sleep(1000);
        containers.SelectTheContractors();
        Thread.sleep(1000);
        containers.ClickOnTheZones();
        Thread.sleep(1000);
containers.SelectTheZones();
        Thread.sleep(1000);
        containers.ClickOnTheSave();
    }

    @Test
    public void SeeTheContainersStatusTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheContainerStatus();
    }

    @Test
    public void EditTheContainersTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheEdit();
        Thread.sleep(1000);
        containers.ClickOnTheNanan();
        Thread.sleep(1000);
containers.SelectTheQwell();
        Thread.sleep(1000);
        containers.ClickOnTheSave();
    }

    @Test
    public void DeleteTheContainersTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.DeleteTheContainers();
        Thread.sleep(1000);
//containers.ClickOnTheRemove();
    }

    @Test
    public void ClickTheContainersLocationTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheLocation();


    }

    @Test
    public void ClickTheMovingPageTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
//containers.ClickOnTheMovingPage();


    }
    @Test
    public void SelectTheZonesTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheZZones();
        Thread.sleep(1000);
containers.SelectOnTheZZones();
        Thread.sleep(1000);
containers.ClickOnTheApply();
    }
    @Test
    public void SelectTheCreatedTimeTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheCreatedTime();
        Thread.sleep(1000);
containers.SelectOnTheCreatedTime();

    }
    @Test
    public void SearchTheContainerTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.SearchTheContainer("7777");

    }
    @Test
    public void FilterContainerTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheFilterContainer();
        Thread.sleep(1000);
containers.ClickOnTheFilterStatus();
        Thread.sleep(1000);
containers.ClickOnTheSelectFull();
        Thread.sleep(1000);
containers.ClickOnTheFilterArrow();
        Thread.sleep(1000);
        containers.AgainClickOnTheFilter();

    }

    @Test
    public void ClearFilterContainerTest() throws IOException, InterruptedException {
        containers containers = new containers(driver);
        containers.enterUsername("discretalfms@gmail.com");
        containers.enterPassword("Leader@123");
        containers.clickLogin();
        Thread.sleep(1000);
        containers.clickOnSetting();
        Thread.sleep(1000);
        containers.clickOnTheAddContainers();
        Thread.sleep(1000);
        containers.ClickOnTheFilterContainer();
        Thread.sleep(1000);
        containers.ClickOnTheFilterStatus();
        Thread.sleep(1000);
        containers.ClickOnTheSelectFull();
        Thread.sleep(1000);
        containers.ClickOnTheFilterArrow();
        Thread.sleep(1000);
        containers.AgainClickOnTheFilter();
        Thread.sleep(1000);
        containers.ClickOnTheFilterContainer();
        Thread.sleep(1000);
        containers.ClickOnTheClearFilter();


    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }




}
