package com.myendnoteweb.tests.formattab;

import com.myendnoteweb.tests.base.BaseTest;
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
