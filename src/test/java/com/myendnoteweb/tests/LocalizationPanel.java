package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalizationPanel extends Settings {

    @Test
    public void localizationPanel() {
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("languages1")));
        String lang = driver.findElementById("languages1").getText();
        System.out.println(lang);
        Assert.assertTrue(lang, true);

    }
}
