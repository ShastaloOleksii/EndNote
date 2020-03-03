package com.myendnoteweb.tests.collecttab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class CollectTabTests extends BaseTest {


    // To do
    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        getLoginSteps().signIn(getLogin(),getPassword());
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getMainSteps().goToCollectPage();
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        //Need for finish the dropdown list
        getCollectTabSteps().clickOnSelectSearchConnection();
    }
}
