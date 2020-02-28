package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = ".//input[contains(@id,'mat-input-8')]")
    private WebElement reEnterPassword;

    @FindBy(xpath = ".//input[contains(@id, 'mat-input-3')]")
    private WebElement emailAddressField;

    @FindBy(xpath = ".//input[contains(@id, 'mat-input-7')]")
    private WebElement passwordField;

    @FindBy(xpath = ".//input[contains(@id, 'mat-input-4')]")
    private WebElement firstNameField;

    @FindBy(xpath = ".//input[contains(@id, 'mat-input-5')]")
    private WebElement lastNameField;

    @FindBy(xpath = ".//button[contains(@class, 'mat-stroked-button mat-primary ng-star-inserted')]")
    private WebElement firstRegistrationButton;

    @FindBy(xpath = ".//button[contains(@class, 'mat-flat-button mat-primary')]")
    private WebElement secondRegistrationButton;

    @FindBy(xpath = ".//iframe[contains(@name,'ifmail')]")
    private WebElement iframeMail;

    @FindBy(xpath = ".//iframe[contains(@id,'ifinbox')]")
    private WebElement iframeInBox;

    @FindBy(xpath = ".//iframe[ @id = \"ifc\"]")
    private WebElement frameIfcEmail;

    @FindBy(xpath = ".//input[@id = 'mat-input-9']")
    private WebElement loginOnTheLoginPage;

    @FindBy(xpath = ".//input[@id = 'mat-input-10']")
    private WebElement passwordOnTheLoginPage;

    @FindBy(xpath = ".//button[contains(@type,'submit') and not(@title)]")
    private WebElement signInButtonOnLoginPage;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getFrameIfcEmail() {
        return frameIfcEmail;
    }


    public WebElement getLoginOnTheLoginPage() {
        return loginOnTheLoginPage;
    }

    public WebElement getPasswordOnTheLoginPage() {
        return passwordOnTheLoginPage;
    }

    public WebElement getSignInButtonOnLoginPage() {
        return signInButtonOnLoginPage;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getFirstRegistrationButton() {
        return firstRegistrationButton;
    }

    public WebElement getSecondRegistrationButton() {
        return secondRegistrationButton;
    }

    public WebElement getIframeMail() {
        return iframeMail;
    }

    public WebElement getIframeInBox() {
        return iframeInBox;
    }


    public WebElement getReEnterPassword() {
        return reEnterPassword;
    }


}
