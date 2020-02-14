package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMenuTabs extends Settings {
    @Test
    public void mainTabs() {
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lgLink1")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lgLink7")));
        String id1 = driver.findElementById("lgLink1").getText();
        String id2 = driver.findElementById("lgLink2").getText();
        String id3 = driver.findElementById("lgLink3").getText();
        String id4 = driver.findElementById("lgLink4").getText();
        String id5 = driver.findElementById("lgLink5").getText();
        String id6 = driver.findElementById("lgLink6").getText();
        String id7 = driver.findElementById("lgLink7").getText();

        Assert.assertTrue(id1, true);
        System.out.println("id1");
        Assert.assertTrue(id2, true);
        System.out.println("id2");
        Assert.assertTrue(id3, true);
        System.out.println("id3");
        Assert.assertTrue(id4, true);
        System.out.println("id4");
        Assert.assertTrue(id5, true);
        System.out.println("id5");
        Assert.assertTrue(id6, true);
        System.out.println("id6");
        Assert.assertTrue(id7, true);
        System.out.println("id7");

    }
}
