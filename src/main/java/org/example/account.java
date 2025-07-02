package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class account {


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
private By Enablemfa =By.xpath("(//span[@class='MuiButtonBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary PrivateSwitchBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary css-1nn6687'])[1]");
private By ClickPrefrence =By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[1]");
private By ClickLocation = By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[2]");
private By ClickPermissons = By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[3]");
private By ClickAttribute= By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[4]");
private By ClickConnections = By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[5]");






    // Constructor to initialize driver
    public account(WebDriver driver) {
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

    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }
    public void ClickOnTheEnablemfa()
    {
        WebElement CLICKMFA= wait.until(ExpectedConditions.visibilityOfElementLocated(Enablemfa));
        CLICKMFA.click();
    }

    public void ClickOnThePrefrence()
    {
        WebElement CLICKPREFRENCE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickPrefrence));
        CLICKPREFRENCE.click();
    }
    public void ClickOnTheLocation()
    {
        WebElement CLICKLOCATION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickLocation));
        CLICKLOCATION.click();
    }
    public void ClickOnThePermissons()
    {
        WebElement CLICKPERMISSONS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickPermissons));
        CLICKPERMISSONS.click();
    }

    public void ClickOnTheAttribute()
    {
        WebElement CLICKATTRIBUTE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAttribute));
        CLICKATTRIBUTE.click();
    }
    public void ClickOnTheConnections()
    {
        WebElement CLICKCONNECTIONS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickConnections));
        CLICKCONNECTIONS.click();
    }























}







