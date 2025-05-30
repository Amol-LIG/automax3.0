package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class location {
    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");

    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
    private By AdminArea = By.xpath("(//div[@class='card app h-100'])[10]");
    private By Location = By.xpath("(//span[@class='d-inline-block w-75 text-nowrap text-truncate'])[4]");
    private By AddLocation = By.xpath("(//button[@data-test-id='button-new-user'])[1]");
    private By Addnode = By.xpath("//input[@placeholder='Name for the new node']");
    private By SaveNode = By.xpath("(//button[@class='btn btn-primary btn-xm'])[1]");
    private By LocationSearch = By.xpath("//input[@placeholder='Search location']");
    private By deletelocation = By.xpath("//div[@class='valueWrapper']");
    private By ArrowDelete = By.xpath("(//div[@class='tools']//button)[2]");


    // Constructor to initialize driver
    public location(WebDriver driver) {
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

    public void clicAdminArea() {
        WebElement clickAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(AdminArea));
        clickAdmin.click();
    }

    public void clickOnlocation() {
        WebElement clicklocation = wait.until(ExpectedConditions.visibilityOfElementLocated(Location));
        clicklocation.click();
    }

    public void Addthelocation() {
        WebElement ADDLOCATION = wait.until(ExpectedConditions.visibilityOfElementLocated(AddLocation));
        ADDLOCATION.click();
    }

    public void AddtheNewNode(String TheNode) {
        WebElement NEWNODE = wait.until(ExpectedConditions.visibilityOfElementLocated(Addnode));
        NEWNODE.sendKeys(TheNode);
    }

    public void ClickOnSaveNode() {
        WebElement SAVENODE = wait.until(ExpectedConditions.visibilityOfElementLocated(SaveNode));
        SAVENODE.click();
    }

    public void SearchTheLocation(String SLocation) {
        WebElement SLOCATION = wait.until(ExpectedConditions.visibilityOfElementLocated(LocationSearch));
        SLOCATION.sendKeys(SLocation);
    }

    public void deleteTheLocation() {
        WebElement DELETELOCATION = wait.until(ExpectedConditions.visibilityOfElementLocated(deletelocation));
        DELETELOCATION.click();
    }

    public void deleteTheLocationclickonarrow() {
        WebElement DELETELOCATIONARROW = wait.until(ExpectedConditions.visibilityOfElementLocated(ArrowDelete));
        DELETELOCATIONARROW.click();
    }


}
