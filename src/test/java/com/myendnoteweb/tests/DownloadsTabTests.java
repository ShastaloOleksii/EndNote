package com.myendnoteweb.tests;

import com.myendnoteweb.pages.DownloadsTabPage;
import com.myendnoteweb.pages.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadsTabTests extends DownloadsTabPage {

    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        signIN();
        click(downloadsTab);
        Assert.assertTrue(isWebElementDisplayedXpath("//table[contains(@class,'contnav_lower')]"));
    }
}
