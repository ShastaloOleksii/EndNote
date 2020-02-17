package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePassord extends MainPage {
    @Test
    public void changePassword() {
        //driver.findElement(By.id("lgLink6")).click();
        signIN();
        clickById("lgLink6");
        Assert.assertTrue(isWebElementDisplayed("//div[contains(@class,'heading')]"));


    }

}
