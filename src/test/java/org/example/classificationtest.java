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

public class classificationtest {



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

        test = extent.createTest("classificationtest", "Verifying clickonclassification");
        launchBrowser();
    }

    @Test
    public void ClickOnClassificationTest() throws IOException, InterruptedException {
        classification classification = new classification(driver);
        classification.enterUsername("g.amol@leadergroup.com");
        classification.enterPassword("Leader@1234");
        classification.ClickShowpassword();
        classification.enterthecaptcha("tovnhf");
        classification.clickLogin();
        Thread.sleep(7000);
        classification.clicAdminArea();
        Thread.sleep(7000);
        classification.clickclassification();
        Thread.sleep(1000);
        classification.clickOnAddclassification();
        Thread.sleep(3000);
        classification.entertheclassification("electricity");
        Thread.sleep(3000);
        classification.Savetheclassification();
        extent.flush();
    }

    @Test
    public void SearchClassificationTest() throws IOException, InterruptedException {
        classification classification = new classification(driver);
        classification.enterUsername("g.amol@leadergroup.com");
        classification.enterPassword("Leader@1234");
        classification.ClickShowpassword();
        classification.enterthecaptcha("tovnhf");
        classification.clickLogin();
        Thread.sleep(7000);
        classification.clicAdminArea();
        Thread.sleep(7000);
        classification.clickclassification();
        Thread.sleep(1000);
        classification.Searchtheclassification("electricity");
        extent.flush();
    }

    @Test
    public void DeleteClassificationTest() throws IOException, InterruptedException {
        classification classification = new classification(driver);
        classification.enterUsername("g.amol@leadergroup.com");
        classification.enterPassword("Leader@1234");
        classification.ClickShowpassword();
        classification.enterthecaptcha("tovnhf");
        classification.clickLogin();
        Thread.sleep(7000);
        classification.clicAdminArea();
        Thread.sleep(7000);
        classification.clickclassification();
        Thread.sleep(1000);
        classification.Searchtheclassification("electricity");
        Thread.sleep(1000);
        classification.deletetheclassification();
        Thread.sleep(1000);
        classification.deletetheArrow();
        extent.flush();

    }


}
