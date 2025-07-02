package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class containertype {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickContainertype=By.xpath("//div[@aria-label='Server']//div[@class='MuiListItemIcon-root css-1f8bwsm']");
private By ClickCreateCType =By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]");
private By EnterName =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
    private By ClickSave =By.xpath("//button[text()='Save']");
private By SerachContainer =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
private By EditContainerT =By.xpath("(//button[@type='button'])[6]");
private By DeleteContainerT =By.xpath("(//button[@type='button'])[7]");






    // Constructor to initialize driver
    public containertype(WebDriver driver) {
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
    public void clickOnContainerType()
    {
        WebElement CLICKCONTAINERTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainertype));
        CLICKCONTAINERTYPE.click();
    }

    public void clickCreateOnContainerType()
    {
        WebElement CLICKCREATECONTAINERTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreateCType));
        CLICKCREATECONTAINERTYPE.click();
    }


    public void EnterTheNameContainerType(String ContainerTheName)
    {
        WebElement ENTERCONTAINERTYPENAME= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterName));
        ENTERCONTAINERTYPENAME.sendKeys(ContainerTheName);
    }

    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }



    public void SearchTheNameContainerType(String SerachContainerTheName)
    {
        WebElement SEARCHCONTAINERTYPENAME= wait.until(ExpectedConditions.visibilityOfElementLocated(SerachContainer));
        SEARCHCONTAINERTYPENAME.sendKeys(SerachContainerTheName);
    }

    public void EditTheContainerType()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(EditContainerT));
        CLICKEDIT.click();
    }

    public void DeleteTheContainerType()
    {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteContainerT));
        CLICKDELETE.click();
    }










}
