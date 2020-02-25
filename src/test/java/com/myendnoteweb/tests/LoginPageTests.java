package com.myendnoteweb.tests;

import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.utils.CustomWaiter;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageTests extends LoginPage {

    @Test
    public void signIn() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//td[contains(@class,'heading')]"));
        //  | //a[contains(@title, 'Hide Getting Started Guide')]
    }

    @Test
    public void signOut() {
        signIN();
        click(personProSmallImg);
        fluentWait(logOutRef,5,5);
        Assert.assertTrue(driver.findElement(By.xpath(".//a[contains(@target,'self')]")).isDisplayed());
        click(logOutRef);
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }
    @Test
    public void clickToRegistrationButtonOnLoginPage() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        wait.until(CustomWaiter.visibilityOfElement(registrationButton));
        click(registrationButton);
        Assert.assertTrue(driver.findElement(By.xpath(".//input[contains(@id,'mat-input-8')]")).isDisplayed());

    }

}
