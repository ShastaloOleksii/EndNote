package com.myendnoteweb.tests.downloadtab;

import com.myendnoteweb.pages.DownloadsTabPage;
import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadsTabTests extends BaseTest {




    @Test
    public void loginClickOnTheDownloadsTabHeadingIsPresent() {
        preconditions();
        MainPage mainPage = new MainPage(driver);
        getDownloadTabSteps().clickOnTheButton(mainPage.getDownloadsTab());
        Assert.assertTrue(isWebElementDisplayedXpath("//table[contains(@class,'contnav_lower')]"));
        DownloadsTabPage downloadsTabPage = new DownloadsTabPage(driver);
        getDownloadTabSteps().clickOnTheButton(downloadsTabPage.getEndNoteCapture());
        driver.switchTo().frame(downloadsTabPage.getiFrame());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'captureHeading')]"));

    }
}
