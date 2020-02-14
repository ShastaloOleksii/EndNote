package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMyRef extends Settings {
    @Test
    public void allMyRef(){
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"idGuideLink\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"idGuideLink\"]/a")).click();
        driver.findElement(By.id("idFoderDesc")).isDisplayed();


    }
}
