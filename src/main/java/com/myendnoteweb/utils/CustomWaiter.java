package com.myendnoteweb.utils;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CustomWaiter {

    public static ExpectedCondition<Boolean> visibilityOfElement(final WebElement webElement){
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                try {
                    return webElement.isDisplayed();
                }catch (NoSuchElementException e){
                    return false;
                }catch (StaleElementReferenceException e){
                    return false;
                }
            }
        };
    }

}
