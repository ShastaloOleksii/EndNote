package com.my.endnote.web.steps;

import com.my.endnote.web.pages.OrganizeTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import org.testng.Assert;

public class OrganizeTabSteps extends BaseStep {
    OrganizeTabPage organizeTabPage;

    public OrganizeTabSteps() {
        super();
        organizeTabPage = pagesProvider.getOrganizeTabPage();
    }

    public void organizeHeadingAssert() {
        Assert.assertTrue(organizeTabPage.getOrganizeHeading().isDisplayed());
    }
}
