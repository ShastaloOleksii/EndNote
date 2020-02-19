package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.*;

public class LoginPageTests extends MainPage {

    @Test
    public void signIn() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//td[contains(@class,'heading')]"));
    }

    @Test
    public void signOut() {
        signIN();
        click(personProSmallImg);
        click(logOutRef);
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }

}
