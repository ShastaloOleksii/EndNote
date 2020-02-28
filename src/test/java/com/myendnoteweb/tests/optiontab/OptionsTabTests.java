package com.myendnoteweb.tests.optiontab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class OptionsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        preconditions();
        getOptionTabSteps().clickOnTheButton(getMainPage().getOptions());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'heading')]"));
    }

}
