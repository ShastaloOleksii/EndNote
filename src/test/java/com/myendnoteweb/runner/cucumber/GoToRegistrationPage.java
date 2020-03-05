package com.myendnoteweb.runner.cucumber;

import com.myendnoteweb.tests.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoToRegistrationPage extends BaseTest {
    @Before
    public void openDriver() {
        setUp();
    }

    @After
    public void closeDriver() {
        close();
    }

    @Given("The SignInRegPage page is opened")
    public void The_SignInRegPage_Page_Is_Opened() {
        getLoginSteps().getHostLoginPage(getHost());
    }

    @When("I click on the Registration button")
    public void I_Click_On_The_Registration_Button() {
        getLoginSteps().goToRegistrationPage();

    }

    @Then("I see Registration page")
    public void I_See_Registration_Page() {
        Assert.assertTrue(getLoginSteps().isWebElementDisplayedXpath(".//input[contains(@id,'mat-input-8')]"));
    }

}
