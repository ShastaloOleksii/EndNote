package com.my.endnote.web.tests.login;

import com.my.endnote.web.tests.base.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;

public class LoginPageTests extends BaseTest {


    @Test

    public void signIn() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
    }

    @Test
    public void signOut() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getMainSteps().goToLogOutPanel();
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//a[contains(@target,'self')]"));
        getMainSteps().goToLoginPage();
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }

    @Test
    public void clickToRegistrationButtonOnLoginPage() {
        getLoginSteps().getHostLoginPage(getHost());
        getLoginSteps().goToRegistrationPage();
        Assert.assertTrue(driver.findElement(By.xpath(".//input[contains(@id,'mat-input-8')]")).isDisplayed());

    }
}
