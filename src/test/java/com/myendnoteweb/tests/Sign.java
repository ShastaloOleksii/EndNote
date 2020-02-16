package com.myendnoteweb.tests;

import org.junit.*;
import org.openqa.selenium.By;


public class Sign extends Settings {


    @Test
    public void signIn() {
        Assert.assertTrue(driver.findElement(By.xpath("//td[contains(@class,'heading')]")).isDisplayed());
    }

    @Test
    public void signOut() {
        driver.findElement(By.xpath("//img[@id='proSmallImg']")).click();
        driver.findElement(By.xpath("//a[contains(@target,'self')]")).click();
        Assert.assertTrue(driver.findElement(By.id("mat-input-0")).isDisplayed());

    }

}
