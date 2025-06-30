package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class roles {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");

    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
    private By AdminArea = By.xpath("(//div[@class='card app h-100'])[10]");
    private By Role = By.xpath("//a[@title='Roles']");
    private By Filterrole = By.xpath("//input[@placeholder='Filter roles by name']");
    private By Viewrole = By.xpath("//td[text()='aamol']");
    private By Deleterole = By.xpath("//button[@class='btn confirmation-prompt flex-fill btn-danger']");
    private By YesRole = By.xpath("//button[@class='btn confirmation-confirm flex-fill mr-1 btn-danger']");
    private By Archive = By.xpath("//button[@class='btn confirmation-prompt flex-fill btn-secondary']");
    private By YesArchive = By.xpath("//button[@class='btn confirmation-confirm flex-fill mr-1 btn-danger']");
    private By AddRoleM = By.xpath("//input[@type='search']");
    private By SelectRole = By.xpath("(//li[@role='option'])[23]");
    private By SubmitMembership = By.xpath("(//button[@type='submit'])[2]");
    private By DeleteM = By.xpath("(//button[@type='button'])[11]");
    private By RightArrow = By.xpath("//button[@class='btn flex-fill mr-1 btn-danger btn-sm border-0']");
    private By NewRole = By.xpath("//a[@data-test-id='button-new-role']");
    private By EnterroleName = By.xpath("//input[@class='form-control is-invalid']");
    private By Enterhandlerole = By.xpath("//input[@data-test-id='input-handle']");
    private By ClickSubmitRole = By.xpath("//button[@type='submit']");


    // Constructor to initialize driver
    public roles(WebDriver driver) {
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

    public void clickOnRole() {
        WebElement ROLES = wait.until(ExpectedConditions.visibilityOfElementLocated(Role));
        ROLES.click();
    }

    public void clickOnFilterRole(String FRole) {
        WebElement FILTERR = wait.until(ExpectedConditions.visibilityOfElementLocated(Filterrole));
        FILTERR.sendKeys(FRole);
    }

    public void clickOnViewRole() {
        WebElement VIEWROLES = wait.until(ExpectedConditions.visibilityOfElementLocated(Viewrole));
        VIEWROLES.click();
    }

    public void clickondeleteRole() {
        WebElement DELETEROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(Deleterole));
        DELETEROLE.click();
    }

    public void clickonYesdeleteRole() {
        WebElement YESROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(YesRole));
        YESROLE.click();
    }

    public void ArchivetheRole() {
        WebElement ARCHIVEROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(Archive));
        ARCHIVEROLE.click();
    }

    public void ClickYesArchivetheRole() {
        WebElement YESARCHIVEROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(YesRole));
        YESARCHIVEROLE.click();
    }

    public void ClickAddRole() {
        WebElement ADDROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(AddRoleM));
        ADDROLE.click();
    }

    public void SelectTheRole() {
        WebElement SELECTROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectRole));
        SELECTROLE.click();
    }

    public void SubmitTheMembership() {
        WebElement SUBMITM = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitMembership));
        SUBMITM.click();
    }

    public void ClickOnTheRightArrow() {
        WebElement RIGHTARROW = wait.until(ExpectedConditions.visibilityOfElementLocated(RightArrow));
        RIGHTARROW.click();
    }

    public void DeleteTheMembership() {
        WebElement DELETEM = wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteM));
        DELETEM.click();
    }

    public void ClickOnTheNewRole() {
        WebElement ROLEN = wait.until(ExpectedConditions.visibilityOfElementLocated(NewRole));
        ROLEN.click();
    }

    public void EnterTheNewRoleName(String NameR) {
        WebElement ENTERNEWROLENAME = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterroleName));
        ENTERNEWROLENAME.sendKeys(NameR);
    }

    public void EnterTheHandleRoleName(String NameHandle) {
        WebElement ENTERHANDLENAME = wait.until(ExpectedConditions.visibilityOfElementLocated(Enterhandlerole));
        ENTERHANDLENAME.sendKeys(NameHandle);
    }

    public void ClickSubmittheRole() {
        WebElement NewROLESubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSubmitRole));
        NewROLESubmit.click();
    }


}
