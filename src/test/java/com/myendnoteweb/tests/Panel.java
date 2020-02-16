package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Panel extends Settings {
    @Test
    public void panel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[contains(@name,'citation')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'sideHead')]")).isDisplayed());
    }

    @Test
    public void hidePanel() {
        if (driver.findElement(By.xpath("//*[@id=\"sidepanel\"]/form")).isDisplayed()) {
            System.out.println("Pannel is present the test fail");
        } else {
            System.out.println("Panel is absent, test is passed");
        }
    }

    @Test
    public void unFiled() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"idGuideLink\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"idFolderLink_1\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"idFoderDesc\"]")).isDisplayed();

    }
}
