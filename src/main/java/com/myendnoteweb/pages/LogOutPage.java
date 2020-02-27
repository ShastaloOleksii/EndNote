package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage {

    @FindBy(xpath = ".//a[contains(@target,'self')]")
    private WebElement logOutRef;

    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogOutRef() {
        return logOutRef;
    }




}
