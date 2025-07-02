package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class reports {



    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnReports=By.xpath("(//span[normalize-space()='Reports'])[1]");
  private By Clickdevicemanagment =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
  private By Selectdevicemanagment =By.xpath("(//li[@role='option'])[2]");
private By AgainClickDeviceManagment =By.cssSelector("#menu-");
private By ClickUnitGroup =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[2]");
private By SelectUnitGroup =By.xpath("(//li[@role='option'])[2]");
private By ClickCreatedTime =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[3]");
private By SelectTime =By.xpath("(//li[@role='option'])[6]");
private By ClickShow =By.xpath("(//span[@class='MuiTypography-root MuiTypography-button MuiTypography-noWrap css-392qqk'])[1]");
private By ClickRoute =By.xpath("//div[@aria-label='Route']//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2wpwt4']");
private By AgainClickCreatedTime =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[2]");

private By AgainSelectTime =By.xpath(("(//li[@role='option'])[6]"));

private By ClickEvent =By.xpath("(//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2wpwt4'])[2]");
private By ClickDevice =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[1]");
private By SelectDevice =By.xpath("(//li[@role='option'])[1]");
private By ClickEventTime =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[2]");
private By SelectEventTime =By.xpath("(//li[@role='option'])[6]");

private By ClickPresence =By.xpath("(//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2wpwt4'])[3]");
private By ClickContainerEvent =By.xpath("(//div[@aria-label='Container Events'])[1]");
private By SelectConatinerTime =By.xpath("(//li[@role='option'])[5]");

private By ClickContainerStatus =By.xpath("(//div[@aria-label='Container Status'])[1]");
private By ClickZone =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[1]");
private By  SelectZone =By.xpath("(//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-jmsmgp'])[1]");
private By ClickContainerType =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[2]");
private By SelectContainerType =By.xpath("(//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-jmsmgp'])[1]");
private By ClickContainer =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[3]");
private By SelectContainer =By.xpath("(//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-jmsmgp'])[3]");
private By AgainClickContainer =By.xpath("#root > div");







    // Constructor to initialize driver
    public reports(WebDriver driver) {
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

    public void clickOnTheReports() {
        WebElement CLICKREPORTS = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnReports));
        CLICKREPORTS.click();
    }

    public void clickOnTheDeviceManagment() {
        WebElement CLICKDEVICEMANAGMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(Clickdevicemanagment));
        CLICKDEVICEMANAGMENT.click();
    }

    public void SelectTheDeviceManagment() {
        WebElement SELECTDEVICEMANAGMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(Selectdevicemanagment));
        SELECTDEVICEMANAGMENT.click();
    }

    public void AgainclickOnTheDeviceManagment() {
        WebElement AGAINCLICKDEVICEMANAGMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(AgainClickDeviceManagment));
        AGAINCLICKDEVICEMANAGMENT.click();
    }


    public void clickOnUnitGroup() {
        WebElement CLICKUNITGROUP = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickUnitGroup));
        CLICKUNITGROUP.click();
    }

    public void SelectTheUnitGroup() {
        WebElement SELECTUNITGROUP = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectUnitGroup));
        SELECTUNITGROUP.click();
    }


    public void clickOnTheCreatedTime() {
        WebElement CLICKCREATEDTIME = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreatedTime));
        CLICKCREATEDTIME.click();
    }

    public void SelectTheCreatedTime() {
        WebElement SELECTCREATEDTIME = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectTime));
        SELECTCREATEDTIME.click();
    }

    public void ClickOnTheShow() {
        WebElement CLICKSHOW = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickShow));
        CLICKSHOW.click();
    }
    public void ClickOnTheRouteReports() {
        WebElement CLICKROUTE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRoute));
        CLICKROUTE.click();
    }

    public void AgainClickCreatedTheTime() {
        WebElement AGAINCLICKCREATEDTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainClickCreatedTime));
        AGAINCLICKCREATEDTIME.click();
    }


    public void AgainSelectTheTime() {
        WebElement AGAINSELECT= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainSelectTime));
        AGAINSELECT.click();
    }

    public void ClickOnTheEventReport() {
        WebElement CLICKEVENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEvent));
        CLICKEVENT.click();
    }

    public void ClickOnTheDevice() {
        WebElement CLICKDEVICE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDevice));
        CLICKDEVICE.click();
    }

    public void SelectOnTheDevice() {
        WebElement SELECTDEVICE= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDevice));
        SELECTDEVICE.click();
    }

    public void ClickOnTheEventTime() {
        WebElement CLICKEVENTTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEventTime));
        CLICKEVENTTIME.click();
    }

    public void SelectOnTheEventTime() {
        WebElement SELECTTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectEventTime));
        SELECTTIME.click();
    }

    public void ClickOnThePresenceofPeriodReport() {
        WebElement CLICKPRESENCE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickPresence));
        CLICKPRESENCE.click();
    }


    public void ClickOnTheContainerEventReport() {
        WebElement CLICKCONTAINER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainerEvent));
        CLICKCONTAINER.click();
    }

    public void SelectTheContainerTime() {
        WebElement SELECTCONTAINERTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectConatinerTime));
        SELECTCONTAINERTIME.click();
    }

    public void ClickOnTheContainerStatusReport() {
        WebElement CLICKSTATUSREPORT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainerStatus));
        CLICKSTATUSREPORT.click();
    }

    public void ClickOnTheZones() {
        WebElement CLICKZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickZone));
        CLICKZONES.click();
    }

    public void SelectOnTheZones() {
        WebElement SELECTZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectZone));
        SELECTZONES.click();
    }

    public void ClickOnTheContainerType() {
        WebElement CLICKCONTAINERTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainerType));
        CLICKCONTAINERTYPE.click();
    }

    public void SelectOnTheContainerType() {
        WebElement SELECTCONTAINERTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectContainerType));
        SELECTCONTAINERTYPE.click();
    }

    public void ClickOnTheContainer() {
        WebElement CLICKCONTAINER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainer));
        CLICKCONTAINER.click();
    }

    public void SelectOnTheContainer() {
        WebElement SELECTCONTAINER= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectContainer));
        SELECTCONTAINER.click();
    }

    public void AgainClickOnTheContainer() {
        WebElement AGAINCLICKCONTAINER= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainClickContainer));
        AGAINCLICKCONTAINER.click();
    }











}
