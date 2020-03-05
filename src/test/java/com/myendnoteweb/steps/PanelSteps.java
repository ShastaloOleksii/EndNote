package com.myendnoteweb.steps;

import com.myendnoteweb.pages.PanelPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PanelSteps extends BaseStep {
    PanelPage panelPage;

    public PanelSteps(WebDriver driver) {
        super(driver);
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
