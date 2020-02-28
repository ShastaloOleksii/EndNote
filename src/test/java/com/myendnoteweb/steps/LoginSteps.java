package com.myendnoteweb.steps;

import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps extends BaseStep {


    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    public void insertLoginInLoginField(WebElement webElement, String login) {
        webElement.sendKeys(login);
    }

    public void insertPasswordField(WebElement webElement, String password) {
        webElement.sendKeys(password);
    }


}
