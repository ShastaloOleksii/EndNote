package com.my.endnote.web.steps;

import com.my.endnote.web.pages.MainPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.When;

public class MainSteps extends BaseStep {
    private MainPage mainPage;

    public MainSteps() {
        super();
        mainPage = pagesProvider.getMainPage();
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    @When("I am on collect tab page")
    public void goToCollectPage() {
        mainPage.getCollectTab().click();
    }

    public void goToLogOutPanel() {
        mainPage.getPersonProSmallImg().click();
    }

    public void goToLoginPage() {
        mainPage.getLogOutRef().click();
    }

    public void goToDownloadsPage() {
        mainPage.getDownloadsTab().click();
    }

    public void goToFormatPage() {
        mainPage.getFormatTab().click();
    }

    public void goToMatchPage() {
        mainPage.getMatchTab().click();
    }

    public void goToOptionsPage() {
        mainPage.getOptions().click();
    }

    public void goToOrganizePage() {
        mainPage.getOrganize().click();
    }

    public void goToMyReferencesPage() {
        mainPage.getMyReferencesTab().click();
    }

    public void showOrHideGettingStartedGuide() {
        if (isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]")) {
        } else {
            mainPage.getHideGettingStartedGuide().click();
        }
    }

    public void goToFormatTabAndClickToLogo() {
        mainPage.getFormatTab().click();
        mainPage.getLogo().click();
    }

    public void goToFormatTabAdClickOnTheMyReferencesTab() {
        mainPage.getFormatTab().click();
        mainPage.getMyReferencesTab().click();
    }

}
