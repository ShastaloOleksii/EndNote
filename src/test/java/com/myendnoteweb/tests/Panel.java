package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Panel extends Settings {
    @Test
    public void panel() {
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sidepanel\"]/form")));
        driver.findElement(By.name("citationSearchForm")).isDisplayed();



    }
}
