package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class rolestest {


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
    public void ClickOnrolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(7000);
        roles.clicAdminArea();
        Thread.sleep(7000);
roles.clickOnRole();

    }
    @Test
    public void FilterTherolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(7000);
        roles.clicAdminArea();
        Thread.sleep(7000);
        roles.clickOnRole();
        Thread.sleep(7000);
roles.clickOnFilterRole("amol");
    }
    @Test
    public void DeleteTherolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(7000);
        roles.clicAdminArea();
        Thread.sleep(7000);
        roles.clickOnRole();
        Thread.sleep(7000);
        roles.clickOnFilterRole("amol");
        Thread.sleep(3000);
roles.clickOnViewRole();
        Thread.sleep(3000);
roles.clickondeleteRole();
        Thread.sleep(3000);
roles.clickonYesdeleteRole();
    }
    @Test
    public void ArchiveTherolesTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(7000);
        roles.clicAdminArea();
        Thread.sleep(7000);
        roles.clickOnRole();
        Thread.sleep(7000);
        roles.clickOnFilterRole("amol");
        Thread.sleep(3000);
        roles.clickOnViewRole();
        Thread.sleep(3000);
roles.ArchivetheRole();
        Thread.sleep(3000);
roles.ClickYesArchivetheRole();

        }

    @Test
    public void AddandDeleteRoleMembershipTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(7000);
        roles.clicAdminArea();
        Thread.sleep(1000);
        roles.clickOnRole();
        Thread.sleep(1000);
        roles.clickOnFilterRole("amol");
        Thread.sleep(3000);
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

    }


    @Test
    public void CreateNewRoleTest() throws IOException, InterruptedException {
        roles roles = new roles(driver);
        roles.enterUsername("g.amol@leadergroup.com");
        roles.enterPassword("Leader@1234");
        roles.ClickShowpassword();
        roles.enterthecaptcha("hbvfsw");
        roles.clickLogin();
        Thread.sleep(7000);
        roles.clicAdminArea();
        Thread.sleep(7000);
        roles.clickOnRole();
        Thread.sleep(1000);
roles.ClickOnTheNewRole();
        Thread.sleep(1000);
roles.EnterTheNewRoleName("amol girram");
        Thread.sleep(1000);
roles.EnterTheHandleRoleName("mol");
        Thread.sleep(1000);
roles.ClickSubmittheRole();
    }

}
