package com.myendnoteweb.tests.nottrivial;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class NotTrivialTests extends BaseTest {


    @Test
    public void allMyReferencesTitleIsPresentAfterClick() {
        preconditions();
        if (isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]")) {
            System.out.println("Show Getting Started Guide");
        } else {
            System.out.println("Hide Getting Started Guide");
            getMainSteps().clickOnTheButton(getMainPage().getHideGettingStartedGuide());
        }
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(text(), 'All My References')]"));
    }

    @Test //Here is bug
    public void loginClickOnTheFormatTabClickOnTheLogoMainPageOpened() {
        preconditions();
        getMainSteps().clickOnTheButton(getMainPage().getFormatTab());
        getMainSteps().clickOnTheButton(getMainPage().getLogo());
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
    }

    @Test
    public void loginClickOnTheFormatTabClickOnTheMyReferencesMainPageOpened() {
        preconditions();
        getMainSteps().clickOnTheButton(getMainPage().getFormatTab());
        getFormatTabSteps().clickOnTheButton(getFormatTabPage().getMyReferences());
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
    }
}
