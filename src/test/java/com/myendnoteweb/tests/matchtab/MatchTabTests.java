package com.myendnoteweb.tests.matchtab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class MatchTabTests extends BaseTest {

    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        preconditions();
        getMatchTabSteps().clickOnTheButton(getMainPage().getMatchTab());
        Assert.assertTrue(isWebElementDisplayedXpath("//span[contains(text(),'Find the Best')]"));
    }
}
