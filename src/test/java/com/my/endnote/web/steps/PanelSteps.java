package com.my.endnote.web.steps;

import com.my.endnote.web.pages.PanelPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.net.MalformedURLException;

public class PanelSteps extends BaseStep {
    PanelPage panelPage;

    public PanelSteps() throws MalformedURLException {
        super();
        panelPage = pagesProvider.getPanelPage();
    }

    @Then("Panel search is present")
    public void panelPresentAssert() {
        if (isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'show')]")) {
            panelPage.getShowPanel().click();
            Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'hide')]"));
        }
    }

    @Then("Panel search is hide")
    public void panelIsHideAssert() {
        if (isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'hide')]")) {
            panelPage.getHidePanel().click();
            Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'show')]"));
        }
    }

    @When("I click on hide \"search panel\" button")
    public void showPanel() {
        if (isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'show')]")) {
            panelPage.getHidePanel().click();
            Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'hide')]"));
        }
    }

    @When("I click on show \"search panel\" button")
    public void hidePanel() {
        if (isWebElementDisplayedXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'hide')]")) {
            panelPage.getHidePanel().click();
        }
    }

    @Then("Link Unfield is present")
    public void linkUnfieldPresent() {
        if (isWebElementXpath(".//form[contains(@name,'hideshowpanel')]/child::input[contains(@value,'show')]")) {
            panelPage.getShowPanel().click();
        }
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(@title,'View references not in a group')]"));
    }


}
