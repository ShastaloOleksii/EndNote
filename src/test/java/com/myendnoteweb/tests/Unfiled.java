package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Unfiled extends  Settings {
    @Test
    public void unfiled(){
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"idGuideLink\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"idFolderLink_1\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"idFoderDesc\"]")).isDisplayed();

    }
}
