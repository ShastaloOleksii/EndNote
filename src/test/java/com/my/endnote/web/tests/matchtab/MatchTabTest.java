package com.my.endnote.web.tests.matchtab;

import com.my.endnote.web.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class MatchTabTest extends BaseTest {

    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToMatchPage();
        Assert.assertTrue(getMatchTabSteps().isWebElementDisplayedXpath("//span[contains(text(),'Find the Best')]"));
    }
}
