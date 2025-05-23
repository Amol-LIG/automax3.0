package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class incidenttest {


    WebDriver driver = new ChromeDriver();


    void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
         driver.get("https://automax.discretal.com");
    }


    @BeforeMethod
    public void setup() {
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
        Thread.sleep(7000);
incident.clickOnTheAllIncident();
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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
incident.clickOnTheRefresh();

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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");


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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
incident.clickOnTheIVR();
        Thread.sleep(2000);
incident.clickOnTheComment();
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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.clickOnTheActionLog();
        Thread.sleep(1000);
        incident.clickOnChangeTheActionLog();
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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.clickOnChangeTheAttachment();
    }

    @Test
    public void CreateTheIncidentTest() throws IOException, InterruptedException {
        incident incident = new incident(driver);
        incident.enterUsername("g.amol@leadergroup.com");
        incident.enterPassword("Leader@1234");
        incident.ClickShowpassword();
        incident.enterthecaptcha("hbvfsw");
        incident.clickLogin();
        Thread.sleep(7000);
        incident.clickOnIms();
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.clickOnTheAddIncident();
        Thread.sleep(1000);
incident.EnterTheId("1122");
        Thread.sleep(1000);
incident.EnterTheCallerName("amol giram");
        Thread.sleep(1000);
        incident.EnterTheMobileNumber("9975801148");
        Thread.sleep(3000);
incident.EnterTheLocation("Mahrashtra");
        Thread.sleep(3000);
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
        Thread.sleep(1000);

        incident.ClickOnTheSubmit();

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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.ClickOnTheSaveandCopy();
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
        Thread.sleep(7000);
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
        Thread.sleep(3000);
incident.ClickOnSaveHigh();
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
        Thread.sleep(7000);
        incident.clickOnTheAllIncident();
        Thread.sleep(1000);
        incident.FilterTheIncident("IVR");
        Thread.sleep(1000);
        incident.clickOnTheIVR();
        Thread.sleep(2000);
        incident.ClickOnDelete();
        Thread.sleep(1000);
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
        Thread.sleep(7000);
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

    }}
