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
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'sideHead')]"));
    }

    public void panelIsHideAssert() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name, 'citationSearchForm')]"));
    }

    public void openedUnfieldTab() {
        panelPage.getUnfiled().click();
    }

}
