package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainTabsTests extends MainPage {


    @Test
    public void myRef() {
        signIN();
        clickById("lgLink1");
        Assert.assertTrue(isWebElementDisplayedXpath("//a[contains(text(), 'Show Getting')]"));
    }

    @Test
    public void collect() {
        signIN();
        clickById("lgLink2");
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
        signIN();
        clickById("lgLink4");
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
