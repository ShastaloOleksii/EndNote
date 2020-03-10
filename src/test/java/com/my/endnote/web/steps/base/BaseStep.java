package com.my.endnote.web.steps.base;

import com.my.endnote.web.utils.DriverProvider;
import com.my.endnote.web.utils.WaitUtils;
import com.my.endnote.web.utils.PagesProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseStep {
    protected WebDriver driver;
    protected WaitUtils waitUtils;
    protected PagesProvider pagesProvider;

    public BaseStep() {
        driver = DriverProvider.getDriver();
        waitUtils = WaitUtils.getWaitUtils(20);
        pagesProvider = PagesProvider.getPagesProvider();
    }

    public boolean isWebElementDisplayedXpath(String xpath) {
        try {
            return driver.findElement(By.xpath(xpath)).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("The test is fail, web element is absent on the page");
            return false;
        }
    }

    public boolean waitForVisible(WebElement web) {
        try {
            //wait.until(ExpectedConditions.visibilityOf(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}