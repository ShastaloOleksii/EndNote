package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = ".//button[contains(@class,'mat-stroked')]")
    protected WebElement registrationButton;

    @FindBy(xpath = ".//img[@id='proSmallImg']")
    public WebElement personProSmallImg;

    @FindBy(xpath = ".//a[contains(@target,'self')]")
    public WebElement logOutRef;

    @FindBy(xpath = ".//span[contains(text(),'Sign in')]")
    public  WebElement registerButton;

    @FindBy(xpath = ".//input[contains(@id,'mat-input-17')]")
    public  WebElement reEnterPassword;

    public WebElement getRegistrationButton() {
        return registrationButton;
    }


}
