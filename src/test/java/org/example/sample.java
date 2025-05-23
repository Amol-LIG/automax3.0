package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class sample {



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automax.discretal.com");

        Thread.sleep(900);

        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("g.amol@leadergroup.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Leader@1234");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='captchaSolution']")).sendKeys("bfghtm");
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//div[@class='avatar d-flex h-100']")).click();
        Thread.sleep(1000);
  driver.findElement(By.xpath("(//a[@rel='noopener'])[1]")).click();
        Set<String> windowIds = driver.getWindowHandles();
for(String windowid :windowIds)
driver.switchTo().window(windowid);
driver.findElement(By.xpath("//a[@href='/auth/security']")).click();
        Thread.sleep(1000);
driver.findElement(By.xpath("//a[@href='/auth/sessions']")).click();

    }











    }
