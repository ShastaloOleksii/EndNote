package com.my.endnote.web.steps;

import com.my.endnote.web.pages.OrganizeTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.Then;

public class OrganizeTabSteps extends BaseStep {
    OrganizeTabPage organizeTabPage;

    public OrganizeTabSteps() {
        super();
        organizeTabPage = pagesProvider.getOrganizeTabPage();
    }

    @Then("I am on the Organize tab")
    public void I_Am_On_The_Organize_Tab() {
        org.junit.Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
