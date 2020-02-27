package com.myendnoteweb.tests.panel;

import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.pages.PanelPage;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
        PanelPage panelPage = new PanelPage(driver);
        getPanelSteps().clickOnTheButton(panelPage.getUnfiled());
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@class,'heading')] "));

    }
}
