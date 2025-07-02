package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Notifications {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickRefreshToken =By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeSmall css-2n4y0m']");
    private By ClickNotifications =By.xpath("(//a[contains(@class,'MuiListItemButton-root')])[2]");
private  By ClickCreateNotifications =By.xpath("//button[@aria-label='Create Notification']//*[name()='svg']");
private  By ClickType =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By SelectType =By.xpath("(//li[@role='option'])[2]");
private By ClickChaneel =By.xpath("//div[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-c4sutr']//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4']");
private By SelectChaneel =By.xpath("//li[normalize-space()='Mail']");
private By ClickBar =By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
private By ClickExtra =By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs']");
private By ClickSave =By.xpath("//button[text()='Save']");
private By ClickEdit =By.xpath("//tr[@id='18']//button[1]//*[name()='svg']");
private  By DeleteNotification =By.xpath("(//button[@type='button'])[11]");
private  By ClickRemove =By.xpath("//button[text()='Remove']");
    private  By ClickSArrow =By.xpath("//div[@id='menu-']");
    private By AgainFilterClick =By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");

    private By AgainClickDeviceManagment =By.cssSelector("#sideMenu");








    // Constructor to initialize driver
    public Notifications(WebDriver driver) {
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
    public void clickOnNotifications()
    {
        WebElement CLICKNOTIFICATIONS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickNotifications));
        CLICKNOTIFICATIONS.click();
    }
    public void clickOnTheCreateNotifications()
    {
        WebElement CLICKCREATENOTIFICATIONS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreateNotifications));
        CLICKCREATENOTIFICATIONS.click();
    }
    public void clickOnTheType()
    {
        WebElement CLICKTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickType));
        CLICKTYPE.click();
    }
    public void SelectTheType()
    {
        WebElement SELECTTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectType));
        SELECTTYPE.click();
    }

    public void clickOnTheChaneel()
    {
        WebElement CLICKCHANEEL= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickChaneel));
        CLICKCHANEEL.click();
    }
    public void SelectTheChaneel()
    {
        WebElement SELECTCHANEEL= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectChaneel));
        SELECTCHANEEL.click();
    }
    public void ClickOnTheBar()
    {
        WebElement CLICKBAR= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickBar));
        CLICKBAR.click();
    }

    public void ClickOnTheExtra()
    {
        WebElement CLICKEXTRA= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickExtra));
        CLICKEXTRA.click();
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

    public void ClickOnTheDeleteNotification()
    {
        WebElement DELETENOTIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteNotification));
        DELETENOTIFICATION.click();
    }
    public void ClickOnTheRemove()
    {
        WebElement REMOVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRemove));
        REMOVE.click();
    }
    public void ClickOnTheFilterArrow() {
        WebElement CLICKARROWS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSArrow));
        CLICKARROWS.click();
    }

    public void   AgainClickOnTheFilter() {
        WebElement AGAINCLICKFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainFilterClick));
        AGAINCLICKFILTER.click();
    }



    public void AgainclickOnTheDeviceManagment() {
        WebElement AGAINCLICKDEVICEMANAGMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(AgainClickDeviceManagment));
        AGAINCLICKDEVICEMANAGMENT.click();
    }








}
