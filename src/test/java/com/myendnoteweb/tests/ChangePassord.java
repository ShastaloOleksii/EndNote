package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class ChangePassord extends MainPage {
    @Test
    public void changePassword() {
        //driver.findElement(By.id("lgLink6")).click();
        signIN();
        clickById("lgLink6");
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));


    }

}
