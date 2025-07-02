package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class server {



    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickEnterName =By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4']");
    private By SelectName =By.xpath("(//li[@role='option'])[1]");
    private By ClickSave =By.xpath("//button[text()='Save']");
private By ClickTimeZone =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[7]");
private By Selecttimezone =By.xpath("(//li[@role='option'])[320]");
private By ClickLocation =By.xpath("(//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1oqimao'])[1]");
private By  ClickCurrentLocation =By.xpath("//button[text()='Current Location']");
    private By ClickAttribute =By.xpath("(//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1oqimao'])[2]");
private By ClickAdd =By.xpath("(//button[normalize-space()='Add'])[1]");
private By ClickTheAttribute =By.xpath("//div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root css-feqhe6']");
private By SelectAttribute =By.xpath("(//li[@role='option'])[1]");
private By SelectAdd =By.xpath("(//button[text()='Add'])[2]");





    // Constructor to initialize driver
    public server(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUsername(String username) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        userField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passField.sendKeys(password);
    }

//    public void enterthecaptcha(String captcha) {
//        WebElement ENTERCAPTCHA = wait.until(ExpectedConditions.visibilityOfElementLocated(Captcha));
//        ENTERCAPTCHA.sendKeys(captcha);
//    }

    public void clickLogin() {
        WebElement loginclick = wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        loginclick.click();
    }

    public void clickOnSetting() {
        WebElement CLICKSETTING = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnSetting));
        CLICKSETTING.click();
    }


    public void ClickTheNameMaintance()
    {
        WebElement CLICKMAINTANCE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEnterName));
        CLICKMAINTANCE.click();
    }

    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }

    public void ClickOnTheTimeZone()
    {
        WebElement CLICKTIMEZONE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickTimeZone));
        CLICKTIMEZONE.click();
    }


    public void SelectTheTimeZone()
    {
        WebElement SELECTTIMEZONE= wait.until(ExpectedConditions.visibilityOfElementLocated(Selecttimezone));
        SELECTTIMEZONE.click();
    }


    public void ClickOnTheLocation()
    {
        WebElement CLICKLOCATION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickLocation));
        CLICKLOCATION.click();
    }

    public void ClickOnTheCurrentLocation()
    {
        WebElement CLICKCURRENTLOCATION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCurrentLocation));
        CLICKCURRENTLOCATION.click();
    }

    public void ClickOnTheAttribute()
    {
        WebElement CLICKATTRIBUTE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAttribute));
        CLICKATTRIBUTE.click();
    }

    public void ClickOnTheAdd()
    {
        WebElement CLICKADD= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAdd));
        CLICKADD.click();
    }

    public void ClickOnTheAttributesssss()
    {
        WebElement CLICKATTRI= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickTheAttribute));
        CLICKATTRI.click();
    }

    public void SelectOnTheAttributesssss()
    {
        WebElement SELECTKATTRI= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectAttribute));
        SELECTKATTRI.click();
    }




    public void SelectTheAdd()
    {
        WebElement SELECTADD= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectAdd));
        SELECTADD.click();
    }













}