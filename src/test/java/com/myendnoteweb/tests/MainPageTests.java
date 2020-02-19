package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.testng.Assert;

public class MainPageTests extends MainPage {


    @Test
    public void loginMainPageIsOpened() {
        signIN();
        clickByXpath(".//img[@id='proSmallImg']");
        Assert.assertTrue(isWebElementDisplayedXpath("//span[contains(@class,'fa-cog')]"));

    }

    @Test
    public void loginClickOnTheMyReferencesTabHeadingIsPresent() {
        signIN();
        clickById("lgLink1");
        Assert.assertTrue(isWebElementDisplayedXpath("//a[contains(text(), 'Show Getting')]"));
    }

    @Test
    public void loginMainTabsMenuIsPresentOnTheMainPage() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'navbar-default')]"));
    }

    @Test
    public void loginLogoPresentOnTheMainPage() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));

    }

    @Test
    public void loginLocalizationPanelIsPresentOnTheMainPage() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedID("languages1"));

    }
}
