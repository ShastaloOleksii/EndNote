package com.my.endnote.web.tests.formattab;

import com.my.endnote.web.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class FormatTabTest extends BaseTest {

    @Test
    public void loginClickOnTheFormatTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToFormatPage();
        Assert.assertTrue(getFormatTabSteps().isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
        getFormatTabSteps().openFavoriteList();
        Assert.assertTrue(getFormatTabSteps().isWebElementDisplayedXpath(".//table[contains(@class, 'connectFiles')]"));

    }
}
