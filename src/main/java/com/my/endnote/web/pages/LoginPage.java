package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class LoginPage extends BasePage {
    private final static Logger LOG = Logger.getLogger(LoginPage.class.getName());
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

    public WebElement getLoginField() {
        LOG.finest("Take login field");
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
