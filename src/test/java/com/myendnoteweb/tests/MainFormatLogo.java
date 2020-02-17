package com.myendnoteweb.tests;


import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class MainFormatLogo extends MainPage {
    @Test
    public void mainFormatLogo() {
        signIN();
        clickById("lgLink4");
        clickByXpath(".//img[contains(@alt,'Clarivate Analytics')]");
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting')]"));

    }

}
