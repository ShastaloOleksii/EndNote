package com.myendnoteweb.tests.collecttab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class CollectTabTests extends BaseTest {


    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getMainSteps().goToCollectPage();
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getCollectTabSteps().goToSelectFavorites();
        getCollectTabSteps().hideFavoritesTable();
    }
}
