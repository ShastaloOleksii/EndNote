package com.myendnoteweb.tests.main;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.*;

public class MainPageTests extends BaseTest {


    @Test
    public void loginMainPageIsOpened() {
        getLoginSteps().signIn(getLogin(),getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')] | .//a[contains(text(), 'Hide Getting Started Guide')]"));

    }

    @Test
    public void loginClickOnTheMyReferencesTabHeadingIsPresent() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getMainSteps().goToMyReferencesPage();
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//td[contains(@id, 'idFoderDesc')]"));
    }

    @Test
    public void loginMainTabsMenuIsPresentOnTheMainPage() {
        getLoginSteps().signIn(getLogin(),getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath("//div[contains(@class,'navbar-default')]"));
    }

    @Test
    public void loginLogoPresentOnTheMainPage() {
        getLoginSteps().signIn(getLogin(),getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));

    }

    @Test
    public void loginLocalizationPanelIsPresentOnTheMainPage() {
        getLoginSteps().signIn(getLogin(),getPassword());
        Assert.assertTrue(isWebElementDisplayedID("languages1"));

    }

    @Test
    public void loginLearnAboutEndNoteAttributes() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getMainSteps().learnAboutEndNoteEqualsAtribute(getClassAtribute());
    }

    @Test
    public void loginShowGettingStartedGuide() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getMainSteps().showGettingStartedGuideAtribute(getAltAtribute());

    }
}
