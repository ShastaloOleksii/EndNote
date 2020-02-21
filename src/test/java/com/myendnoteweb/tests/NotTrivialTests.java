package com.myendnoteweb.tests;

import com.myendnoteweb.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class NotTrivialTests extends MainPage {
    public NotTrivialTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void allMyReferencesTitleIsPresentAfterClick() {
        signIN();
        if (isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]")) {
            System.out.println("Show Getting Started Guide");
        } else {
            System.out.println("Hide Getting Started Guide");
            click(hideGettingStartedGuide);
        }
        Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(text(), 'All My References')]"));
    }

    @Test
    public void loginClickOnTheFormatTabClickOnTheLogoMainPageOpened() {
        signIN();
        click(formatTab);
        click(logo);
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
    }
    @Test
    public void loginClickOnTheFormatTabClickOnTheMyReferencesMainPageOpened() {
        signIN();
        click(formatTab);
        click(myReferencesTab);
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
    }
}
