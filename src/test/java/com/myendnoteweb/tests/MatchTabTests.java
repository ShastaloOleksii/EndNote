package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MatchTabTests extends MainPage {
    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        signIN();
        clickById("lgLink5");
        String str = driver.findElement(By.xpath("//span[contains(text(),'Find the Best')]")).getText();
        Assert.assertEquals(str, "Find the Best Fit Journals for your Manuscript");
    }
}
