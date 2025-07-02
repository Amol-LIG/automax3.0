package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class unitgroup {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By Clickunitgroup=By.xpath("//div[@aria-label='Unit Groups']");
private By ClickCreateUnitG =By.xpath("//button[@aria-label='Create Groups']//*[name()='svg']");
private By EnterName =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
    private By ClickSave =By.xpath("//button[text()='Save']");
private By ClickEdit =By.xpath("//tr[@id='9']//button[1]//*[name()='svg']");
private By ClearFiled =By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae\"]");
private By SearchUnit =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
private By DeleteUnit =By.xpath("(//button[@type='button'])[9]");
    private By ClickRemove =By.xpath("//button[text()='Remove']");








    // Constructor to initialize driver
    public unitgroup(WebDriver driver) {
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
    public void clickOnTheunitgroup()
    {
        WebElement CLICKunitgroup= wait.until(ExpectedConditions.visibilityOfElementLocated(Clickunitgroup));
        CLICKunitgroup.click();
    }

    public void clickOnCreateTheunitgroup()
    {
        WebElement CLICKCREATE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreateUnitG));
        CLICKCREATE.click();
    }
    public void EnterTheNameunitgroup(String UnitGroup)
    {
        WebElement ENTERNAME= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterName));
        ENTERNAME.sendKeys(UnitGroup);
    }


    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }

    public void ClickOnTheEdit()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEdit));
        CLICKEDIT.click();
    }

    public void ClickOnTheClearField()
    {
        WebElement CLEARFIELD= wait.until(ExpectedConditions.visibilityOfElementLocated(ClearFiled));
        CLEARFIELD.clear();
    }

    public void SerachTheUnit(String SerachTheUnit)
    {
        WebElement SEARCHUNIT= wait.until(ExpectedConditions.visibilityOfElementLocated(SearchUnit));
        SEARCHUNIT.sendKeys(SerachTheUnit);
    }

    public void DeleteTheUnit()
    {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteUnit));
        CLICKDELETE.click();
    }


    public void ClickOnTheRemove()
    {
        WebElement REMOVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRemove));
        REMOVE.click();
    }










}
