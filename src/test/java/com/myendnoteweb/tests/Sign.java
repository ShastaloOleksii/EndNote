package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.*;


public class Sign extends MainPage {


    @Test
    public void signIn() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//td[contains(@class,'heading')]"));
    }

    @Test
    public void signOut() {
        signIN();
        clickByXpath("//img[@id='proSmallImg']");
        clickByXpath("//a[contains(@target,'self')]");
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }

}
