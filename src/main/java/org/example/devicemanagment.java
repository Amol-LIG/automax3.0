package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class devicemanagment {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickDeviceManagment =By.xpath("//div[@aria-label='Devices Management']//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2wpwt4']");
private By ClickCreatedManagment =By.xpath("//button[@aria-label='Create Devices']");
private By EnterName =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[1]");
private By EnterIdentifier =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By EnterPlatenumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[3]");
private By EnterChasisNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[4]");
private By ClickContractor =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By SelectContractor =By.xpath("(//li[@role='option'])[2]");
private By ClickSave =By.xpath("//button[text()='Save']");
private By ClickStatus =By.xpath("//tr[@id='8']//td[8]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
private By ClickEditDeviceManagment =By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall jss75 css-1j7qk7u'])[2]");
    private By SelectQwell =By.xpath("(//li[@role='option'])[3]");
private By SearchDevice =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-18zhmu4']");
private By ClickFilter =By.xpath("//img[@alt='Filter icon']");
private By ClickStatusFilter =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By SelectStatusFilter =By.xpath("(//li[@role='option'])[1]");
    private  By ClickSArrow =By.xpath("//div[@id='menu-']//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
    private By AgainFilterClick =By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
private By ClickClearFilter =By.xpath("//img[@aria-label='Register your first device']");
private By ClickDelete =By.xpath("//tr[@id='51']//button[2]//*[name()='svg']");
private By ClickRemove =By.xpath("//button[text()='Remove']");




    // Constructor to initialize driver
    public devicemanagment(WebDriver driver) {
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
    public void clickOnTheDeviceManagment()
    {
        WebElement CLICKDEVICEMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeviceManagment));
        CLICKDEVICEMANAGMENT.click();
    }
    public void clickOnTheCreateDeviceManagment()
    {
        WebElement CLICKCREATEDEVICEMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreatedManagment));
        CLICKCREATEDEVICEMANAGMENT.click();
    }
    public void EnterTheName(String Dname)
    {
        WebElement ENTERNAME= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterName));
        ENTERNAME.sendKeys(Dname);
    }

    public void EnterTheIdentifier(String EnterOnIdentifier)
    {
        WebElement ENTERIDENTIFIER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterIdentifier));
        ENTERIDENTIFIER.sendKeys(EnterOnIdentifier);
    }

    public void EnterThePlateNumber(String EnterOnPlateNumber)
    {
        WebElement PLATENUMBER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterPlatenumber));
        PLATENUMBER.sendKeys(EnterOnPlateNumber);
    }


    public void EnterTheChasisNumber(String EnterOnChasisNumber)
    {
        WebElement CHASISNUMBER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterChasisNumber));
CHASISNUMBER.sendKeys(EnterOnChasisNumber);
    }

    public void clickOnContractor() {
        WebElement CLICKCONTRATOR = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContractor));
        CLICKCONTRATOR.click();
    }

    public void SelectOnContractor() {
        WebElement SELECTCONTRATOR = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectContractor));
        SELECTCONTRATOR.click();
    }

    public void ClickOnSave() {
        WebElement CLICKSAVE = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }
    public void ClickOnSeeStatus() {
        WebElement CLICKSTATUS = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickStatus));
        CLICKSTATUS.click();
    }

public void ClickOnEditTheDeviceManagment() {
    WebElement CLICKEDITDEVICEMANAGMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEditDeviceManagment));
    CLICKEDITDEVICEMANAGMENT.click();
}

    public void SelectTheQwell() {
        WebElement SELECTQWELL= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectQwell));
        SELECTQWELL.click();
    }


    public void SearchTheDevice(String SDevice) {
        WebElement SEARCHDEVICE= wait.until(ExpectedConditions.visibilityOfElementLocated(SearchDevice));
        SEARCHDEVICE.sendKeys(SDevice);
    }
    public void ClickOnTheFilter() {
        WebElement CLICKFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickFilter));
        CLICKFILTER.click();
    }

    public void ClickTheFilterStatus() {
        WebElement FILTERSTATUS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickStatusFilter));
        FILTERSTATUS.click();
    }

    public void SelectTheFilterStatus() {
        WebElement SELECTFILTERSTATUS= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectStatusFilter));
        SELECTFILTERSTATUS.click();
    }
    public void ClickOnTheFilterArrow() {
        WebElement CLICKARROWS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSArrow));
        CLICKARROWS.click();
    }

    public void   AgainClickOnTheFilter() {
        WebElement AGAINCLICKFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainFilterClick));
        AGAINCLICKFILTER.click();
    }


    public void   ClickOnTheClearFilter() {
        WebElement CLEARFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickClearFilter));
        CLEARFILTER.click();
    }

    public void   ClickOnTheDeleteDevice() {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDelete));
        CLICKDELETE.click();
    }
    public void   ClickOnTheRemove() {
        WebElement CLICKREMOVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRemove));
        CLICKREMOVE.click();
    }





















}
