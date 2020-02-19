package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DownloadsTabTests extends MainPage {
    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        signIN();
        clickById("lgLink7");
        Assert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'contnav_lower')]")).isDisplayed());
    }
}
