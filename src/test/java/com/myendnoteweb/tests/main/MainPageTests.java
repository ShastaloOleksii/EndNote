package com.myendnoteweb.tests.main;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class MainPageTests extends BaseTest {


    @Test
    public void loginMainPageIsOpened() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')] | .//a[contains(text(), 'Hide Getting Started Guide')]"));

    }

    @Test
    public void goToCollectTab() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToCollectPage();
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//div[contains(@id,'idCustomListLink')]/child::a"));
    }

    @Test
    public void loginClickOnTheMyReferencesTabHeadingIsPresent() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToMyReferencesPage();
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//td[contains(@id, 'idFoderDesc')]"));
    }

    @Test
    public void loginMainTabsMenuIsPresentOnTheMainPage() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath("//div[contains(@class,'navbar-default')]"));
    }

    @Test
    public void loginLogoPresentOnTheMainPage() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));

    }

    @Test
    public void loginLocalizationPanelIsPresentOnTheMainPage() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(isWebElementDisplayedID("languages1"));

    }

    @Test
    public void loginLearnAboutEndNoteAttributes() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(attributes(getMainSteps().getMainPage().getLearnAboutEndNote(), "class"));
        //getMainSteps().learnAboutEndNoteEqualsAtribute(getClassAtribute());
    }

    @Test
    public void loginShowGettingStartedGuide() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(attributes(getMainSteps().getMainPage().getFormatTab(), "alt"));
    }
}
