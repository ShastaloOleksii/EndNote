package com.myendnoteweb.tests;

import com.myendnoteweb.base.BaseTest;
import com.myendnoteweb.pages.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CollectTabTests extends MainPage {
    public CollectTabTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        signIN();
        click(collectTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
