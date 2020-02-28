package com.myendnoteweb.tests.panel;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class PanelTests extends BaseTest {

    @Test
    public void panelQuickSearchIsPresent() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'sideHead')]"));
    }

    @Test
    public void panelQuickSearchIsHide() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name, 'citationSearchForm')]"));

    }

    @Test
    public void linUnFiledIsPresent() {
        preconditions();
        getPanelSteps().clickOnTheButton(getPanelPage().getUnfiled());
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@class,'heading')] "));

    }
}
