package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class adminareatest {



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



         //nitialize driver with Chrome options
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

        test = extent.createTest("adminareatest", "Verifying clickonuser");
        launchBrowser();
    }
    @Test
    public void ClicklonuserTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");
        Thread.sleep(1000);

        adminarea.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(300);

        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        extent.flush();

    }

    @Test
    public void FilteruserTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(7000);
        adminarea.clicAdminArea();
        Thread.sleep(2000);
        adminarea.ClickOnUser();
        Thread.sleep(2000);
        adminarea.FilterTheUser("amol");
        extent.flush();

    }
    @Test
    public void AvatorSettingUpdateTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(1000);
        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        Thread.sleep(1000);
        adminarea.FilterTheUser("amol");
        Thread.sleep(1000);
        adminarea.DeleteUser();
        Thread.sleep(1000);
        adminarea.ClickOnAvator();
        Thread.sleep(300);
        adminarea.ClickOnSaveandCloseAvator();
        Thread.sleep(1000);
        adminarea.ClickOnSubmitAvator();
        extent.flush();

    }

    @Test
    public void AllowrolemembershipTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(1000);
        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        Thread.sleep(1000);
        adminarea.FilterTheUser("amol");
        Thread.sleep(1000);
        adminarea.DeleteUser();
        Thread.sleep(1000);

        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        adminarea.ClickOnAllowrole();
        Thread.sleep(1000);
        adminarea.SelecttheRole();
        Thread.sleep(1000);
        adminarea.ClickOnthesubmitRole();
        extent.flush();

    }

    @Test
    public void DeleterolemembershipTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(1000);
        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        Thread.sleep(1000);
        adminarea.FilterTheUser("amol");
        Thread.sleep(1000);
        adminarea.DeleteUser();
        Thread.sleep(1000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
        adminarea.ClickOnAllowrole();
        Thread.sleep(1000);
        //   adminarea.SelecttheRole();
        //  Thread.sleep(1000);
        //  adminarea.ClickOnthesubmitRole();
        // Thread.sleep(2000);
        adminarea.DeleteTheRoleOfTheMembershipForUser();
        Thread.sleep(1000);
        adminarea.ClickOnTheArrow();
        Thread.sleep(1000);
        adminarea.ClickOnthesubmitRole();
        extent.flush();

    }

    @Test
    public void ActionLogSelectTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(1000);
        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        Thread.sleep(1000);
        adminarea.FilterTheUser("amol");
        Thread.sleep(1000);
        adminarea.DeleteUser();
        Thread.sleep(500);

        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(500);
        adminarea.ClickOnTheStartAction();
        Thread.sleep(500);
        adminarea.ClickOnTheStartDate();
        Thread.sleep(500);
        adminarea.ClickOnTheEndAction();
        Thread.sleep(500);
        adminarea.ClickOnTheEndDate();
        Thread.sleep(1000);
        adminarea.ClickOnTheActionSearch();
        extent.flush();

    }



    @Test
    public void SuspenduserTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(1000);
        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        Thread.sleep(1000);
        adminarea.FilterTheUser("amol");
        Thread.sleep(1000);
        adminarea.DeleteUser();
        Thread.sleep(1000);
        adminarea.Suspendtheuser();
        Thread.sleep(300);
       // adminarea.ClickOnsuspendyes();
        extent.flush();

    }

//    @Test
//    public void RevokeAccessTest() throws IOException, InterruptedException {
//        adminarea adminarea = new adminarea(driver);
//        adminarea.enterUsername("g.amol@leadergroup.com");
//        adminarea.enterPassword("Leader@1234");
//        adminarea.ClickShowpassword();
//        adminarea.enterthecaptcha("trfghe");
//
//        adminarea.clickLogin();
//        Thread.sleep(1000);
//        adminarea.clicAdminArea();
//        Thread.sleep(1000);
//        adminarea.ClickOnUser();
//        Thread.sleep(1000);
//        adminarea.FilterTheUser("amol");
//        Thread.sleep(1000);
//        adminarea.DeleteUser();
//        Thread.sleep(1000);
//        adminarea.ClickOnrevoke();
//        Thread.sleep(300);
//        //adminarea.ClickOnyesrevoke();
//        extent.flush();
//
//    }



  @Test
   public void DeleteuserTest() throws IOException, InterruptedException {
       adminarea adminarea = new adminarea(driver);
       adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
       adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");
       adminarea.clickLogin();
    Thread.sleep(1000);
    adminarea.clicAdminArea();
        Thread.sleep(1000);
      adminarea.ClickOnUser();
      Thread.sleep(1000);
       adminarea.FilterTheUser("amol");
       Thread.sleep(1000);
       adminarea.DeleteUser();
       Thread.sleep(1000);
        adminarea.ClockOnDelete();
       Thread.sleep(300);
       // adminarea.ClockOnYes();
      extent.flush();

  }

    @Test
    public void CreateNewuserTest() throws IOException, InterruptedException {
        adminarea adminarea = new adminarea(driver);
        adminarea.enterUsername("g.amol@leadergroup.com");
        adminarea.enterPassword("Leader@1234");
        adminarea.ClickShowpassword();
        adminarea.enterthecaptcha("trfghe");

        adminarea.clickLogin();
        Thread.sleep(1000);
        adminarea.clicAdminArea();
        Thread.sleep(1000);
        adminarea.ClickOnUser();
        Thread.sleep(1000);
        adminarea.ClickOnthecreatenewuser();
        Thread.sleep(1000);
        adminarea.EnterTheNewEmail("gg.amoll@leaddergroup.com");
        Thread.sleep(1000);
        adminarea.EnterTheNewName("Amol giram");
        Thread.sleep(1000);
        adminarea.EnterTheNewhandle("G.amo0ol");
        Thread.sleep(1000);
        adminarea.SubmitTheHandle();
        extent.flush();

    }
}