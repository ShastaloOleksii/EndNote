package com.myendnoteweb.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MainTabs extends Settings {
    @Before
    public void waIt() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'navbar-default')]")));
    }

    @Test
    public void myRef() {
        driver.findElement(By.id("lgLink1")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(), 'Show Getting')]")).isDisplayed());
    }

    @Test
    public void collect() {
        driver.findElement(By.id("lgLink2")).click();
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Online Search");
    }
    @Test
    public void organize() {
        driver.findElement(By.id("lgLink3")).click();
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Manage My Groups");
    }
    @Test
    public void format() {
        driver.findElement(By.id("lgLink4")).click();
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Bibliography");
    }
    @Test
    public void match() {
        driver.findElement(By.id("lgLink5")).click();
        String str = driver.findElement(By.xpath("//span[contains(text(),'Find the Best')]")).getText();
        Assert.assertEquals(str, "Find the Best Fit Journals for your Manuscript");
    }
    @Test
    public void options() {
        driver.findElement(By.id("lgLink6")).click();
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Change Password");
    }
    @Test
    public void downloads() {
        driver.findElement(By.id("lgLink7")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'contnav_lower')]")).isDisplayed());
    }
}
