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

public class departmenttest {



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

        test = extent.createTest("departmenttest", "Verifying clickondepartment");
        launchBrowser();
    }
    @Test
    public void ClicklonDepartmentTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");
        department.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        extent.flush();
    }

    @Test
    public void UpdateanddeleteDepartmentMembershipTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(3000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(2000);
        department.clicAdminArea();
        Thread.sleep(1000);


        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(2000);
        department.clickonUpdateMembership();
        Thread.sleep(1000);
        department.SelectTheMembership();
        Thread.sleep(1000);
        department.SubmitTheMembership();
        extent.flush();
    }

    @Test
    public void deleteDepartmentMembershipTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(3000);

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(1000);
        department.ClickOnTheDeleteMembership();
        Thread.sleep(1000);
        department.ClickOnTheArrow();
        Thread.sleep(1000);
        department.SubmitTheMembership();
        extent.flush();
    }

    @Test
    public void SelectTheDepartmentRoleTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(3000);

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(1000);
        department.ClickOnTherole();
        Thread.sleep(1000);
        department.SelectOnTherole();
        Thread.sleep(1000);
        department.ClickOnTheSubmitRole();
        extent.flush();
    }

    @Test
    public void ClickDeleteTheDepartmentRoleTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(3000);

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(1000);
        department.ClickOnTheDeleteRole();
        Thread.sleep(1000);
        department.ClickOnTheRoleArrow();
        Thread.sleep(1000);
        department.ClickOnTheSubmitRole();
        extent.flush();
    }

    @Test
    public void AddLocationTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(7000);

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(1000);

        department.AddTheLocation();
        Thread.sleep(1000);
        department.SelectTheLocation();
        Thread.sleep(1000);
        department.SubmitTheLocation();
        extent.flush();
    }

    @Test
    public void DeleteLocationTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(7000);

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(1000);
        department.DeleteTheLocation();
        Thread.sleep(1000);
        department.SubmitTheLocation();
        extent.flush();
    }

    @Test
    public void AddClassificationTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(2000);

        Thread.sleep(3000);

        department.clicAdminArea();
        Thread.sleep(2000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(1000);
        department.AddTheClassificaton();
        Thread.sleep(2000);
        department.SelectTheClassification();
        Thread.sleep(1000);

        Thread.sleep(1000);

      department.SubmitTheClassification();
        extent.flush();
    }

    @Test
    public void DeleteClassificationTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(2000);

        Thread.sleep(3000);

        department.clicAdminArea();
        Thread.sleep(2000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.Filterdepartment("amol");
        Thread.sleep(1000);
        department.clickontheMember();
        Thread.sleep(2000);
        department.DeleteTheClassification();
        Thread.sleep(1000);
        department.SubmitTheClassification();
        extent.flush();
    }

    @Test
    public void CreateNewDepartmentTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(3000);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(7000);

        department.clicAdminArea();
        Thread.sleep(1000);
        department.clickdepartment();
        Thread.sleep(1000);
        department.CreateNewDepartment();
        Thread.sleep(700);
        department.EntertheDepartmentname("ammol giram");
        Thread.sleep(700);
        department.EntertheDepartmentHandlename("g.giramm");
        Thread.sleep(1000);
        department.SubmittheNewDepartment();
        extent.flush();

    }

}