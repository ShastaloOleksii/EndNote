package com.myendnoteweb.tests.downloadtab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class DownloadsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getMainSteps().goToDownloadsPage();
        Assert.assertTrue(getDownloadTabSteps().isWebElementDisplayedXpath("//table[contains(@class,'contnav_lower')]"));
       // getDownloadTabSteps().downloadsTabPage
        getDownloadTabSteps().switchToIFrame();
        Assert.assertTrue(getDownloadTabSteps().isWebElementDisplayedXpath(".//div[contains(@class,'captureHeading')]"));

    }
}
