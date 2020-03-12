package com.my.endnote.web.steps;

import com.my.endnote.web.pages.MatchTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MatchTabSteps extends BaseStep {
    MatchTabPage matchTabPage;

    public MatchTabSteps() {
        super();
        matchTabPage = pagesProvider.getMatchTabPage();
    }

    @And("I am entered title \"(.*)\"$")
    public void enterTitle(String title) {
        matchTabPage.getTitleField().sendKeys(title);
    }

    @And("I am entered abstract \"(.*)\"$")
    public void enterAbstract(String abstractText) {
        matchTabPage.getAbstractField().sendKeys(abstractText);
    }

    @Then("I am on Match tab")
    public void matchTabHeadingAssert() {
        Assert.assertTrue(matchTabPage.getMatchTabHeading().isDisplayed());
    }

    @Then("page with jornals is opened")
    public void clickButtonFindJornals() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'jou_match')]"));
    }

    @And("I am clicking on the button Find Jornals")
    public void clickFindJornalButton() {
        matchTabPage.getFindJornalsButton().click();
    }
}
