package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPageTests extends MainPage {
    WebDriverWait wait;


    @Test
    public void mainPageApprove() {
        signIN();
        clickByXpath(".//img[@id='proSmallImg']");
        Assert.assertTrue(isWebElementDisplayedXpath("//span[contains(@class,'fa-cog')]"));

    }

    @Test
    public void mainTabsMenu() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'navbar-default')]"));
    }

    @Test
    public void logoPresent() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));

    }

    @Test
    public void localizationPanel() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedID("languages1"));

    }
}
