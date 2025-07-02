package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo {




        public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leader-fms.discretal.com/login/");



        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("discretalfms@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Leader@123");

       /// driver.findElement(By.xpath("//input[@name='captchaSolution']")).sendKeys("bfghtm");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[text()='Login Without Captcha']")).click();
        Thread.sleep(2000);
driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]")).click();
            Thread.sleep(2000);


//WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(9) > a"));
//
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", hiddenElement);
//



            WebElement hiddenElement = driver.findElement(By.cssSelector("#sideMenu > div > ul:nth-child(3) > div:nth-child(12) > a"));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", hiddenElement);







        }












}
