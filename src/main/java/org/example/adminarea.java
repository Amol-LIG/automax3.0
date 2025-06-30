package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class adminarea {


    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");

    private By AdminArea = By.xpath("(//div[@class='card app h-100'])[10]");
    private By Users = By.xpath("(//label[@class='title mb-0 pointer'])[2]");
    private By Filter = By.xpath("//input[@type='search']");
    private By Delete = By.xpath("//td[text()='Amol Giram']");
    private By Clickdelete = By.xpath("(//button[@type=\"button\"])[7]");
    private By Yes = By.xpath("//button[@class='btn confirmation-confirm flex-fill mr-1 btn-danger']");
    private By Suspend = By.xpath("(//button[@class='btn confirmation-prompt flex-fill btn-light'])[1]");
    private By Syes = By.xpath("//button[@class='btn confirmation-confirm flex-fill mr-1 btn-danger']");
    private By RRevokeUser= By.xpath("//td[text()='amol girammm']");
    private By Revoke = By.xpath("(//button[@class='btn confirmation-prompt flex-fill btn-light'])[2]");
    private By yesrevoke = By.xpath("//button[@class='btn confirmation-confirm flex-fill mr-1 btn-danger']");
    private By Avator = By.xpath("(//button[@class=\"btn p-0 rounded-circle bg-white border-white shadow-none btn-secondary\"])[1]");
    private By SaveA = By.xpath("//button[@class='btn btn-primary']");
    private By SubmitA = By.xpath("(//button[@class='btn ml-auto btn-primary btn-md'])[2]");
    private By ALLOWRole = By.xpath("//input[@type='search']");
    private By SelectRole = By.xpath("(//li[@role='option'])[14]");
    private By SubmitRole = By.xpath("(//button[@data-test-id='button-submit'])[3]");
    private By DeleteRoleMembershipUser = By.xpath("//button[@class='btn btn-outline-danger btn-sm  border-0 flex-fill']");
    private By ClickArrow = By.xpath("//button[@class='btn flex-fill mr-1 btn-danger btn-sm border-0']");
    private By CreateNewU = By.xpath("//a[@data-test-id='button-new-user']");
    private By NewEmail = By.xpath("//input[@data-test-id='input-email']");
    private By EnterName = By.xpath("//input[@data-test-id='input-name']");
    private By EnterHandle = By.xpath("//input[@data-test-id='input-handle']");
    private By SubmitNew = By.xpath("(//button[@type='submit'])[1]");
    private By StartAction = By.xpath("(//button[@class='btn h-auto'])[1]");
    private By DateStart = By.xpath("//span[text()='7']");
    private By EndAction = By.xpath("(//button[@class='btn h-auto'])[3]");
    private By DateEnd = By.xpath("//span[text()='13']");
    private By ActionSearch = By.xpath("//button[@class='btn ml-auto btn-primary']");


    // Constructor to initialize driver
    public adminarea(WebDriver driver) {
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

    public void clickLogin() {
        WebElement loginclick = wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
        loginclick.click();
    }

    public void enterthecaptcha(String captcha) {
        WebElement ENTERCAPTCHA = wait.until(ExpectedConditions.visibilityOfElementLocated(Captcha));
        ENTERCAPTCHA.sendKeys(captcha);
    }

    public void clicAdminArea() {
        WebElement clickAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(AdminArea));
        clickAdmin.click();
    }

    public void ClickOnUser() {
        WebElement clicktheuser = wait.until(ExpectedConditions.visibilityOfElementLocated(Users));
        clicktheuser.click();
    }

    public void FilterTheUser(String USER) {
        WebElement FILTER = wait.until(ExpectedConditions.visibilityOfElementLocated(Filter));
        FILTER.sendKeys(USER);
    }

    public void DeleteUser() {
        WebElement duser = wait.until(ExpectedConditions.visibilityOfElementLocated(Delete));
        duser.click();
    }

    public void ClockOnDelete() {
        WebElement CLICKDELETE = wait.until(ExpectedConditions.visibilityOfElementLocated(Clickdelete));
        CLICKDELETE.click();
    }

    public void ClockOnYes() {
        WebElement CLICKYes = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
        CLICKYes.click();
    }

    public void Suspendtheuser() {
        WebElement SUSER = wait.until(ExpectedConditions.visibilityOfElementLocated(Suspend));
        SUSER.click();
    }

    public void ClickOnsuspendyes() {
        WebElement SYES = wait.until(ExpectedConditions.visibilityOfElementLocated(Syes));
        SYES.click();
    }
    public void ClickOnrevokeUser() {
        WebElement RREVOKEUSERR = wait.until(ExpectedConditions.visibilityOfElementLocated(RRevokeUser));
        RREVOKEUSERR.click();
    }
    public void ClickOnrevoke() {
        WebElement revokethe = wait.until(ExpectedConditions.visibilityOfElementLocated(Revoke));
        revokethe.click();
    }

    public void ClickOnyesrevoke() {
        WebElement yesrevokethe = wait.until(ExpectedConditions.visibilityOfElementLocated(yesrevoke));
        yesrevokethe.click();
    }

    public void ClickOnAvator() {
        WebElement ClickAvator = wait.until(ExpectedConditions.visibilityOfElementLocated(Avator));
        ClickAvator.click();
    }

    public void ClickOnSaveandCloseAvator() {
        WebElement ClicksavecloseAvator = wait.until(ExpectedConditions.visibilityOfElementLocated(SaveA));
        ClicksavecloseAvator.click();
    }

    public void ClickOnSubmitAvator() {
        WebElement ClicksubmitAvator = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitA));
        ClicksubmitAvator.click();
    }

    public void ClickOnAllowrole() {
        WebElement Clickrole = wait.until(ExpectedConditions.visibilityOfElementLocated(ALLOWRole));
        Clickrole.click();
    }

    public void SelecttheRole() {
        WebElement roleselect = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectRole));
        roleselect.click();
    }

    public void ClickOnthesubmitRole() {
        WebElement roleSUBMIT = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitRole));
        roleSUBMIT.click();
    }

    public void DeleteTheRoleOfTheMembershipForUser() {
        WebElement FORUSER = wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteRoleMembershipUser));
        FORUSER.click();
    }

    public void ClickOnTheArrow() {
        WebElement CCLICKARROW = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickArrow));
        CCLICKARROW.click();
    }

    public void ClickOnthecreatenewuser() {
        WebElement Createnewuser = wait.until(ExpectedConditions.visibilityOfElementLocated(CreateNewU));
        Createnewuser.click();
    }

    public void EnterTheNewEmail(String EmailNew) {
        WebElement EMAIL = wait.until(ExpectedConditions.visibilityOfElementLocated(NewEmail));
        EMAIL.sendKeys(EmailNew);
    }

    public void EnterTheNewName(String NewName) {
        WebElement NEWNAME = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterName));
        NEWNAME.sendKeys(NewName);
    }

    public void EnterTheNewhandle(String handle) {
        WebElement ENTERHANDLE = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterHandle));
        ENTERHANDLE.sendKeys(handle);
    }

    public void SubmitTheHandle() {
        WebElement HandleSUBMIT = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitNew));
        HandleSUBMIT.click();
    }

    public void ClickOnTheStartAction() {
        WebElement SSTARTACTION = wait.until(ExpectedConditions.visibilityOfElementLocated(StartAction));
        SSTARTACTION.click();
    }

    public void ClickOnTheStartDate() {
        WebElement DDATESTART = wait.until(ExpectedConditions.visibilityOfElementLocated(DateStart));
        DDATESTART.click();
    }

    public void ClickOnTheEndAction() {
        WebElement EENDACTION = wait.until(ExpectedConditions.visibilityOfElementLocated(EndAction));
        EENDACTION.click();
    }

    public void ClickOnTheEndDate() {
        WebElement DATEEND = wait.until(ExpectedConditions.visibilityOfElementLocated(DateEnd));
        DATEEND.click();
    }

    public void ClickOnTheActionSearch() {
        WebElement AACTIONSEARCH = wait.until(ExpectedConditions.visibilityOfElementLocated(ActionSearch));
        AACTIONSEARCH.click();
    }

}




