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
    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");
    private By CreatenewAcc = By.xpath("//a[@href='/auth/signup']");
    private By entermail = By.xpath("//input[@name='email']");
    private By enterpassword = By.xpath("//input[@name='password']");
    private By entername = By.xpath("//input[@name='name']");
    private By submit = By.xpath("//button[text()='Submit']");
    private By Profile = By.xpath("//div[@class='avatar d-flex h-100']");
    private By TheProfile = By.xpath("(//a[@rel='noopener'])[1]");
    private By Updatefullnamw = By.xpath("//input[@placeholder='Your full name']");
    private By Security = By.xpath("//a[@href='/auth/security']");
    private By LoginS = By.xpath("//a[@href='/auth/sessions']");
    private By AuthorizedClient = By.xpath("//a[@href='/auth/authorized-clients']");
    private By Theme = By.xpath("//button[text()='Theme']");
    private By STheme = By.xpath("(//a[@target='_self'])[2]");
    private By Logout = By.xpath("(//a[@target='_self'])[3]");
    private By CPassword = By.xpath("(//a[@target='_blank'])[2]");
    private By OPassword = By.xpath("(//input[@placeholder='Enter your old password'])[1]");
    private By NewPassword = By.xpath("(//input[@type='password'])[2]");
    private By SPassword = By.xpath("//button[@class='btn btn-primary btn-block btn-lg']");
    private By LanguageS = By.xpath("//select[@name='preferredLanguage']");
    private By SelectA = By.xpath("(//select[@class='form-control  ']//option)[2]");
    private By SubmitProfile = By.xpath("//button[@class='btn btn-primary btn-block btn-lg']");


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

    public void ClickShowpassword() {
        WebElement clickonpassField = wait.until(ExpectedConditions.visibilityOfElementLocated(Shpassword));
        clickonpassField.click();

        //WebElement Eyebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-eye']")));
        //Eyebutton.click();
    }

    public void clickonForgotPasword() {
        WebElement Forgot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot password?']")));
        //  driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        Forgot.click();
    }


    public void clickonremeberme() {
        WebElement remember = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rememberme']")));
        //  WebElement remember = driver.findElement(By.xpath("//input[@id='rememberme']"));
        remember.click();
    }

    public void enterthecaptcha(String captcha) {
        WebElement ENTERCAPTCHA = wait.until(ExpectedConditions.visibilityOfElementLocated(Captcha));
        ENTERCAPTCHA.sendKeys(captcha);
    }

    public void clickLogin() {
        WebElement loginclick = wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        loginclick.click();
    }

    public void clickonnewaccount() {
        WebElement newaccField = wait.until(ExpectedConditions.visibilityOfElementLocated(CreatenewAcc));
        newaccField.click();

    }

    public void Enteremail(String EntermailID) {
        WebElement enternewmail = wait.until(ExpectedConditions.visibilityOfElementLocated(entermail));
        enternewmail.sendKeys(EntermailID);

    }

    public void enternewpassword(String EnterPassword) {
        WebElement enterthepassword = wait.until(ExpectedConditions.visibilityOfElementLocated(enterpassword));
        enterthepassword.sendKeys(EnterPassword);
    }

    public void EnterFullName(String Name) {
        WebElement enterthename = wait.until(ExpectedConditions.visibilityOfElementLocated(entername));
        enterthename.sendKeys(Name);
    }

    public void clickonsubmit() {
        WebElement Submit = wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
        Submit.click();

    }

    public void clickOnProfile() {
        WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(Profile));
        profile.click();

    }

    public void ClickOnTheProfile() {
        WebElement Onprofile = wait.until(ExpectedConditions.visibilityOfElementLocated(TheProfile));
        Onprofile.click();
    }

    public void UpdateTheProfullname(String UPdate) {
        WebElement FULLNAME = wait.until(ExpectedConditions.visibilityOfElementLocated(Updatefullnamw));
        FULLNAME.sendKeys(UPdate);
    }


    public void SelectTheLanguage() {
        WebElement LANGUAGE = wait.until(ExpectedConditions.visibilityOfElementLocated(LanguageS));
        LANGUAGE.click();
    }

    public void SelectTheAr() {
        WebElement LANGUAGEAr = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectA));
        LANGUAGEAr.click();
    }


    public void SubmitTheProfile() {
        WebElement SUBMITPROFILE = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitProfile));
        SUBMITPROFILE.click();
    }


    public void ClickOnSecurity() {
        WebElement TTHESECURITY = wait.until(ExpectedConditions.visibilityOfElementLocated(Security));
        TTHESECURITY.click();
    }

    public void ClickOnLoginSession() {
        WebElement LoginSession = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginS));
        LoginSession.click();
    }

    public void ClickOnAuthorizedClient() {
        WebElement Client = wait.until(ExpectedConditions.visibilityOfElementLocated(AuthorizedClient));
        Client.click();
    }

    public void ChangeTheme() {
        WebElement CTheme = wait.until(ExpectedConditions.visibilityOfElementLocated(Theme));
        CTheme.click();
    }

    public void SelectTheTheme() {
        WebElement Select = wait.until(ExpectedConditions.visibilityOfElementLocated(STheme));
        Select.click();

    }

    public void ClickOnLogout() {
        WebElement LOGOUT = wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
        LOGOUT.click();

    }

    public void ClickOnChangePassword() {
        WebElement PASSWORD = wait.until(ExpectedConditions.visibilityOfElementLocated(CPassword));
        PASSWORD.click();

    }

    public void EnterTheOldPassword(String oldpassword) {
        WebElement OLDPASSWORD = wait.until(ExpectedConditions.visibilityOfElementLocated(OPassword));
        OLDPASSWORD.sendKeys(oldpassword);
    }


    public void EnterTheNewPassword(String ENewPassword) {
        WebElement EnternewP = wait.until(ExpectedConditions.visibilityOfElementLocated(NewPassword));
        EnternewP.sendKeys(ENewPassword);
    }

    public void ClickOnSubmitPassword() {
        WebElement SPASSWORD = wait.until(ExpectedConditions.visibilityOfElementLocated(SPassword));
        SPASSWORD.click();

    }


}
