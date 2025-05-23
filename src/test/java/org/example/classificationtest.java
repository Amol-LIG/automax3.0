package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class classificationtest {


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

    }













}
