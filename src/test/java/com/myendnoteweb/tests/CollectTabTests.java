package com.myendnoteweb.tests;

import com.myendnoteweb.base.BaseTest;
import com.myendnoteweb.pages.CollectTabPage;
import com.myendnoteweb.utils.CustomWaiter;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CollectTabTests extends BaseTest {

    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        signIN();
        click(collectTabPage.collectTab);
        //wait.until(CustomWaiter.visibilityOfElement(showGettingStartedGuide));
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
