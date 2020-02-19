package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OrganizeTabTests extends MainPage {
    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        signIN();
        clickById("lgLink3");
        String str = driver.findElement(By.xpath("//div[contains(@class,'heading')]")).getText();
        Assert.assertEquals(str, "Manage My Groups");
    }
}
