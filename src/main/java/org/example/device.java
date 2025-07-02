package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class device {



    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickLanguage =By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-8bw302\"]");
    private  By SelectLanguage =By.xpath("(//li[@role='option'])[1]");
    private By ClickRestPassword =By.xpath("//a[text()='Reset Password']");
    private By EnteremailR = By.xpath("//input[@name='email']");
private By ClickAddDevice =By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
private By EnterDeviceName= By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[1]");
private  By EnterIdentifier =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By Enterplatenumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[3]");
private By EnterChasisNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[4]");
private By ClickOnContractors =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By SelectContractor =By.xpath("(//li[@role='option'])[2]");
private By ClickSave =By.xpath("//button[text()='Save']");
private  By SelectOBD =By.xpath("//span[text()='OBD-1']");
private By ClickEdit =By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[2]");
private By SelectQWELL =By.xpath("(//li[@role='option'])[3]");
private By ClickOnCommand =By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[1]");
private By ClickTypeCommand =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[2]");
private By SelectTypeCommand =By.xpath("//li[text()='Custom command']");
private By ClickOnSend =By.xpath("//button[text()='Send']");
private  By ClickOBD2 =By.xpath("//span[text()='OBD-2']");
private By ClickonReply =By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[1]");
private  By DeleteDevice =By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium jss50 css-1yxmbwk']");
private By ClickRemove =By.xpath("//button[text()='Remove']");
private  By SearchDevice =By.xpath("//input[@placeholder='Search Devices']");
private By ClickFilter =By.xpath("(//span[@class='MuiBadge-root css-1rzb3uu'])[1]");
private By ClickStatus =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By SelectStatus =By.xpath("(//li[@role='option'])[1]");
private  By ClickSArrow =By.xpath("//div[@id='menu-']//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
private By AgainFilterClick =By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
private By ClickDeviceEvent =By.xpath("//div[@class='maplibregl-ctrl-group maplibregl-ctrl']");
private By ClickLocationIQ =By.xpath("//div[@class='maplibregl-ctrl maplibregl-ctrl-group']");
private  By SelectOpenStreet =By.xpath("//button[text()='OpenStreetMap']");
private By ClickMapView =By.xpath("(//div[@class='maplibregl-ctrl maplibregl-ctrl-group mapboxgl-ctrl mapboxgl-ctrl-group'])[2]");






    // Constructor to initialize driver
    public device(WebDriver driver) {
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
    public void clickOnAdddevice() {
        WebElement ADDDEVICE = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAddDevice));
        ADDDEVICE.click();
    }


    public void enterdevicename(String DeviceN) {
        WebElement  DEVICEN = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterDeviceName));
        DEVICEN.sendKeys(DeviceN);
    }


    public void enterIdentifier(String EnterI) {
        WebElement  ENTERIDENTIFIER = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterIdentifier));
        ENTERIDENTIFIER.sendKeys(EnterI);
    }


    public void enterPlateNumber(String EnterPlate) {
        WebElement  ENTERPLATE = wait.until(ExpectedConditions.visibilityOfElementLocated(Enterplatenumber));
        ENTERPLATE.sendKeys(EnterPlate);
    }

    public void enterChassisNumber(String EnterChasis) {
        WebElement  ENTERCHASIS= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterChasisNumber));
        ENTERCHASIS.sendKeys(EnterChasis);
    }


    public void clickOnContractor() {
        WebElement CONTRACTOR = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnContractors));
        CONTRACTOR.click();
    }

    public void SelectOnContractor() {
        WebElement SELECTCONTRACTOR = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectContractor));
        SELECTCONTRACTOR.click();
    }
    public void ClickOnSave() {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }

    public void SelectTheOBD() {
        WebElement SELECTOBD= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOBD));
        SELECTOBD.click();
    }

    public void ClickOnEdit() {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEdit));
        CLICKEDIT.click();
    }
    public void SelectTheQwell() {
        WebElement SELECTQWELL= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectQWELL));
        SELECTQWELL.click();
    }


    public void ClickOnCommand() {
        WebElement CLICKONCOMMAND= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnCommand));
        CLICKONCOMMAND.click();
    }
    public void ClickOnTypeCommand() {
        WebElement TYPECLICKONCOMMAND= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickTypeCommand));
        TYPECLICKONCOMMAND.click();
    }

    public void SelectTypeCommand() {
        WebElement TYPESELECTONCOMMAND= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectTypeCommand));
        TYPESELECTONCOMMAND.click();
    }

    public void ClickOntheSend() {
        WebElement CLICKONSEND= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnSend));
        CLICKONSEND.click();
    }


    public void ClickOntheOBD2() {
        WebElement CLICKOBD2= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOBD2));
        CLICKOBD2.click();
    }
    public void ClickOntheReply() {
        WebElement REPLY= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonReply));
        REPLY.click();
    }
    public void ClickOnDeleteDevice() {
        WebElement DELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteDevice));
        DELETE.click();
    }

    public void ClickOnRemove() {
        WebElement REMOVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRemove));
        REMOVE.click();
    }


    public void SearchTheDevice(String SDEVICE)
    {
        WebElement  SEARCHDEVICE = wait.until(ExpectedConditions.visibilityOfElementLocated(SearchDevice));
        SEARCHDEVICE.sendKeys(SDEVICE);
    }

    public void ClickOnTheFilter() {
        WebElement CLICKFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickFilter));
        CLICKFILTER.click();
    }
    public void ClickOnTheStatus() {
        WebElement STATUS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickStatus));
        STATUS.click();
    }
    public void SelectOnTheStatus() {
        WebElement SELECTSTATUS= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectStatus));
        SELECTSTATUS.click();
    }
    public void ClickOnTheStatusArrow() {
        WebElement STATUSARROW= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSArrow));
        STATUSARROW.click();
    }
    public void AgainClickOnTheFilter() {
        WebElement AGAINFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainFilterClick));
        AGAINFILTER.click();
    }
    public void ClickDeviceEvent() {
        WebElement DEVICEEVENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeviceEvent));
        DEVICEEVENT.click();
    }
    public void ClickOnTheLocationIQStreet() {
        WebElement LOCATIONIQ= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickLocationIQ));
        LOCATIONIQ.click();
    }

    public void SelectOpenStreet() {
        WebElement OPENSTREET= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOpenStreet));
        OPENSTREET.click();
    }

    public void ClickOnTheMapView() {
        WebElement MAPVIEW= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickMapView));
        MAPVIEW.click();
    }








}
