package com.myendnoteweb.tests.downloadtab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class DownloadsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        preconditions();
        getDownloadTabSteps().clickOnTheButton(getMainPage().getDownloadsTab());
        Assert.assertTrue(isWebElementDisplayedXpath("//table[contains(@class,'contnav_lower')]"));
        getDownloadTabSteps().clickOnTheButton(getDownloadsTabPage().getEndNoteCapture());
        driver.switchTo().frame(getDownloadsTabPage().getiFrame());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'captureHeading')]"));

    }
}
