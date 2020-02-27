package com.myendnoteweb.steps;

import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadTabSteps extends BaseStep {

    public void switchToFrame(WebElement webElement) {
        driver.switchTo().frame(webElement);
    }

    public DownloadTabSteps(WebDriver driver) {
        super(driver);
    }

}
