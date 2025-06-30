package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class incidenttest {



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

        test = extent.createTest("clickincidenttest", "Verifying clickonincident");
        launchBrowser();
    }

    @Test
    public void InvalidCredentialTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("amolgiram96@gmail.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
    }


    @Test
    public void ClickOnincidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
       // Thread.sleep(1000);
      //  incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        extent.flush();

    }

    @Test
    public void RefreshincidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
        Thread.sleep(1000);
       // incident.clickOnVDIMS();
       // Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.clickOnTheRefresh();
        extent.flush();

    }

    @Test
    public void SearchincidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
       // Thread.sleep(1000);
       // incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        extent.flush();


    }

    @Test
    public void SeegeneralandCommentInfoTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
      //  Thread.sleep(1000);
       // incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.clickOnTheComment();
        extent.flush();

    }

    @Test
    public void SeeTheActionLogTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
        //Thread.sleep(1000);
       // incident.clickOnVDIMS();
        Thread.sleep(3000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.clickOnTheActionLog();
     //   Thread.sleep(1000);
     //  incident.clickOnChangeTheActionLog();
        extent.flush();

    }

    @Test
    public void SeeTheAttachmentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
       // Thread.sleep(1000);
        //incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.clickOnChangeTheAttachment();
        extent.flush();

    }

    @Test
    public void CreateTheIncidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(3000);
        incident.clickOnIms();
        Thread.sleep(1000);
     //   incident.clickOnVDIMS();
      //  Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.clickOnTheAddIncident();
        Thread.sleep(1000);
        incident.EnterTheId("1122");
        Thread.sleep(1000);
        incident.EnterTheCallerName("amol giram");
        Thread.sleep(1000);
        incident.EnterTheMobileNumber("99758011");
        Thread.sleep(2000);
        incident.EnterTheLocation("Mahrashtra");
        Thread.sleep(2000);
        incident.EEnterTheNationalId("91");
        Thread.sleep(1000);
        incident.ClickOnTheChaneel();
        Thread.sleep(1000);
        incident.SelectTheChaneel();
        Thread.sleep(1000);
        incident.ClickOnTheCritically();
        Thread.sleep(1000);
        incident.SelectTheCritically();
        Thread.sleep(1000);
        incident.ClickOnTheClassification();
        Thread.sleep(1000);
        incident.SelectOnTheClassification();
        Thread.sleep(1000);
        incident.ClickOnTheReason();
        Thread.sleep(1000);
        incident.SelectOnTheReason();
        Thread.sleep(1000);
        incident.ClickOnTheAssignto();
        Thread.sleep(1000);
        incident.SelectOnTheAssignto();
        Thread.sleep(1000);
        incident.ClickOnTheDepartment();
        Thread.sleep(1000);
        incident.SelectOnTheDepartment();
        Thread.sleep(2000);
        incident.ClickOnTheMessage();
        Thread.sleep(2000);
        incident.ClickOnTheSubmit();
        extent.flush();

    }

    @Test
    public void SaveAsCopyIncidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
      // Thread.sleep(1000);
      //  incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.ClickOnTheSaveandCopy();
        extent.flush();

    }

    @Test
    public void EditIncidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
      //  Thread.sleep(1000);
       // incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.ClickOnEdit();
        Thread.sleep(1000);
        incident.ClickOnTheCritically();
        Thread.sleep(1000);
        incident.ClickOnTheHigh();
        Thread.sleep(2000);
        incident.ClickOnTheMessage();
        Thread.sleep(2000);
        incident.ClickOnTheSubmit();
        extent.flush();

    }

    @Test
    public void DeleteIncidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
      //  Thread.sleep(1000);
       // incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.ClickOnDelete();
        //Thread.sleep(1000);
        extent.flush();

    }

    @Test
    public void DownloadIncidentReportTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
        //Thread.sleep(1000);
       // incident.clickOnVDIMS();
        Thread.sleep(2000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.ClickDownloadReport();
        Thread.sleep(1000);
        incident.ClickOnStartDate();
        Thread.sleep(1000);
        incident.SelectTheStartDate();
        Thread.sleep(1000);
        incident.ClickOnEndDate();
        Thread.sleep(1000);
        incident.SelectTheEndDate();
        Thread.sleep(1000);
        incident.ClickOnTheFormat();
        Thread.sleep(1000);

        incident.SelectTheFormat();
        Thread.sleep(1000);
        incident.ClickOnTheDownloadReport();
extent.flush();
    }
}
