package com.myendnoteweb.tests.downloadtab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class DownloadsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToDownloadsPage();
        Assert.assertTrue(getDownloadTabSteps().isWebElementDisplayedXpath("//table[contains(@class,'contnav_lower')]"));
        getDownloadTabSteps().goToCaptureReference();
        getDownloadTabSteps().switchToIFrame();
        Assert.assertTrue(getDownloadTabSteps().isWebElementDisplayedXpath(".//div[contains(@class,'captureHeading')]"));

    }
}
