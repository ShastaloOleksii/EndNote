package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MatchTabTests extends MainPage {
    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        signIN();
        click(matchTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//span[contains(text(),'Find the Best')]"));
    }
}
