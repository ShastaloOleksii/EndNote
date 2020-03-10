package com.my.endnote.web.steps;

import com.my.endnote.web.pages.RegistrationPage;
import com.my.endnote.web.steps.base.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class RegistrationPageSteps extends BaseStep {

    RegistrationPage registrationPage;

    public RegistrationPageSteps() {
        super();
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

    public void switchToWindow(ArrayList<String> tabs, int number) {
        driver.switchTo().window(tabs.get(number));
    }

    public void waitForMail() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void waitForMail2() throws InterruptedException {
        int index = 50;
        for (int i = 0; i < index; i++) {
            if (registrationPage.getMailIsAbsentValue().isDisplayed()) {
                waitUtils.wait(3);
                registrationPage.getRefreshButtonInMailBox().click();
            } else {
                switchToMailIframe();
            }

        }
    }

    public void openWindow() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
    }


}
