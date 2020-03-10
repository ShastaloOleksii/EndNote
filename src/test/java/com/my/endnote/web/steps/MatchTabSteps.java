package com.my.endnote.web.steps;

import com.my.endnote.web.pages.MatchTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import org.testng.Assert;

public class MatchTabSteps extends BaseStep {
    MatchTabPage matchTabPage;

    public MatchTabSteps() {
        super();
        matchTabPage = pagesProvider.getMatchTabPage();
    }

    public void matchTabHeadingAssert() {
        Assert.assertTrue(matchTabPage.getMatchTabHeading().isDisplayed());
    }
}
