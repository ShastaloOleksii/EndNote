package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.*;
import org.openqa.selenium.By;


public class Sign extends MainPage {


    @Test
    public void signIn() {
        signIN();
        Assert.assertTrue(isWebElementDisplayed("//td[contains(@class,'heading')]"));
    }

    @Test
    public void signOut() {
        signIN();
        clickByXpath("//img[@id='proSmallImg']");
        clickByXpath("//a[contains(@target,'self')]");
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }

}
