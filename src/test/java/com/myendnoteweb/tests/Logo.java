package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logo extends Settings {
    @Test
    public void logo() {
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"enwHeader\"]/div[1]/div/div/h1/a/span[1]/img")));
        driver.findElement(By.xpath("//*[@id=\"enwHeader\"]/div[1]/div/div/h1/a/span[1]/img")).isDisplayed();

    }
}
