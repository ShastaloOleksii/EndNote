package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = ".//label[contains(@class,'mat-form-field-label ng-tns-c16-0 ng-star-inserted mat-empty mat-form-field-empty')]")
    private WebElement emptyLoginField;

    @FindBy(xpath = ".//input[@id = 'mat-input-0']")
    private WebElement loginField;

    @FindBy(id = "mat-input-1")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'btn--login')]")
    private WebElement buttonLogIn;

    @FindBy(xpath = ".//button[contains(@class,'mat-stroked')]")
    private WebElement registrationButton;

    @FindBy(xpath = ".//span[contains(text(),'Sign in') and not(@class)]")
    private WebElement SignInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField() {
        return this.loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getButtonLogIn() {
        return buttonLogIn;
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }


    public WebElement getSignInButton() {
        return SignInButton;
    }

    public WebElement getEmptyLoginField() {
        return emptyLoginField;
    }



   /* public LoginPage(WebDriver driver) {
        if (!driver.getCurrentUrl().contains("https://access.clarivate.com/login?app=endnote")) {
            throw new IllegalStateException(
                    "This is not the page you are expected"
            );
        }
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }*/

    public void insertLoginInLoginField(String login) {
        loginField.sendKeys(login);
    }

    public void insertPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnTheSignInButton() {
        buttonLogIn.click();
    }

}
