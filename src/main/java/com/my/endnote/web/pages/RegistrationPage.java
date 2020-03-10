package com.my.endnote.web.pages;

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

    @FindBy(xpath = ".//input[contains(@value,'I Agree')]")
    private WebElement buttonIAgree;

    @FindBy(xpath = ".//div[contains(@class,'navbar navbar-default')]")
    private WebElement navbarDefault;

    @FindBy(xpath = ".//input[contains(@value, 'Проверить почту')]")
    private WebElement checkMailBoxButton;

    @FindBy(xpath = ".//a[contains(@id,'lrefr')]")
    private WebElement refreshButtonInMailBox;

    @FindBy(xpath = ".//span[contains(text(),'EndNote')]")
    private WebElement mailFromEndNote;

    @FindBy(xpath = ".//a[contains(text(),'Click here to activate')]")
    private WebElement linkForActivateEndNote;

    @FindBy(xpath = ".//input[contains(value, '') and (@name)]")
    private WebElement fieldWithMailAddressInMailBox;

    @FindBy(xpath = ".//button")
    private WebElement buttonOfTheApprove;

    @FindBy(xpath = ".//center[contains(text(),'Нет писем для')]")
    private WebElement mailIsAbsentValue;

    public WebElement getMailIsAbsentValue() {
        return mailIsAbsentValue;
    }

    public WebElement getButtonOfTheApprove() {
        return buttonOfTheApprove;
    }

    public WebElement getFieldWithMailAddressInMailBox() {
        return fieldWithMailAddressInMailBox;
    }

    public WebElement getCheckMailBoxButton() {
        return checkMailBoxButton;
    }

    public WebElement getRefreshButtonInMailBox() {
        return refreshButtonInMailBox;
    }

    public WebElement getMailFromEndNote() {
        return mailFromEndNote;
    }

    public WebElement getLinkForActivateEndNote() {
        return linkForActivateEndNote;
    }

    public WebElement getButtonIAgree() {
        return buttonIAgree;
    }

    public WebElement getNavbarDefault() {
        return navbarDefault;
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
