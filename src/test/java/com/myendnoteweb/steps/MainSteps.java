package com.myendnoteweb.steps;

import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class MainSteps extends BaseStep {
    private MainPage mainPage;

    public MainSteps(WebDriver driver) {
        super(driver);
        mainPage = pagesProvider.getMainPage();
    }

    public MainPage getMainPage() {
        return mainPage;
    }

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
            System.out.println("Show Getting Started Guide");
        } else {
            System.out.println("Hide Getting Started Guide");
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
