package com.myendnoteweb.steps;

import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainSteps extends BaseStep {
    private MainPage mainPage;

    public MainSteps(WebDriver driver) {
        super(driver);
        mainPage = pagesProvider.getMainPage();
       // mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    public void goToCollectPage(){
        mainPage.getCollectTab().click();
    }

    public void goToLogOutPanel(){
        mainPage.getPersonProSmallImg().click();
    }

    public  void goToLoginPage(){
        mainPage.getLogOutRef().click();
    }

    public void goToDownloadsPage(){
        mainPage.getDownloadsTab().click();
    }
    public void goToFormatPage(){
        mainPage.getFormatTab().click();
    }
    public void goToMatchPage(){
        mainPage.getMatchTab().click();
    }
    public void goToOptionsPage(){
        mainPage.getOptions().click();
    }

    public  void goToOrganizePage(){
        mainPage.getOrganize().click();
    }
    public void goToMyReferencesPage(){
        mainPage.getMyReferencesTab().click();
    }

    public void learnAboutEndNoteEqualsAtribute(String atribute){
        Assert.assertEquals(true, mainPage.getLearnAboutEndNote().getAttribute(atribute));
    }

    public void showGettingStartedGuideAtribute(String atribute){
        Assert.assertEquals(true,mainPage.getFormatTab().getAttribute(atribute));
    }

}
