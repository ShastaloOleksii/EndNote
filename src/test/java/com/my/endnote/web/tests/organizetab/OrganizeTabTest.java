package com.my.endnote.web.tests.organizetab;

import com.my.endnote.web.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class OrganizeTabTest extends BaseTest {


    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToOrganizePage();
        Assert.assertTrue(getOrganizeTabSteps().isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));

    }
}
