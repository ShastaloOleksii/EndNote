package com.myendnoteweb.tests.main;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.*;

public class MainPageTests extends BaseTest {

    @Test
    public void loginMainPageIsOpened() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')] | .//a[contains(text(), 'Hide Getting Started Guide')]"));

    }

    @Test
    public void loginClickOnTheMyReferencesTabHeadingIsPresent() {
        preconditions();
        getMainSteps().clickOnTheButton(getMainPage().getMyReferencesTab());
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@id, 'idFoderDesc')]"));
    }

    @Test
    public void loginMainTabsMenuIsPresentOnTheMainPage() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'navbar-default')]"));
    }

    @Test
    public void loginLogoPresentOnTheMainPage() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));

    }

    @Test
    public void loginLocalizationPanelIsPresentOnTheMainPage() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedID("languages1"));

    }

    @Test
    public void loginLearnAboutEndNoteAttributes() {
        preconditions();
        Assert.assertTrue(attributes(getMainPage().getLearnAboutEndNote(), "class"));
    }

    @Test
    public void loginShowGettingStartedGuide() {
        preconditions();
        Assert.assertTrue(attributes(getMainPage().getFormatTab(), "alt"));

    }
}
