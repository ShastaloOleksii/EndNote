package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {
    //int timeout;
    // WebDriverWait wait = new WebDriverWait(driver, timeout);

    @FindBy(xpath = ".//img[@id='proSmallImg']")
    public WebElement personProSmallImg;

    @FindBy(xpath = ".//a[contains(@target,'self')]")
    public WebElement logOutRef;

    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    public WebElement showGettingStartedGuide;

    @FindBy(xpath = ".//a[contains(text(), 'Hide Getting Started Guide')]")
    public WebElement hideGettingStartedGuide;

    @FindBy(id = "mat-input-0")
    public WebElement loginField;

    @FindBy(id = "mat-input-1")
    public WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'btn--login')]")
    public WebElement buttonLogIn;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    public WebElement collectTabHeading;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    public WebElement formatTabHeading;

    @FindBy(xpath = "//span[contains(text(),'Find the Best')]")
    public WebElement matchTabHeading;

    @FindBy(id = "lgLink2")
    public WebElement collectTab;

    @FindBy(id = "lgLink7")
    public WebElement downloadsTab;

    @FindBy(id = "lgLink4")
    public WebElement formatTab;

    @FindBy(id = "lgLink1")
    public WebElement myReferencesTab;

    @FindBy(id = "lgLink5")
    public WebElement matchTab;

    @FindBy(xpath = ".//img[contains(@alt,'Clarivate Analytics')]")
    public WebElement logo;

    @FindBy(id = "lgLink6")
    public WebElement options;

    @FindBy(id = "lgLink3")
    public WebElement organize;

    @FindBy(xpath = ".//a[contains(@title,'View references not in a group')]")
    public WebElement unfiled;

    @FindBy(xpath = ".//div[contains(@id,'idError') and .//a[contains(@title,'Learn')]]")
    public WebElement learnAboutEndNote;

    @FindBy(xpath = ".//button[contains(@class,'mat-stroked')]")
    public WebElement registrationButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void signIN() {
        loginField.sendKeys(login);
        System.out.println("Login");
        passwordField.sendKeys(password);
        System.out.println("Password");
        buttonLogIn.click();
        System.out.println("Press button");
    }

    public boolean waitForVisible(WebElement web) {
        try {
            wait.until(ExpectedConditions.visibilityOf(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
}
