package com.myendnoteweb.runner.cucumber;

import com.myendnoteweb.tests.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MultipleSignIn extends BaseTest {
    @Before
    public void openDriver() {
        setUp();
    }

    @After
    public void closeDriver() {
        close();
    }

    @Given("The SignIn page is opened multiple")
    public void TheSignIn_Page_Is_Opened() {
        getLoginSteps().getHostLoginPage(getHost());
    }

    @When("^I entered login (.*?) multiples$")
    public void I_Entered_Login(String login) {
        getLoginSteps().enterLogin(login);
    }

    @And("^I entered (.*?) multiple$")
    public void I_Entered_Password(String password) {
        getLoginSteps().enterPassword(password);
    }

    @And("I click on the button SignIn multiple")
    public void I_Click_On_The_ButtonSignIn() {
        getLoginSteps().goToMainPageSteps();
    }

    @Then("I see main page multiple")
    public void I_See_Main_Page() {
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
    }
}
