package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class locationtest {


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


    }






}