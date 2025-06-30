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

public class rolestest {


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

        test = extent.createTest("roletest", "Verifying clickonroletest");
        launchBrowser();
    }
    @Test
    public void ClickOnrolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(2000);
        roles.clicAdminArea();
        Thread.sleep(1000);
        roles.clickOnRole();
extent.flush();
    }

    @Test
    public void FilterTherolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(2000);
        roles.clicAdminArea();
        Thread.sleep(1000);
        roles.clickOnRole();
        Thread.sleep(1000);
        roles.clickOnFilterRole("amol");
        extent.flush();

    }



    @Test
    public void AddandDeleteRoleMembershipTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(3000);
        roles.clicAdminArea();
        Thread.sleep(1000);
        roles.clickOnRole();
        Thread.sleep(1000);
        roles.clickOnFilterRole("amol");
        Thread.sleep(2000);
        roles.clickOnViewRole();
        Thread.sleep(1000);
        roles.ClickAddRole();
        Thread.sleep(1000);
        roles.SelectTheRole();
        Thread.sleep(1000);
        roles.SubmitTheMembership();
        Thread.sleep(2000);
        roles.DeleteTheMembership();
        Thread.sleep(2000);
        roles.ClickOnTheRightArrow();
        Thread.sleep(1000);
        roles.SubmitTheMembership();
        extent.flush();

    }
    @Test
    public void ArchiveTherolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(3000);
        roles.clicAdminArea();
        Thread.sleep(1000);
        roles.clickOnRole();
        Thread.sleep(7000);
        roles.clickOnFilterRole("amol");
        Thread.sleep(3000);
        roles.clickOnViewRole();
        Thread.sleep(3000);
        roles.ArchivetheRole();
        //roles.ClickYesArchivetheRole();
        extent.flush();

    }

    @Test
    public void CreateNewRoleTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(3000);
        roles.clicAdminArea();
        Thread.sleep(2000);
        roles.clickOnRole();
        Thread.sleep(1000);
        roles.ClickOnTheNewRole();
        Thread.sleep(1000);
        roles.EnterTheNewRoleName("amol girram");
        Thread.sleep(1000);
        roles.EnterTheHandleRoleName("mol");
        Thread.sleep(1000);
        roles.ClickSubmittheRole();
        extent.flush();

    }

    @Test
    public void DeleteTherolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(3000);
        roles.clicAdminArea();
        Thread.sleep(1000);
        roles.clickOnRole();
        Thread.sleep(1000);
        roles.clickOnFilterRole("amol");
        Thread.sleep(1000);
        roles.clickOnViewRole();
        Thread.sleep(1000);
        roles.clickondeleteRole();
       // Thread.sleep(3000);
       // roles.clickonYesdeleteRole();
        extent.flush();

    }

}
