package com.myendnoteweb.tests.login;

import com.myendnoteweb.pages.LogOutPage;
import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;

public class LoginPageTests extends BaseTest {


    @Test
    public void signIn() {
        LoginPage loginPage = new LoginPage(driver);
        getLoginSteps().insertLoginInLoginField(loginPage.getLoginField(), getLogin());
        getLoginSteps().insertPasswordField(loginPage.getPasswordField(), getPassword());
        getLoginSteps().clickOnTheButton(loginPage.getButtonLogIn());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
    }

    @Test
    public void signOut() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        MainPage mainPage = new MainPage(driver);
        getMainSteps().clickOnTheButton(mainPage.getPersonProSmallImg());
        Assert.assertTrue(driver.findElement(By.xpath(".//a[contains(@target,'self')]")).isDisplayed());
        LogOutPage logOutPage = new LogOutPage(driver);
        System.out.println("Before logOut");
        getLogOutSteps().clickOnTheButton(logOutPage.getLogOutRef());
        System.out.println("After logOut");
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }
    @Test
    public void clickToRegistrationButtonOnLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        getLoginSteps().clickOnTheButton(loginPage.getRegistrationButton());
       /* Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        wait.until(CustomWaiter.visibilityOfElement(registrationButton));
        click(registrationButton);*/
        Assert.assertTrue(driver.findElement(By.xpath(".//input[contains(@id,'mat-input-8')]")).isDisplayed());

    }
}
