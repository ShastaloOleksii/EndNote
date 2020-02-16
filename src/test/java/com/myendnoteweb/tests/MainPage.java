package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MainPage extends Settings {

    @Test
    public void mainPageApprove() {
        wait.until(ExpectedConditions.titleIs("EndNote"));
        driver.findElement(By.xpath("//img[@id='proSmallImg']")).click();
        driver.findElement(By.xpath("//span[contains(@class,'fa-cog')]")).isDisplayed();
    }

    @Test
    public void mainTabsMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'navbar-default')]")));
        driver.findElement(By.xpath("//div[contains(@class,'navbar-default')]"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'navbar-default')]")).isDisplayed());
    }

    @Test
    public void logoPresent() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'Clarivate Analytics')]")));
        driver.findElement(By.xpath("//img[contains(@alt,'Clarivate Analytics')]")).isDisplayed();

    }

    @Test
    public void localizationPanel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("languages1")));
        String lang = driver.findElementById("languages1").getText();
        System.out.println(lang);
        org.junit.Assert.assertTrue(lang, true);

    }

}
