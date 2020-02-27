package com.myendnoteweb.tests.login;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;

public class LoginPageTests extends BaseTest {


    @Test
    public void signIn() {
        getLoginSteps().insertLoginInLoginField(getLoginPage().getLoginField(), getLogin());
        getLoginSteps().insertPasswordField(getLoginPage().getPasswordField(), getPassword());
        getLoginSteps().clickOnTheButton(getLoginPage().getButtonLogIn());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
    }

    @Test
    public void signOut() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        getMainSteps().clickOnTheButton(getMainPage().getPersonProSmallImg());
        Assert.assertTrue(driver.findElement(By.xpath(".//a[contains(@target,'self')]")).isDisplayed());
        System.out.println("Before logOut");
        getLogOutSteps().clickOnTheButton(getLogOutPage().getLogOutRef());
        System.out.println("After logOut");
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));

    }
    @Test
    public void clickToRegistrationButtonOnLoginPage() {
        getLoginSteps().clickOnTheButton(getLoginPage().getRegistrationButton());
       /* Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        wait.until(CustomWaiter.visibilityOfElement(registrationButton));
        click(registrationButton);*/
        Assert.assertTrue(driver.findElement(By.xpath(".//input[contains(@id,'mat-input-8')]")).isDisplayed());

    }
}
