package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class setting {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
private By ClickRefreshToken =By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeSmall css-2n4y0m']");
private By ClickMap =By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[1]");
private By ClickActiveMap =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By ClickMapOverlay =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[2]");
private  By ClickLivePath =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[3]");
private By ClickDirection =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[4]");
private  By SelectDirection =By.xpath("(//li[@role='option'])[3]");
private By ClickDeviceManagment =By.xpath("(//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1oqimao'])[2]");
private By ClickDeviceDetail =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[6]");
private By SelectDevicedetails =By.xpath("(//li[@role='option'])[3]");
private By ClickDeviceTitle =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[5]");
private By SelectDeviceTitle =By.xpath("(//li[@role='option'])[3]");
private By ClickNotificationSound =By.xpath("(//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1oqimao'])[3]");
private By ClickSoundevent =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[7]");
private By SelectSoundEvent =By.xpath("(//li[@role='option'])[4]");
private By ClicksoundAlarm =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[8]");
private By SelectSoundAlram =By.xpath("(//li[@role='option'])[6]");
private By AgainClickNotification =By.xpath("//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-i6s8oy']");
private By ClickInfo =By.xpath("(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded MuiAccordion-gutters css-1aj41gs'])[4]");
private By ClickSave =By.xpath("//button[text()='Save']");






    // Constructor to initialize driver
    public setting(WebDriver driver) {
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

    public void clickOnTheRefreshToken() {
        WebElement RFRESHTOKEN = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRefreshToken));
        RFRESHTOKEN.click();
    }
    public void clickOnTheMap() {
        WebElement CLICKMAP= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickMap));
        CLICKMAP.click();
    }

    public void clickOnTheActiveMap() {
        WebElement CLICKACTIVEMAP= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickActiveMap));
        CLICKACTIVEMAP.click();
    }

    public void clickOnTheMapOverlay() {
        WebElement CLICKMAPOVERLAY= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickMapOverlay));
        CLICKMAPOVERLAY.click();
    }
    public void clickOnTheLivePath() {
        WebElement LIVEPATH= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickLivePath));
        LIVEPATH.click();
    }

    public void clickOnTheShowDirection() {
        WebElement SHOWDIRECTION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDirection));
        SHOWDIRECTION.click();
    }
    public void SelectTheShowDirection() {
        WebElement SELECTDIRECTION= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDirection));
        SELECTDIRECTION.click();
    }
    public void ClickonTheDeviceManagment() {
        WebElement CLICKDEVICEMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeviceManagment));
        CLICKDEVICEMANAGMENT.click();
    }
    public void ClickonTheDeviceDetail() {
        WebElement CLICKDEVICEDETAILS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeviceDetail));
        CLICKDEVICEDETAILS.click();
    }
    public void SelectTheDeviceDetail() {
        WebElement SELECTDEVICEDETAILS= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDevicedetails));
        SELECTDEVICEDETAILS.click();
    }
    public void ClickonTheDeviceTitle() {
        WebElement CLICKDEVICETITLE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeviceTitle));
CLICKDEVICETITLE.click();
    }
    public void SelectTheDevicTitle()
    {
        WebElement SELECTDEVICETITLE= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDeviceTitle));
        SELECTDEVICETITLE.click();
    }
    public void ClickOnTheSoundNotification()
    {
        WebElement CLICKSOUNDNOTIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickNotificationSound));
CLICKSOUNDNOTIFICATION.click();
    }
    public void ClickOnTheSoundEvent()
    {
        WebElement CLICKSOUNDEVENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSoundevent));
        CLICKSOUNDEVENT.click();
    }
    public void SelectOnTheSoundEvent()
    {
        WebElement SELECTSOUNDEVENT= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectSoundEvent));
        SELECTSOUNDEVENT.click();
    }
    public void ClickOnTheSoundAlarm()
    {
        WebElement SOUNDALARAM= wait.until(ExpectedConditions.visibilityOfElementLocated(ClicksoundAlarm));
        SOUNDALARAM.click();
    }
    public void SelectTheSoundAlarm()
    {
        WebElement SELECTSOUNDALARAM= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectSoundAlram));
        SELECTSOUNDALARAM.click();
    }
    public void AgainClickOnTheNotification()
    {
        WebElement AGAINCLICKNOTIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(AgainClickNotification));
        AGAINCLICKNOTIFICATION.click();
    }

    public void ClickOnTheInfo()
    {
        WebElement CLICKINFO= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickInfo));
        CLICKINFO.click();
    }
    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }


















}
