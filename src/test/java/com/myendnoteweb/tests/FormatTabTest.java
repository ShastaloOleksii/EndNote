package com.myendnoteweb.tests;

import com.myendnoteweb.pages.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FormatTabTest extends MainPage {
    public FormatTabTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginClickOnTheFormatTabHeadingIsPresent() {
        signIN();
        click(formatTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
