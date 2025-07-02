package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class contractorsmanagment {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickCreateContractorssmanagment =By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]");
    private By EnterName =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
    private By ClickSave =By.xpath("//button[text()='Save']");
    private By SerachContractorsManagment =By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
    private By EditContractorsManagment =By.xpath("(//button[@type='button'])[6]");
    private By DeleteContractorsManagment =By.xpath("(//button[@type='button'])[7]");
    private By EnterIdentifier =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By EnterRegNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By EnterIdNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[3]");
private By EnterTaxNumber =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[4]");
private By EnterNationality =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[5]");
private By EnterEmail =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[6]");








    // Constructor to initialize driver
    public contractorsmanagment(WebDriver driver) {
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

    public void clickCreateOntheContractorsmanagment()
    {
        WebElement CLICKCONTRACTORSMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreateContractorssmanagment));
        CLICKCONTRACTORSMANAGMENT.click();
    }


    public void EnterTheNameContractorsManagment(String ContractorsManagmentTheName)
    {
        WebElement ENTERCONTRACTORSMANAGMENT= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterName));
        ENTERCONTRACTORSMANAGMENT.sendKeys(ContractorsManagmentTheName);
    }

    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }



    public void SearchTheNameContractorsManagment(String SerachContractorsManagmentName)
    {
        WebElement SEARCHCONTRACTORSMANAGMENTNAME= wait.until(ExpectedConditions.visibilityOfElementLocated(SerachContractorsManagment));
        SEARCHCONTRACTORSMANAGMENTNAME.sendKeys(SerachContractorsManagmentName);
    }

    public void EditTheContractorsManagment()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(EditContractorsManagment));
        CLICKEDIT.click();
    }

    public void DeleteTheContractorsManagment()
    {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteContractorsManagment));
        CLICKDELETE.click();
    }

    public void EnterTheIdentifier(String IDENTIFIER)
    {
        WebElement ENTERIDENTIFIER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterIdentifier));
        ENTERIDENTIFIER.sendKeys(IDENTIFIER);
    }
    public void EnterTheRegNumber(String RegTheNumber)
    {
        WebElement REGNUMBER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterRegNumber));
        REGNUMBER.sendKeys(RegTheNumber);
    }

    public void EnterTheTaxNumber(String TaxTheNumber)
    {
        WebElement TAXNUMBER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterTaxNumber));
        TAXNUMBER.sendKeys(TaxTheNumber);
    }

    public void EnterTheIdNumber(String IdTheNumber)
    {
        WebElement IDNUMBER= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterIdNumber));
        IDNUMBER.sendKeys(IdTheNumber);
    }

    public void EnterTheNationality(String TheNationality)
    {
        WebElement NATIONALITY= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterNationality));
        NATIONALITY.sendKeys(TheNationality);
    }

    public void EnterTheEmail(String TheEmail)
    {
        WebElement EMAIL= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail));
        EMAIL.sendKeys(TheEmail);
    }













}
