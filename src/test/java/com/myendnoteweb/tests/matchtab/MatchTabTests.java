package com.myendnoteweb.tests.matchtab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class MatchTabTests extends BaseTest {

    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToMatchPage();
        Assert.assertTrue(getMatchTabSteps().isWebElementDisplayedXpath("//span[contains(text(),'Find the Best')]"));
    }
}
