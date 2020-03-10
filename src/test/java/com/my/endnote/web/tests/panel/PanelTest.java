package com.my.endnote.web.tests.panel;

import com.my.endnote.web.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

import java.util.logging.Logger;


public class PanelTest extends BaseTest {
    private final static Logger LOG = Logger.getLogger(PanelTest.class.getName());

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
//        getPanelSteps().openedUnfieldTab();
        if(getMainSteps().isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'show')]")){
            getPanelSteps().hidePanel();
            getPanelSteps().openedUnfieldTab();
            Assert.assertTrue(getPanelSteps().isWebElementDisplayedXpath(".//div[contains(@class,'folderActive')]"));
        }else {
            getPanelSteps().openedUnfieldTab();
            Assert.assertTrue(getPanelSteps().isWebElementDisplayedXpath(".//div[contains(@class,'folderActive')]"));
        }
    }
}
