package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CollectTabTests extends MainPage {
    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        signIN();
        click(collectTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
