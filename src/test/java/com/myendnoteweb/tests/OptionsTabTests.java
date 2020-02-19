package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class OptionsTabTests extends MainPage {
    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        signIN();
        clickById("lgLink6");
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'heading')]"));
    }


}
