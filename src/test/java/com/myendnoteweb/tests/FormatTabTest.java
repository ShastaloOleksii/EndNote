package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.testng.Assert;

public class FormatTabTest extends MainPage {
    @Test
    public void loginClickOnTheFormatTabHeadingIsPresent() {
        signIN();
        click(formatTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
