package com.myendnoteweb.tests.organizetab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class OrganizeTabTests extends BaseTest {


    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToOrganizePage();
        Assert.assertTrue(getOrganizeTabSteps().isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));

    }
}
