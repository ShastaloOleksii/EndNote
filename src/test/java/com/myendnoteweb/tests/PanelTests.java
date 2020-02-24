package com.myendnoteweb.tests;

import com.myendnoteweb.pages.PanelPage;
import org.junit.Test;
import org.testng.Assert;

public class PanelTests extends PanelPage {
    @Test
    public void panelQuickSearchIsPresent() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'sideHead')]"));
    }

    @Test
    public void panelQuickSearchIsHide() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name, 'citationSearchForm')]"));

    }

    @Test
    public void linUnFiledIsPresent() {
        signIN();
        click(unfiled);
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@class,'heading')] "));

    }
}
