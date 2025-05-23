package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class departmenttest {


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
    public void ClicklonDepartmentTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");
        department.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse =( (JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");

        department.clicAdminArea();
        Thread.sleep(7000);
        department.clickdepartment();
        Thread.sleep(7000);
        department.Filterdepartment("amol");
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
        JavascriptExecutor jse =( (JavascriptExecutor) driver);
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
        JavascriptExecutor jse =( (JavascriptExecutor) driver);
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
        Thread.sleep(1000);
department.SelectTheClassification();
        Thread.sleep(1000);
        JavascriptExecutor jse=((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

        department.SubmitTheClassification();

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
        Thread.sleep(1000);
department.DeleteTheClassification();
        Thread.sleep(1000);
department.SubmitTheClassification();
    }
    @Test
    public void CreateNewDepartmentTest() throws IOException, InterruptedException {
        department department = new department(driver);
        department.enterUsername("g.amol@leadergroup.com");
        department.enterPassword("Leader@1234");
        department.ClickShowpassword();
        department.enterthecaptcha("tyvfhl");

        department.clickLogin();
        Thread.sleep(7000);
        JavascriptExecutor jse =( (JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,900)");
        Thread.sleep(7000);

        department.clicAdminArea();
        Thread.sleep(7000);
        department.clickdepartment();
        Thread.sleep(7000);
department.CreateNewDepartment();
        Thread.sleep(700);
department.EntertheDepartmentname("ammol giram");
        Thread.sleep(700);
department.EntertheDepartmentHandlename("g.giramm");
        Thread.sleep(1000);
department.SubmittheNewDepartment();


    }

}