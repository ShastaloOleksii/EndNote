package com.myendnoteweb.steps.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseStep {
    public WebDriver driver;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnTheButton(WebElement webElement) {
        webElement.click();
    }

}
