package com.myendnoteweb.tests.organizetab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class OrganizeTabTests extends BaseTest {


    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        preconditions();
        getOrganizeTabSteps().clickOnTheButton(getMainPage().getOrganize());
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
