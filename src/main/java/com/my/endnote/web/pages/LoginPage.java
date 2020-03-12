package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = ".//input[@id = 'mat-input-0']")
    private WebElement loginField;

    @FindBy(id = "mat-input-1")
    private WebElement passwordField;

    @FindBy(xpath = ".//button[contains(@class,'mat-stroked')]")
    private WebElement registrationButton;

    @FindBy(xpath = ".//span[contains(text(),'Sign in') and not(@class)]")
    private WebElement SignInButton;

    public WebElement getLoginField() {
        return this.loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    public WebElement getSignInButton() {
        return SignInButton;
    }
}
