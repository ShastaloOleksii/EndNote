package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePassord extends  Settings {
    @Test
    public void changePassword(){
        driver.findElement(By.id("lgLink6")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'heading')]")).isDisplayed());



    }

}
