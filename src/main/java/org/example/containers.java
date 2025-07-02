package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class containers {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickContainers =By.xpath("//div[@aria-label='Add Containers']//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2wpwt4']");
private By ClickCreateContainer =By.xpath("//button[@aria-label='Create Container']//*[name()='svg']");
private By EnterIdentifier =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[1]");
private By EnterLatitude =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By EnterLongitude =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[3]");
private By Enterdistictname =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[4]");
private By EnterSerialNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[5]");
private By EnterTageNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[6]");
private By ClickContainertype =By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4'])[1]");
private By SelectContainerType =By.xpath("(//li[@role='option'])[2]");
private By ClickContractors =By.xpath("(//div[@role='combobox'])[2]");
private By SelectContractors =By.xpath("(//li[@role='option'])[2]");
private By ClickZones =By.xpath("(//div[@role='combobox'])[3]");
private By SelectZones =By.xpath("(//li[@role='option'])[2]");
private By ClickSave =By.xpath("//button[text()='Save']");
private By ClickContainerStatus =By.xpath("//tr[@id='268']//td[10]//*[name()='svg']");
private By ClickEdit =By.xpath("(//*[name()='path'])[6]");
private By ClickNanan =By.xpath("(//div[@class='MuiFormControl-root css-13sljp9'])[2]");
private By SelectQwell =By.xpath("(//li[@role='option'])[3]");
private By DeleteContainers =By.xpath("//tr[@id='268']//button[@title='delete']");
private By ClickRemove =By.xpath("//button[text()='Remove']");
private By ClickLocation =By.xpath("//tr[@id='268']//button[@title='locate']//*[name()='svg']");
private By MovingPage =By.xpath("//button[@class='lg:!w-12']//*[name()='svg']");
private By CClickZones =By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-1hf94h2']");
private By SelectZZones =By.xpath("//li[@id='checkboxes-tags-demo-option-1']");
private By ClickApply =By.xpath("//button[normalize-space()='Apply']");
private By ClickCreatedTime =By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4']");
private By SelectCreatedTime =By.xpath("//li[normalize-space()='This Month']");
private By SearchContainer =By.xpath("//input[@placeholder='Search']");
private By ClickFilter =By.xpath("//img[@alt='Filter icon']");
private By ClickFStatus =By.xpath("//div[@class='MuiFormControl-root css-13sljp9']//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4']");
private By SelectFull =By.xpath("//li[normalize-space()='Full (0)']");
    private  By ClickSArrow =By.xpath("//div[@id='menu-']//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
    private By AgainFilterClick =By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']");
private By ClickClearFilter =By.xpath("//button[@aria-label='Clear Filter']");







    // Constructor to initialize driver
    public containers(WebDriver driver) {
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
   public void clickOnTheAddContainers()
    {
        WebElement CLICKCONTAINERS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainers));
        CLICKCONTAINERS.click();
    }

    public void clickOnTheCreateContainers()
    {
        WebElement CREATECONTAINERS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreateContainer));
        CREATECONTAINERS.click();
    }

    public void EnterTheIdentifier(String  TheIdentifier)
    {
        WebElement IDENTIFIER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterIdentifier));
        IDENTIFIER.sendKeys(TheIdentifier);
    }

    public void EnterTheLatitude(String  TheLatitude)
    {
        WebElement LATITUDE= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterLatitude));
        LATITUDE.sendKeys(TheLatitude);
    }
    public void EnterTheLongitude(String  TheLongitude)
    {
        WebElement LONGITUDE= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterLongitude));
        LONGITUDE.sendKeys(TheLongitude);
    }
    public void EnterTheDistictName(String  TheDistict)
    {
        WebElement DISTICT= wait.until(ExpectedConditions.visibilityOfElementLocated(Enterdistictname));
        DISTICT.sendKeys(TheDistict);
    }

    public void EnterTheSerialNumber(String  TheSerial)
    {
        WebElement SERIAL= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterSerialNumber));
        SERIAL.sendKeys(TheSerial);
    }

    public void EnterTheTagNumber(String  TheTag)
    {
        WebElement TAG= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterTageNumber));
        TAG.sendKeys(TheTag);
    }
    public void clickOnTheContainersType()
    {
        WebElement CLICKCONTAINERSTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainertype));
        CLICKCONTAINERSTYPE.click();
    }

    public void SelectOnTheContainersType()
    {
        WebElement SelectCONTAINERSTYPE= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectContainerType));
        SelectCONTAINERSTYPE.click();
    }

    public void ClickOnTheContractors()
    {
        WebElement CONTRACTORS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContractors));
        CONTRACTORS.click();
    }
    public void SelectTheContractors()
    {
        WebElement SELECTCONTRACTORS= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectContractors));
        SELECTCONTRACTORS.click();
    }

    public void ClickOnTheZones()
    {
        WebElement CLICKZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickZones));
        CLICKZONES.click();
    }
    public void SelectTheZones()
    {
        WebElement SELECTZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectZones));
        SELECTZONES.click();
    }
    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }

    public void ClickOnTheContainerStatus()
    {
        WebElement CLICKSTATUS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContainerStatus));
        CLICKSTATUS.click();
    }

    public void ClickOnTheEdit()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEdit));
        CLICKEDIT.click();
    }
    public void ClickOnTheNanan()
    {
        WebElement CLICKNANAN= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickNanan));
        CLICKNANAN.click();
    }
    public void SelectTheQwell()
    {
        WebElement SELECTQWELL= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectQwell));
        SELECTQWELL.click();
    }
    public void DeleteTheContainers()
    {
        WebElement DELETECONTAINERS= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteContainers));
        DELETECONTAINERS.click();
    }
    public void ClickOnTheRemove()
    {
        WebElement REMOVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRemove));
        REMOVE.click();
    }

    public void ClickOnTheLocation()
    {
        WebElement CLICKLOCATION= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickLocation));
        CLICKLOCATION.click();
    }
    public void ClickOnTheMovingPage()
    {
        WebElement MOVINGPAGE= wait.until(ExpectedConditions.visibilityOfElementLocated(MovingPage));
        MOVINGPAGE.click();
    }
    public void ClickOnTheZZones()
    {
        WebElement CLICKZZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(CClickZones));
        CLICKZZONES.click();
    }
    public void SelectOnTheZZones()
    {
        WebElement SELECTZZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectZZones));
        SELECTZZONES.click();
    }
    public void ClickOnTheApply()
    {
        WebElement CLICKAPPLY= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickApply));
        CLICKAPPLY.click();
    }
    public void ClickOnTheCreatedTime()
    {
        WebElement CLICKCREATEDTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreatedTime));
        CLICKCREATEDTIME.click();
    }
    public void SelectOnTheCreatedTime()
    {
        WebElement SELECTCREATEDTIME= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectCreatedTime));
        SELECTCREATEDTIME.click();
    }

    public void SearchTheContainer(String TheContainer)
    {
        WebElement SEARCHCONTAINER= wait.until(ExpectedConditions.visibilityOfElementLocated(SearchContainer));
        SEARCHCONTAINER.sendKeys(TheContainer);
    }
    public void ClickOnTheFilterContainer()
    {
        WebElement FILTERCONTAINER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickFilter));
        FILTERCONTAINER.click();
    }

    public void ClickOnTheFilterStatus()
    {
        WebElement FILTERSTATUS= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickFStatus));
        FILTERSTATUS.click();
    }

    public void ClickOnTheSelectFull()
    {
        WebElement SELECTFULL= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectFull));
        SELECTFULL.click();
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
        WebElement CLEARCLICKFILTER= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickClearFilter));
        CLEARCLICKFILTER.click();
    }






}
