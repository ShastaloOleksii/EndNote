package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.testng.Assert;

public class PanelTests extends MainPage {

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
        clickByXpath(".//a[contains(@title,'View references not in a group')]");
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@class,'heading')] "));

    }
}
