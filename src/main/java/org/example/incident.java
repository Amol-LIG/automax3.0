package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class incident {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");

    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
private By Ims= By.xpath("(//div[@class='card app h-100'])[2]");
private By AllIncident= By.xpath("(//label[@class='title mb-0 pointer'])[2]");
private By Refresh= By.xpath("(//button[@type='button'])[12]");
private By ClickIVRI = By.xpath("//div[text()='IVR']");
private By FilterIn = By.xpath("(//input[@type='search'])[3]");
private By Comment= By.xpath("(//a[@target='_self'])[21]");
private By Action= By.xpath("(//a[@target='_self'])[22]");
private By ChangeAction= By.xpath("//button[@class='btn py-0 m-0 btn-link']");
private  By Attachment = By.xpath("(//a[@target='_self'])[23]");
private  By Add=By.xpath("(//button[@type='button'])[13]");
private By Idd= By.xpath("(//input[@class='mr-2 form-control'])[1]");
private By CallerName= By.xpath("(//input[@class='mr-2 form-control'])[2]");
    private By MobileNumer= By.xpath("(//input[@class='mr-2 form-control'])[3]");
private By LocationEnter= By.xpath("(//input[@class='mr-2 form-control'])[6]");
    private By Nationalid= By.xpath("(//input[@class='mr-2 form-control'])[4]");
private By ClickChannel =By.xpath("(//div[@data-test-id='select'])[1]");
private By SelectCChanel =By.xpath("(//li[@role='option'])[1]");
private By SaveCopy =By.xpath("//button[@class='btn text-nowrap btn-light btn-lg']");
private By Edit= By.xpath("//button[@class='btn btn-light btn-lg']");
private By ClickHigh =By.xpath("(//li[@role='option'])[2]");
private By SaveHigh =By.xpath("//button[@type='submit']");
private By Delete= By.xpath("//button[@class='btn btn-danger btn-lg  border-0 flex-fill']");
private By YesClick =By.xpath("//svg[@role='img']");
private By DownloadR =By.xpath("//span[@class='toggleReportDownload']");
private By StartD= By.xpath("(//button[@class=\"btn h-auto\"])[1]");
    private By SSDate= By.xpath("//span[text()='1']");
   private By EndD= By.xpath("(//button[@class='btn h-auto'])[2]");
   private By SEDate= By.xpath("//span[text()='13']");
private By Format= By.xpath("(//input[@class='vs__search'])[3]");
private By SelectFormat =By.xpath("(//li[@role='option'])[1]");
private By ClickDownloadR =By.xpath("//button[@class='btn flex-fill btn-primary btn-lg']");
private By ClickCritically =By.xpath("(//div[@class='vs__selected-options'])[3]");
private By SelectCritically =By.xpath("(//li[@role='option'])[2]");
private By ClickClassification =By.xpath("(//input[@class='vue-treeselect__input'])[1]");
private By SelectClassification =By.xpath("//label[text()='electricity']");
private By ClickReason =By.xpath("(//div[@class='vs__selected-options'])[4]");
private By SelectReason= By.xpath("(//li[@role='option'])[2]");
private By ClickAssignto =By.xpath("(//div[@class='vs__selected-options'])[5]");
private By SelectAssignto =By.xpath("(//li[@role='option'])[2]");
private By ClickDepartment =By.xpath("(//div[@class='vs__selected-options'])[6]");
private By SelectDepartment =By.xpath("(//li[@role='option'])[1]");
private By SubmitI =By.xpath("//div[@class='c-toolbar d-flex flex-column flex-sm-row bg-white p-3 gap-1 flex-wrap shadow border-top']//button//span");





    // Constructor to initialize driver
    public incident(WebDriver driver)
    {
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
    }

    public void enterthecaptcha(String captcha) {
        WebElement ENTERCAPTCHA = wait.until(ExpectedConditions.visibilityOfElementLocated(Captcha));
        ENTERCAPTCHA.sendKeys(captcha);
    }

    public void clickLogin() {
        WebElement loginclick = wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        loginclick.click();
    }

    public void clickOnIms() {
        WebElement IMS = wait.until(ExpectedConditions.visibilityOfElementLocated(Ims));
        IMS.click();
    }
    public void clickOnTheAllIncident() {
        WebElement ALLINCIDENT = wait.until(ExpectedConditions.visibilityOfElementLocated(AllIncident));
        ALLINCIDENT.click();
    }

    public void clickOnTheRefresh() {
        WebElement RREFRESHINCIDENT = wait.until(ExpectedConditions.visibilityOfElementLocated(Refresh));
        RREFRESHINCIDENT.click();
    }

    public void FilterTheIncident(String fincident) {
        WebElement FFILTERI= wait.until(ExpectedConditions.visibilityOfElementLocated(FilterIn));
        FFILTERI.sendKeys(fincident);
    }

    public void clickOnTheIVR()
    {
        WebElement CLICKI = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickIVRI));
        CLICKI.click();
    }
    public void clickOnTheComment()
    {
        WebElement CLICKCOMMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(Comment));
        CLICKCOMMENT.click();
    }
    public void clickOnTheActionLog()
    {
        WebElement ACTIONLOG= wait.until(ExpectedConditions.visibilityOfElementLocated(Action));
        ACTIONLOG.click();
    }

    public void clickOnChangeTheActionLog() {
        WebElement CHANGEACTIONLOG = wait.until(ExpectedConditions.visibilityOfElementLocated(ChangeAction));
        CHANGEACTIONLOG.click();
    }
    public void clickOnChangeTheAttachment() {
        WebElement CLICKATTACHMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(Attachment));
        CLICKATTACHMENT.click();
    }
    public void clickOnTheAddIncident() {
        WebElement CLICKADD = wait.until(ExpectedConditions.visibilityOfElementLocated(Add));
        CLICKADD.click();
    }
    public void EnterTheId(String EnterId) {
        WebElement EENTERID= wait.until(ExpectedConditions.visibilityOfElementLocated(Idd));
        EENTERID.sendKeys(EnterId);
    }
    public void EnterTheCallerName(String EnterCallerName) {
        WebElement ENTERCALLERNAME= wait.until(ExpectedConditions.visibilityOfElementLocated(CallerName));
        ENTERCALLERNAME.sendKeys(EnterCallerName);
    }
    public void EnterTheMobileNumber(String EnterMobile) {
        WebElement ENTERMOBILENUMBER= wait.until(ExpectedConditions.visibilityOfElementLocated(MobileNumer));
        ENTERMOBILENUMBER.sendKeys(EnterMobile);
    }

    public void EnterTheLocation(String EnterL) {
        WebElement ENTERLOCATION= wait.until(ExpectedConditions.visibilityOfElementLocated(LocationEnter));
        ENTERLOCATION.sendKeys(EnterL);
    }
    public void EEnterTheNationalId(String NationalI) {
        WebElement ENTERNATIONALID= wait.until(ExpectedConditions.visibilityOfElementLocated(Nationalid));
        ENTERNATIONALID.sendKeys(NationalI);
    }
    public void ClickOnTheChaneel() {
        WebElement CCLICKCHANEEL= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickChannel));
        CCLICKCHANEEL.click();
    }
    public void SelectTheChaneel() {
        WebElement SSELECTCHANEEL= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectCChanel));
        SSELECTCHANEEL.click();
    }


    public void ClickOnTheCritically() {
        WebElement CLICKCTCRITICALLY= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCritically));
        CLICKCTCRITICALLY.click();
    }


    public void SelectTheCritically() {
        WebElement SSELECTCRITICALLY= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectCritically));
        SSELECTCRITICALLY.click();
    }
    public void ClickOnTheClassification() {
        WebElement CLICKCLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickClassification));
        CLICKCLASSIFICATION.click();
    }
    public void SelectOnTheClassification() {
        WebElement CLICKCLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectClassification));
        CLICKCLASSIFICATION.click();
    }
    public void ClickOnTheReason() {
        WebElement CLICKREASON= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickReason));
        CLICKREASON.click();
    }
    public void SelectOnTheReason() {
        WebElement SELECTREASON= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectReason));
        SELECTREASON.click();
    }
    public void ClickOnTheAssignto() {
        WebElement CCLICKASSIGNTO= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickAssignto));
        CCLICKASSIGNTO.click();
    }
    public void SelectOnTheAssignto() {
        WebElement SSELECTASSIGN= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectAssignto));
        SSELECTASSIGN.click();
    }
    public void ClickOnTheDepartment() {
        WebElement DDEPARTMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDepartment));
        DDEPARTMENT.click();
    }
    public void SelectOnTheDepartment() {
        WebElement SSELECTDEPARTMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDepartment));
        SSELECTDEPARTMENT.click();
    }
    public void ClickOnTheSubmit() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]//span"))).click();

        WebElement CCLICKSUBMIT= wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitI));
        CCLICKSUBMIT.click();

    }




    public void ClickOnTheSaveandCopy() {
        WebElement SSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(SaveCopy));
        SSAVE.click();
    }

    public void ClickOnEdit() {
        WebElement EDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(Edit));
        EDIT.click();
    }
    public void ClickOnTheHigh() {
        WebElement CCLICKHIGH= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickHigh));
        CCLICKHIGH.click();
    }
    public void ClickOnSaveHigh() {
        WebElement CCLICKSAHIGH= wait.until(ExpectedConditions.visibilityOfElementLocated(SaveHigh));
        CCLICKSAHIGH.click();
    }

    public void ClickOnDelete() {
        WebElement DELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(Delete));
        DELETE.click();
    }

    public void ClickOnTheYes() {
        WebElement YYes= wait.until(ExpectedConditions.visibilityOfElementLocated(YesClick));
        YYes.click();
    }
    public void ClickDownloadReport() {
        WebElement DREPORT= wait.until(ExpectedConditions.visibilityOfElementLocated(DownloadR));
        DREPORT.click();
    }

    public void ClickOnStartDate() {
        WebElement STARTDATE= wait.until(ExpectedConditions.visibilityOfElementLocated(StartD));
        STARTDATE.click();
    }
    public void SelectTheStartDate() {
        WebElement SSELECTSTARTDATE= wait.until(ExpectedConditions.visibilityOfElementLocated(SSDate));
        SSELECTSTARTDATE.click();
    }
    public void ClickOnEndDate() {
        WebElement ENDDATE= wait.until(ExpectedConditions.visibilityOfElementLocated(EndD));
        ENDDATE.click();
    }
    public void SelectTheEndDate() {
        WebElement SELECTENDDATE= wait.until(ExpectedConditions.visibilityOfElementLocated(SEDate));
        SELECTENDDATE.click();
    }
    public void ClickOnTheFormat() {
        WebElement FFORMAT= wait.until(ExpectedConditions.visibilityOfElementLocated(Format));
        FFORMAT.click();
    }
    public void SelectTheFormat() {
        WebElement SSELECTFORMAT= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectFormat));
        SSELECTFORMAT.click();
    }
    public void  ClickOnTheDownloadReport() {
        WebElement DOWNLOADREPORT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDownloadR));
        DOWNLOADREPORT.click();
    }






}
