package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class department {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By Captcha = By.xpath("//input[@name='captchaSolution']");

    private By Login = By.xpath("(//button[@type='submit'])[2]");
    private By Shpassword = By.xpath("//input[@type='checkbox']");
    private By AdminArea = By.xpath("(//div[@class='card app h-100'])[10]");
    private By department = By.xpath("(//span[@class=\"d-inline-block w-75 text-nowrap text-truncate\"])[3]");
    private By FilterD = By.xpath("//input[@type='search']");
    private By selectmember = By.xpath("//td[text()='amol giram']");
    private By updatemembership = By.xpath("(//input[@placeholder='Start typing to search for users'])[1]");
    private By SelectM = By.xpath("(//li[@role='option'])[23]");
    private By SubmitMe = By.xpath("(//button[@data-test-id='button-submit'])[2]");
    private By Addlocation = By.xpath("(//div[@class='vue-treeselect__value-container'])[1]");
    private By Selectlocation = By.xpath("//label[@class='vue-treeselect__label']");
    private By LocationSUb = By.xpath("(//button[@data-test-id=\"button-submit\"])[4]");
    private By DeleteLocation = By.xpath("(//div[@class='vue-treeselect__x-container'])[1]");
    private By AddClasscification = By.xpath("(//div[@class=\"vue-treeselect__value-container\"])[2]");
    private By Selectclasscification = By.xpath("//label[@class='vue-treeselect__label']");
    private By ClassificationSub = By.xpath("(//button[@data-test-id='button-submit'])[5]");
    private By DeleteClassification = By.xpath("//div[@class='vue-treeselect__x-container']");
    private By NewDepartment = By.xpath("//a[@href='/admin/system/department/new']");
    private By EnterDepartmentName = By.xpath("//input[@data-test-id='input-name']");
    private By HandleName = By.xpath("//input[@data-test-id='input-handle']");
    private By SubmitDepartment = By.xpath("//button[@class='btn ml-auto btn-primary btn-md']");
    private By ClickDeleteMembership = By.xpath("(//button[@type='button'])[7]");
    private By ArrowClick = By.xpath("//button[@class='btn flex-fill mr-1 btn-danger btn-sm border-0']");
    private By ClickRole = By.xpath("(//input[@placeholder='Start typing to search for users'])[2]");
    private By SelectRole = By.xpath("(//li[@role='option'])[20]");
    private By SubmitRole = By.xpath("(//button[@class='btn ml-auto btn-primary btn-md'])[3]");
    private By ClickDeleteRole = By.xpath("(//button[@type='button'])[8]");
    private By RoleArrow = By.xpath("//button[@class='btn flex-fill mr-1 btn-danger btn-sm border-0']");


    // Constructor to initialize driver
    public department(WebDriver driver) {
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

    public void clickdepartment() {
        WebElement DEPARTMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(department));
        DEPARTMENT.click();
    }

    public void Filterdepartment(String DFilter) {
        WebElement FDEPARTMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(FilterD));
        FDEPARTMENT.sendKeys(DFilter);
    }

    public void clickontheMember() {
        WebElement MEMBER = wait.until(ExpectedConditions.visibilityOfElementLocated(selectmember));
        MEMBER.click();
    }

    public void clickonUpdateMembership() {
        WebElement UPDATEM = wait.until(ExpectedConditions.visibilityOfElementLocated(updatemembership));
        UPDATEM.click();
    }

    public void SelectTheMembership() {
        WebElement SELECTM = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectM));
        SELECTM.click();

    }

    public void SubmitTheMembership() {
        WebElement SUBMITM = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitMe));
        SUBMITM.click();

    }

    public void ClickOnTheDeleteMembership() {
        WebElement DDELETEMEMBERSHIP = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeleteMembership));
        DDELETEMEMBERSHIP.click();

    }

    public void ClickOnTheArrow() {
        WebElement CLICKARROW = wait.until(ExpectedConditions.visibilityOfElementLocated(ArrowClick));
        CLICKARROW.click();

    }

    public void ClickOnTherole() {
        WebElement CLICKARROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRole));
        CLICKARROLE.click();

    }

    public void SelectOnTherole() {
        WebElement SSELECTROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectRole));
        SSELECTROLE.click();

    }

    public void ClickOnTheSubmitRole() {
        WebElement SUBMITRROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitRole));
        SUBMITRROLE.click();

    }

    public void ClickOnTheDeleteRole() {
        WebElement DDELETEROLE = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickDeleteRole));
        DDELETEROLE.click();

    }

    public void ClickOnTheRoleArrow() {
        WebElement CLICKROLEARROW = wait.until(ExpectedConditions.visibilityOfElementLocated(RoleArrow));
        CLICKROLEARROW.click();

    }

    public void AddTheLocation() {
        WebElement ADDLOACTION = wait.until(ExpectedConditions.visibilityOfElementLocated(Addlocation));
        ADDLOACTION.click();

    }

    public void SelectTheLocation() {
        WebElement SELECTLOACTION = wait.until(ExpectedConditions.visibilityOfElementLocated(Selectlocation));
        SELECTLOACTION.click();

    }

    public void SubmitTheLocation() {
        WebElement SUBMITLOACTION = wait.until(ExpectedConditions.visibilityOfElementLocated(LocationSUb));
        SUBMITLOACTION.click();
    }

    public void DeleteTheLocation() {
        WebElement DELETELOACTION = wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteLocation));
        DELETELOACTION.click();
    }


    public void AddTheClassificaton() {
        WebElement ADDCLASSIFICATION = wait.until(ExpectedConditions.visibilityOfElementLocated(AddClasscification));
        ADDCLASSIFICATION.click();
    }

    public void SelectTheClassification() {
        WebElement SELECTCLASSIFICATION = wait.until(ExpectedConditions.visibilityOfElementLocated(Selectclasscification));
        SELECTCLASSIFICATION.click();
    }

    public void SubmitTheClassification() {
        WebElement SSSUBMITCLASSIFICATION = wait.until(ExpectedConditions.visibilityOfElementLocated(ClassificationSub));
        SSSUBMITCLASSIFICATION.click();
    }

    public void DeleteTheClassification() {
        WebElement DELETECLASSIFICATION = wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteClassification));
        DELETECLASSIFICATION.click();
    }


    public void CreateNewDepartment() {
        WebElement NEWDEPARTMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(NewDepartment));
        NEWDEPARTMENT.click();
    }

    public void EntertheDepartmentname(String DepartmentNAME) {
        WebElement ENTERDEPARTMENTNAME = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterDepartmentName));
        ENTERDEPARTMENTNAME.sendKeys(DepartmentNAME);
    }

    public void EntertheDepartmentHandlename(String DepartmentHandle) {
        WebElement HANDLENAME = wait.until(ExpectedConditions.visibilityOfElementLocated(HandleName));
        HANDLENAME.sendKeys(DepartmentHandle);
    }

    public void SubmittheNewDepartment() {
        WebElement SSUBMITNEWDEPARTMENT = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitDepartment));
        SSUBMITNEWDEPARTMENT.click();
    }


}
