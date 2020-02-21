package com.myendnoteweb.tests;

import com.myendnoteweb.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OptionsTabTests extends MainPage {
    public OptionsTabTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        signIN();
        click(options);
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'heading')]"));
    }

}
