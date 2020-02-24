package com.myendnoteweb.tests;

import com.myendnoteweb.base.BasePage;
import com.myendnoteweb.base.BaseTest;
import com.myendnoteweb.pages.CollectTabPage;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CollectTabTests extends CollectTabPage {

    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        signIN();
        click(collectTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
