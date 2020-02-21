package com.myendnoteweb.tests;

import com.myendnoteweb.pages.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MatchTabTests extends MainPage {
    public MatchTabTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        signIN();
        click(matchTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//span[contains(text(),'Find the Best')]"));
    }
}
