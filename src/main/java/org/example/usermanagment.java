package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class usermanagment {



    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickCreateusermanagment =By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]");
    private By ClickEnterName =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[1]");
    private By SelectName =By.xpath("(//li[@role='option'])[1]");
    private By ClickSave =By.xpath("//button[text()='Save']");
    private By Serachusermanagment=By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
    private By Editusermanagment =By.xpath("(//button[@type='button'])[7]");
    private By Deleteusermanagment =By.xpath("(//button[@type='button'])[8]");
private By EnterEmail =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By EnterPassword =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[3]");




    // Constructor to initialize driver
    public usermanagment(WebDriver driver) {
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

    public void clickCreateOntheUserManagment()
    {
        WebElement CLICKUSERMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreateusermanagment));
        CLICKUSERMANAGMENT.click();
    }


    public void ClickTheNameUserManagment(String EnterName)
    {
        WebElement CLICKUSERMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEnterName));
        CLICKUSERMANAGMENT.sendKeys(EnterName);
    }

    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }



    public void SearchTheNameUserManagment(String SearchTheUserManagment)
    {
        WebElement SEARCHUSERMANAGMENT =wait.until(ExpectedConditions.visibilityOfElementLocated(Serachusermanagment));
        SEARCHUSERMANAGMENT.sendKeys(SearchTheUserManagment);
    }

    public void EditTheUserManagment()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(Editusermanagment));
        CLICKEDIT.click();
    }

    public void DeleteTheUserManagment()
    {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(Deleteusermanagment));
        CLICKDELETE.click();
    }



    public void EnterTheEmail(String TheEmail)
    {
        WebElement ENTEREMAIL= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail));
        ENTEREMAIL.sendKeys(TheEmail);
    }


    public void EnterThePassword(String ThePassword)
    {
        WebElement ENTERPASSWORD= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterPassword));
        ENTERPASSWORD.sendKeys(ThePassword);
    }































}
