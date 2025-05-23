package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Instant;

public class dropdown {



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automax.discretal.com");


        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("g.amol@leadergroup.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Leader@1234");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='captchaSolution']")).sendKeys("bfghtm");
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("(//div[@class='card app h-100'])[2]")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("(//label[@class='title mb-0 pointer'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-test-id='button-add-record']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@id='chatButton']//*[name()='svg'])[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();

    }

}