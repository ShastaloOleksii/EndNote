package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FormatTabTest extends MainPage {
    @Test
    public void loginClickOnTheFormatTabHeadingIsPresent() {
        signIN();
        clickById("lgLink4");
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Bibliography");
    }
}
