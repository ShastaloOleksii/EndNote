package com.myendnoteweb.tests.nottrivial;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class NotTrivialTests extends BaseTest {


    @Test
    public void allMyReferencesTitleIsPresentAfterClick() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().showOrHideGettingStartedGuide();
        Assert.assertTrue(getMailPageSteps().isWebElementDisplayedXpath(".//td[contains(text(), 'All My References')]"));
    }

    @Test //Here is bug
    public void loginClickOnTheFormatTabClickOnTheLogoMainPageOpened() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToFormatTabAndClickToLogo();
        getMainSteps().showOrHideGettingStartedGuide();
        Assert.assertTrue(getMailPageSteps().isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
    }

    @Test
    public void loginClickOnTheFormatTabClickOnTheMyReferencesMainPageOpened() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToFormatTabAdClickOnTheMyReferencesTab();
        Assert.assertTrue(getMailPageSteps().isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
    }
}
