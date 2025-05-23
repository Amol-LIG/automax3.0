package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class classification {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");

    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
    private By AdminArea = By.xpath("(//div[@class='card app h-100'])[10]");
private By classifications = By.xpath("(//label[@class='title mb-0 pointer'])[5]");
private By Addclassification =By.xpath("//button[@class='btn btn-primary btn-lg']");
private By Enterclassification =By.xpath("//input[@placeholder='Name for the new node']");
private By Saveclassification =By.xpath("(//button[@type='button'])[8]");
private By SearchClassification =By.xpath("//input[@placeholder='Search Classification']");
private By DeleteClassification =By.xpath("(//div[@class='valueWrapper'])[1]");
private By DeleteArrow =By.xpath("((//div[@class=\"tools\"])//button)[2]");




    // Constructor to initialize driver
    public classification(WebDriver driver) {
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

    public void clickLogin()
    {
        WebElement loginclick= wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        loginclick.click();
    }
    public void clicAdminArea()
    {
        WebElement clickAdmin= wait.until(ExpectedConditions.visibilityOfElementLocated(AdminArea));
        clickAdmin.click();
    }
    public void clickclassification()
    {
        WebElement CLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(classifications));
        CLASSIFICATION.click();
    }
    public void clickOnAddclassification()
    {
        WebElement ADDCLASSI= wait.until(ExpectedConditions.visibilityOfElementLocated(Addclassification));
        ADDCLASSI.click();
    }
    public void entertheclassification(String CLASS)
    {
        WebElement ENTERCLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(Enterclassification));
        ENTERCLASSIFICATION.sendKeys(CLASS);
    }

    public void Savetheclassification()
    {
        WebElement SAVECLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(Saveclassification));
        SAVECLASSIFICATION.click();
    }
    public void Searchtheclassification(String SClassification)
    {
        WebElement SEARCHCLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(SearchClassification));
        SEARCHCLASSIFICATION.sendKeys(SClassification);
    }
    public void deletetheclassification()
    {
        WebElement DELETECLASSIFICATION= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteClassification));
        DELETECLASSIFICATION.click();
    }
    public void deletetheArrow()
    {
        WebElement DDELETEARROW= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteArrow));
        DDELETEARROW.click();
    }











}
