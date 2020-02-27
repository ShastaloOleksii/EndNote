package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = ".//input[contains(@id,'mat-input-17')]")
    private WebElement reEnterPassword;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getReEnterPassword() {
        return reEnterPassword;
    }



}
