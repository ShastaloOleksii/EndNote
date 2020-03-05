package com.myendnoteweb.tests.optiontab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class OptionsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToOptionsPage();
        Assert.assertTrue(getOptionTabSteps().isWebElementDisplayedXpath(".//div[contains(@class,'heading')]"));
    }

}
