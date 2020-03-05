package com.myendnoteweb.steps;

import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseStep {
    LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        super(driver);
        loginPage = pagesProvider.getLoginPage();
    }

    public void signIn(String host, String login, String password) {
        driver.get(host);
        loginPage.getLoginField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getSignInButton().click();
    }

    public void goToRegistrationPage() {
        loginPage.getRegistrationButton().click();
    }

    public void getHostLoginPage(String host) {
        driver.get(host);
    }

    public void enterLogin(String login) {
        loginPage.getLoginField().sendKeys(login);
    }

    public void enterPassword(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }

    public void goToMainPageSteps() {
        loginPage.getSignInButton().click();
    }

}
