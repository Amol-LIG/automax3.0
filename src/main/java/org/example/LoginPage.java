package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
private By ClickLanguage =By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-8bw302\"]");
private  By SelectLanguage =By.xpath("(//li[@role='option'])[1]");
private By ClickRestPassword =By.xpath("//a[text()='Reset Password']");
private By EnteremailR =By.xpath("//input[@name='email']");
private By ClickAccount =By.xpath("//span[text()='Account']");
private By Logout =By.xpath("//p[text()='Logout']");
private By ClickOnAccount =By.xpath("//p[text()='Account']");
private By ClickSaveAccount =By.xpath("//button[text()='Save']");

    private By ClickNotifications =By.xpath("(//div[@aria-label='Notifications'])[1]");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");



    // Constructor to initialize driver
    public LoginPage(WebDriver driver) {
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


    public void clickonForgotPasword() {
        WebElement Forgot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot password?']")));
        //  driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        Forgot.click();
    }

//
//
//    public void enterthecaptcha(String captcha) {
//        WebElement ENTERCAPTCHA = wait.until(ExpectedConditions.visibilityOfElementLocated(Captcha));
//        ENTERCAPTCHA.sendKeys(captcha);
//    }

    public void clickLogin() {
        WebElement loginclick = wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        loginclick.click();
    }


    public void clickonthelanguage() {
        WebElement LANGUAGE = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickLanguage));
        LANGUAGE.click();
    }


    public void Selectnthelanguage() {
        WebElement SELECTLANGUAGE = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectLanguage));
        SELECTLANGUAGE.click();
    }

    public void ClickResetPassword() {
        WebElement RESETPASSWORD= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRestPassword));
        RESETPASSWORD.click();
    }


    public void EnterTheEmailR(String EMAIL)
    {
        WebElement ENTEREMAIL = wait.until(ExpectedConditions.visibilityOfElementLocated(EnteremailR));
        ENTEREMAIL.sendKeys(EMAIL);
    }

    public void ClickOnAccount() {
        WebElement CLICKACCOUNT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAccount));
        CLICKACCOUNT.click();
    }
    public void ClickOntheAccount() {
        WebElement ACCOUNTCLICK= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnAccount));
        ACCOUNTCLICK.click();
    }
    public void ClickOntheSaveAccount() {
        WebElement SAVEACCOUNTCLICK= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSaveAccount));
        SAVEACCOUNTCLICK.click();
    }






    public void ClickOnLogout() {
        WebElement LOGOUT= wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
        LOGOUT.click();
    }



    public void clickOnSetting() {
        WebElement CLICKSETTING = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnSetting));
        CLICKSETTING.click();
    }
    public void clickOnNotifications()
    {
        WebElement CLICKNOTIFICATIONS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickNotifications));
        CLICKNOTIFICATIONS.click();
    }



















}
