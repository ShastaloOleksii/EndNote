package com.myendnoteweb.steps;

import com.myendnoteweb.pages.MatchTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MatchTabSteps extends BaseStep {
    MatchTabPage matchTabPage;

    public MatchTabSteps(WebDriver driver) {
        super(driver);
        matchTabPage = pagesProvider.getMatchTabPage();
        //matchTabPage = PageFactory.initElements(driver, MatchTabPage.class);
    }


    public void matchTabHeadingAssert(){
        Assert.assertTrue(matchTabPage.getMatchTabHeading().isDisplayed());
    }
}
