package com.my.endnote.web.tests.optiontab;

import com.my.endnote.web.tests.base.BaseTest;
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
