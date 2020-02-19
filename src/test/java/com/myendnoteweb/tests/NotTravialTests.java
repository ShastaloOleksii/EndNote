package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class NotTravialTests extends MainPage {
    @Test
    public void allMyReferencesTitleIsPresentAfterClick() {
        signIN();
        if (isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]")) {
            System.out.println("Show Getting Started Guide");
        } else {
            System.out.println("Hide Getting Started Guide");
            clickByXpath(".//a[contains(text(), 'Hide Getting Started Guide')]");
        }
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(text(), 'All My References')]"));
    }

    @Test
    public void loginClickOnTheFormatTabClickOnTheLogoMainPageOpened() {
        signIN();
        clickById("lgLink4");
        clickByXpath(".//img[contains(@alt,'Clarivate Analytics')]");
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting')]"));
    }
    @Test
    public void loginClickOnTheFormatTabClickOnTheMyReferencesMainPageOpened() {
        signIN();
        clickById("lgLink4");
        clickById("lgLink1");
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting')]"));
    }
}
