package com.myendnoteweb.tests.panel;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

import java.util.logging.Logger;


public class PanelTests extends BaseTest {
    private final static Logger LOG = Logger.getLogger(PanelTests.class.getName());

    @Test
    public void panelQuickSearchIsPresent() {
        LOG.info("enter userCanLogin test");
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getPanelSteps().panelPresentAssert();
    }

    @Test
    public void panelQuickSearchIsHide() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getPanelSteps().panelIsHideAssert();
    }

    @Test
    public void linkUnFiledIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getPanelSteps().openedUnfieldTab();
        Assert.assertTrue(getPanelSteps().isWebElementDisplayedXpath(".//td[contains(@class,'heading')]"));
    }
}
