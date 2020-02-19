package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class OptionsTabTests extends MainPage {
    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        signIN();
        click(options);
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'heading')]"));
    }


}
