package com.myendnoteweb.steps;

import com.myendnoteweb.pages.RegistrationPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class RegistrationPageSteps extends BaseStep {

    RegistrationPage registrationPage;

    public RegistrationPageSteps(WebDriver driver) {
        super(driver);
        registrationPage = pagesProvider.getRegistrationPage();
//        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }

    public String readingEmail(String email) {
        email = registrationPage.getFieldWithMailAddressInMailBox().getAttribute("value");
        return email;
    }

    public void registrationLowLevelProcess(String password, String firstName, String laastName, String email) {
        registrationPage.getFirstRegistrationButton().click();
        registrationPage.getEmailAddressField().click();
        registrationPage.getEmailAddressField().clear();
        registrationPage.getEmailAddressField().sendKeys(email);
        registrationPage.getPasswordField().sendKeys(password);
        registrationPage.getReEnterPassword().click();
        registrationPage.getReEnterPassword().clear();
        registrationPage.getReEnterPassword().sendKeys(password);
        registrationPage.getFirstNameField().click();
        registrationPage.getFirstNameField().clear();
        registrationPage.getFirstNameField().sendKeys(firstName);
        registrationPage.getLastNameField().click();
        registrationPage.getLastNameField().clear();
        registrationPage.getLastNameField().sendKeys(laastName);
        registrationPage.getSecondRegistrationButton().click();
    }

    public void goToMailBox() {
        registrationPage.getCheckMailBoxButton().click();
    }

    public void registrationFinalStep(String email, String password) {
        registrationPage.getButtonOfTheApprove().click();
        registrationPage.getLoginOnTheLoginPage().sendKeys(email);
        registrationPage.getPasswordOnTheLoginPage().sendKeys(password);
        registrationPage.getSignInButtonOnLoginPage().click();
        registrationPage.getButtonIAgree().click();
    }

    public void navbarVisibleFinalAssert() {
        Assert.assertTrue(waitForVisible(registrationPage.getNavbarDefault()));
    }

    public void refreshButtonOfMailBox() {
        registrationPage.getRefreshButtonInMailBox().click();
    }

    public void checkMailFromEndNot() {
        registrationPage.getMailFromEndNote().click();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void switchToMailIframe() {
        driver.switchTo().frame(registrationPage.getIframeMail());
    }

    public void linkApprovingInMail() {
        registrationPage.getLinkForActivateEndNote().click();
    }

    public void goToPage(String url) {
        driver.get(url);
    }

    public void registrationIntermediateLevelProcess(String urlBefore, String email, String urlAfter) {
        refreshButtonOfMailBox();
        switchToMailIframe();
        linkApprovingInMail();
        refreshPage();
        driver.get(urlBefore + email + urlAfter);
    }

    public void switchToWindow(ArrayList<String> tabs, int number){
        driver.switchTo().window(tabs.get(number));
    }


}
