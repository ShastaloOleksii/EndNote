package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {





    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    public WebElement showGettingStartedGuide;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    public WebElement collectTabHeading;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    public WebElement formatTabHeading;

    @FindBy(xpath = "//span[contains(text(),'Find the Best')]")
    public WebElement matchTabHeading;

    @FindBy(xpath = ".//div[contains(@id,'idError') and .//a[contains(@title,'Learn')]]")
    public WebElement learnAboutEndNote;




   /* public void signIN() {
        getLoginField().sendKeys(login);
        System.out.println("Login");
        getPasswordField().sendKeys(password);
        System.out.println("Password");
        getButtonLogIn().click();
        System.out.println("Press button");
    }*/

    public boolean waitForVisible(WebElement web) {
        try {
            //wait.until(ExpectedConditions.visibilityOf(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
}
