package com.myendnoteweb.runner.cucumber;

import com.myendnoteweb.tests.base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;

public class SignIn extends BaseTest {
    @Before
    public void openDriver() {
        setUp();
    }


    @After
    public void close() {
        driver.quit();
    }

    @Given("The SignIn page is opened")
    public void TheSignIn_Page_Is_Opened() {
        getLoginSteps().getHostLoginPage(getHost());
    }

    @When("I entered login")
    public void I_Entered_Login() {
        getLoginSteps().enterLogin(getLogin());
    }

    @And("I entered password")
    public void I_Entered_Password() {
        getLoginSteps().enterPassword(getPassword());
    }

    @And("I click on the button SignIn")
    public void I_Click_On_The_ButtonSignIn() {
        getLoginSteps().goToMainPageSteps();
    }

    @Then("I see main page")
    public void I_See_Main_Page() {
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
    }

}
