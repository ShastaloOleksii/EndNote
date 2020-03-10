package com.my.endnote.web.steps;

import com.my.endnote.web.pages.PanelPage;
import com.my.endnote.web.steps.base.BaseStep;
import org.testng.Assert;

public class PanelSteps extends BaseStep {
    PanelPage panelPage;

    public PanelSteps() {
        super();
        panelPage = pagesProvider.getPanelPage();
    }

    public void panelPresentAssert() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'hide')]"));
    }

    public void panelIsHideAssert() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//input[contains(@value,'show')]]"));
    }

    public void openedUnfieldTab() {
        panelPage.getUnfiled().click();
    }

    public void hidePanel(){
        panelPage.getHidePanel().click();
    }

}
