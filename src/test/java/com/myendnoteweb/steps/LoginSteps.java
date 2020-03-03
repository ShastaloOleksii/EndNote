package com.myendnoteweb.steps;

import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps extends BaseStep {
    LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        super(driver);

        loginPage = pagesProvider.getLoginPage();
        //loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public void signIn(String login, String password) {
        loginPage.getLoginField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getSignInButton().click();
    }

    public void goToRegistrationPage(){
        loginPage.getRegistrationButton().click();
    }



    public void insertLoginInLoginField(WebElement webElement, String login) {
        webElement.sendKeys(login);
    }

    public void insertPasswordField(WebElement webElement, String password) {
        webElement.sendKeys(password);
    }


}
