package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class reports2 {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnReports=By.xpath("(//span[normalize-space()='Reports'])[1]");
private By ClickTripsReport =By.xpath("(//div[@aria-label='Trips'])[1]");
private By ClickDevice =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[1]");
private By SelectDevices =By.xpath("(//li[@role='option'])[1]");
private By ClickTime =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[2]");
private By SelectTime =By.xpath("(//li[@role='option'])[6]");
    private By ClickShow =By.xpath("(//span[@class='MuiTypography-root MuiTypography-button MuiTypography-noWrap css-392qqk'])[1]");
private By ClickStopsReport =By.xpath("(//div[@aria-label='Stops'])[1]");
private By ClickStopsReportTime =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[3]");
private By SelectStopTime =By.xpath("(//li[@role='option'])[6]");


private By ClickUnitGroup =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[1]");
private By SelectUnitGroup =By.xpath("(//li[@role='option'])[1]");
    private By AgainClickDeviceManagment =By.cssSelector("#menu-");
private By CClickTime =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[3]");
private By SSelectTime =By.xpath("(//li[@role='option'])[6]");
private By ClickSummery =By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye'])[4]");
private By SelectSummery =By.xpath("(//li[@role='option'])[2]");







    // Constructor to initialize driver
    public reports2(WebDriver driver) {
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

    public void clickOnTheTripsReports() {
        WebElement CLICKTRIPS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickTripsReport));
        CLICKTRIPS.click();
    }
    public void clickOnTheDevice() {
        WebElement CLICKDEVICE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDevice));
        CLICKDEVICE.click();
    }

    public void SelectOnTheDevice() {
        WebElement SELECTDEVICE= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDevices));
        SELECTDEVICE.click();
    }

    public void ClickOnTheTime() {
        WebElement CLICKTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickTime));
        CLICKTIME.click();
    }

    public void SelectOnTheTime() {
        WebElement SELECTTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectTime));
        SELECTTIME.click();
    }

    public void ClickOnTheShow() {
        WebElement CLICKSHOW = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickShow));
        CLICKSHOW.click();
    }

    public void ClickOnTheStopsReports() {
        WebElement CLICKSTOP = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickStopsReport));
        CLICKSTOP.click();
    }

    public void ClickOnTheUnitGroup() {
        WebElement CLICKUNITGROUP= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickUnitGroup));
        CLICKUNITGROUP.click();
    }

    public void SelectTheUnitGroup() {
        WebElement SELECTUNITGROUP= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectUnitGroup));
        SELECTUNITGROUP.click();
    }
    public void AgainclickOnTheDeviceManagment() {
        WebElement AGAINCLICKDEVICEMANAGMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(AgainClickDeviceManagment));
        AGAINCLICKDEVICEMANAGMENT.click();
    }
    public void CClickOnTheTime() {
        WebElement CCLICKTIME = wait.until(ExpectedConditions.visibilityOfElementLocated(CClickTime));
        CCLICKTIME.click();
    }
    public void SelectTTime() {
        WebElement SELECTTTIME = wait.until(ExpectedConditions.visibilityOfElementLocated(SSelectTime));
        SELECTTTIME.click();
    }

    public void ClickOnTheSummery() {
        WebElement CLICKSUMMERY = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSummery));
        CLICKSUMMERY.click();
    }
    public void SelectTheSummery() {
        WebElement SELECTSUMMERY = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectSummery));
        SELECTSUMMERY.click();
    }

    public void ClickOnStopReportTime() {
        WebElement STOPREPORTTIME = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickStopsReportTime));
        STOPREPORTTIME.click();
    }

    public void SelectOnStopReportTime() {
        WebElement SELECTTIME = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectStopTime));
        SELECTTIME.click();
    }





}
