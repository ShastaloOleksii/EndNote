package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CollectTabTests extends MainPage {
    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        signIN();
        clickById("lgLink2");
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Online Search");
    }
}
