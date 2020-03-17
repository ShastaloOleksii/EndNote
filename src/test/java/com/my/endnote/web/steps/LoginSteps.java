package com.my.endnote.web.steps;

import com.my.endnote.web.pages.LoginPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import org.junit.Assert;

import java.net.MalformedURLException;

public class LoginSteps extends BaseStep {
    private LoginPage loginPage;

    public LoginSteps() throws MalformedURLException {
        super();
        loginPage = pagesProvider.getLoginPage();
    }

    @Given("^I am on main page \"(.*)\" \"(.*)\" \"(.*)\"$")
    @Description("This is sign in method get 3 parameters data")
    public void signIn(String url, String login, String password) {
        driver.get(url);
        loginPage.getLoginField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getSignInButton().click();
    }

    @Given("The SignIn page is opened \"(.*)\"$")
    public void getHostLoginPage(String url) {
        driver.get(url);
    }

    @When("I entered login \"(.*)\" and password \"(.*)\"$")
    public void enterLogin(String login, String password) {
        loginPage.getLoginField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(password);
    }


    @When("I click on the Registration button")
    public void goToRegistrationPage() {
        loginPage.getRegistrationButton().click();
    }

    @And("I click on the button SignIn")
    public void goToMainPageSteps() {
        loginPage.getSignInButton().click();
    }

    @Then("I see Registration page")
    public void I_See_Registration_Page() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//input[contains(@id,'mat-input-8')]"));
    }

    @Then("I see main page")
    public void I_See_Main_Page() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
    }

    @When("^I entered login (.*?) multiples$")
    public void I_Entered_Login(String login) {
        loginPage.getLoginField().sendKeys(login);
    }

    @And("^I entered (.*?) multiple$")
    public void I_Entered_Password(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }

    @Then("I am at Login page")
    public void i_Am_At_The_Login_Page() {
        Assert.assertTrue(isWebElementDisplayedID("mat-input-0"));
    }
}
