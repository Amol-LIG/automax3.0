package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class maintance {



    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("//button[text()='Login Without Captcha']");
    private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
    private By ClickCreatemaintance =By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]");
    private By ClickEnterName =By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-l3s3o4']");
   private By SelectName =By.xpath("(//li[@role='option'])[1]");
    private By ClickSave =By.xpath("//button[text()='Save']");
    private By Serachmaintance=By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae']");
    private By Editmaintance =By.xpath("(//button[@type='button'])[6]");
    private By Deletemaintance =By.xpath("(//button[@type='button'])[7]");
private By EnterDistance =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[2]");
private By EnterMessage =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[3]");
private By enterDate =By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-o4qvae'])[1]");





    // Constructor to initialize driver
    public maintance(WebDriver driver) {
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

    public void clickCreateOntheMaintance()
    {
        WebElement CLICKMAINTANCE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickCreatemaintance));
        CLICKMAINTANCE.click();
    }


    public void ClickTheNameMaintance()
    {
        WebElement CLICKMAINTANCE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEnterName));
        CLICKMAINTANCE.click();
    }

    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }



    public void SearchTheNameMaintance(String SearchTheMaintance)
    {
        WebElement SEARCHMAINTANCENAME= wait.until(ExpectedConditions.visibilityOfElementLocated(Serachmaintance));
        SEARCHMAINTANCENAME.sendKeys(SearchTheMaintance);
    }

    public void EditTheMaintance()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(Editmaintance));
        CLICKEDIT.click();
    }

    public void DeleteTheMaintance()
    {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(Deletemaintance));
        CLICKDELETE.click();
    }

    public void SelectTheMaintanceName()
    {
        WebElement SELECTNAME= wait.until(ExpectedConditions.visibilityOfElementLocated(SelectName));
        SELECTNAME.click();
    }


    public void EnterTheDistance(String TheDistance)
    {
        WebElement ENTERDISTANCE= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterDistance));
        ENTERDISTANCE.sendKeys(TheDistance);
    }

    public void EnterTheMassage(String TheMassage)
    {
        WebElement ENTERMASSAGE= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterMessage));
        ENTERMASSAGE.sendKeys(TheMassage);
    }

    public void EnterTheDate(String OnDate)
    {
        WebElement ENTERDATE= wait.until(ExpectedConditions.visibilityOfElementLocated(enterDate));
        ENTERDATE.sendKeys(OnDate);
    }






















}
