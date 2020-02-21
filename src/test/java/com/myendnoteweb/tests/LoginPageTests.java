package com.myendnoteweb.tests;

import com.myendnoteweb.pages.MainPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;

public class LoginPageTests extends MainPage {

    public LoginPageTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void signIn() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//td[contains(@class,'heading')]"));
    }

    @Test
    public void signOut() {
        signIN();
//        wait.until(ExpectedConditions.visibilityOf(personProSmallImg));
        click(personProSmallImg);
        click(logOutRef);
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }
    @Test
    public void clickToRegistrationButtonOnLoginPage() {
        click(registrationButton);

    }

}
