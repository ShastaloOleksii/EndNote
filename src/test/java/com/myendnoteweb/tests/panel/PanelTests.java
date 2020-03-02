package com.myendnoteweb.tests.panel;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;

import java.util.logging.Logger;


public class PanelTests extends BaseTest {
    private  final  static Logger LOG = Logger.getLogger(PanelTests.class.getName());

    @Test
    public void panelQuickSearchIsPresent() {
        LOG.info("enter userCanLogin test");
        getLoginSteps().signIn(getLogin(),getPassword());
        getPanelSteps().panelPresentAssert();
    }

    @Test
    public void panelQuickSearchIsHide() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getPanelSteps().panelIsHideAssert();
    }

    @Test
    public void linkUnFiledIsPresent() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getPanelSteps().openedUnfieldTab();
        getPanelSteps().unfieldTabHeadingAssert();
    }
}
