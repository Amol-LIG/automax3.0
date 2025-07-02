package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class zones {


        private WebDriver driver;
        private WebDriverWait wait;

        // Define locators
        private By usernameField = By.name("email");
        private By passwordField = By.name("password");
        private By Login = By.xpath("//button[text()='Login Without Captcha']");
        private By ClickOnSetting =By.xpath("(//button[@class='MuiButtonBase-root MuiBottomNavigationAction-root css-oeumz8'])[2]");
        private By ClickZones =By.xpath("//div[@aria-label='Zones']//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2wpwt4']");
private By ClickEdit =By.xpath("(//*[name()='path'])[2]");
    private By ClickSave =By.xpath("//button[text()='Save']");
private By DeleteZones =By.xpath("(//button[@type='button'])[3]");
    private By ClickRemove =By.xpath("//button[text()='Remove']");




        // Constructor to initialize driver
    public zones(WebDriver driver) {
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
        public void clickOnTheZones()
        {
            WebElement CLICKZONES= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickZones));
            CLICKZONES.click();
        }

    public void clickOnTheEditZones()
    {
        WebElement CLICKEDIT= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEdit));
        CLICKEDIT.click();
    }
    public void ClickOnTheSave()
    {
        WebElement CLICKSAVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSave));
        CLICKSAVE.click();
    }

    public void ClickOnTheDelete()
    {
        WebElement CLICKDELETE= wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteZones));
        CLICKDELETE.click();
    }

    public void ClickOnTheRemove()
    {
        WebElement REMOVE= wait.until(ExpectedConditions.visibilityOfElementLocated(ClickRemove));
        REMOVE.click();
    }



}
