package com.myendnoteweb.steps.base;

import com.myendnoteweb.utils.PagesProvider;
import com.myendnoteweb.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseStep {
    protected WebDriver driver;
    protected WaitUtils waitUtils;
    protected PagesProvider pagesProvider;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver, 3);
        pagesProvider = new PagesProvider(driver);
    }

    public boolean isWebElementDisplayedXpath(String xpath) {
        try {
            System.out.println("All ok, relax");
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