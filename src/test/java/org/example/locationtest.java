package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class locationtest {



    //WebDriver driver = new ChromeDriver();

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

        test = extent.createTest("locationtest", "Verifying clickonlocation");
        launchBrowser();
    }

    @Test
    public void ClickOnLocationTest() throws IOException, InterruptedException {
        location location = new location(driver);
        location.enterUsername("g.amol@leadergroup.com");
        location.enterPassword("Leader@1234");
        location.ClickShowpassword();
        location.enterthecaptcha("nghyui");
        location.clickLogin();
        Thread.sleep(7000);
        location.clicAdminArea();
        Thread.sleep(1000);
        location.clickOnlocation();
        Thread.sleep(1000);
        location.Addthelocation();
        Thread.sleep(1000);
        location.AddtheNewNode("Maharashtra");
        Thread.sleep(700);
        location.ClickOnSaveNode();
extent.flush();
    }

    @Test
    public void SearchTheLocationTest() throws IOException, InterruptedException {
        location location = new location(driver);
        location.enterUsername("g.amol@leadergroup.com");
        location.enterPassword("Leader@1234");
        location.ClickShowpassword();
        location.enterthecaptcha("nghyui");

        location.clickLogin();
        Thread.sleep(7000);
        location.clicAdminArea();
        Thread.sleep(1000);
        location.clickOnlocation();
        Thread.sleep(1000);
        location.SearchTheLocation("maharashtra");
        extent.flush();
    }

    @Test
    public void DeleteTheLocationTest() throws IOException, InterruptedException {
        location location = new location(driver);
        location.enterUsername("g.amol@leadergroup.com");
        location.enterPassword("Leader@1234");
        location.ClickShowpassword();
        location.enterthecaptcha("nghyui");

        location.clickLogin();
        Thread.sleep(7000);
        location.clicAdminArea();
        Thread.sleep(1000);
        location.clickOnlocation();
        Thread.sleep(1000);
        location.SearchTheLocation("Maharashtra");
        Thread.sleep(1000);
        location.deleteTheLocation();
        Thread.sleep(1000);
        location.deleteTheLocationclickonarrow();
        extent.flush();

    }


}