package com.myendnoteweb.tests.collecttab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class CollectTabTests extends BaseTest {


// To do
    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getCollectTabSteps().clickOnTheButton(getMainPage().getCollectTab());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getCollectTabSteps().clickOnTheButton(getCollectTabPage().getSelectSearchConnection());
        //Need for finish the dropdown list

    }
}
