package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.testng.Assert;

public class DownloadsTabTests extends MainPage {
    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        signIN();
        click(downloadsTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//table[contains(@class,'contnav_lower')]"));
    }
}
