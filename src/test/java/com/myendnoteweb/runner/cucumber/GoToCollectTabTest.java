package com.myendnoteweb.runner.cucumber;

import com.myendnoteweb.tests.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class GoToCollectTabTest extends BaseTest {

    @Before
    public void openDriver() {
        setUp();
    }

    @After
    public void closeDriver() {
        close();
    }

    @Given("I am on main page")
    public void i_am_on_main_page() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')] | .//a[contains(text(), 'Hide Getting Started Guide')]"));
    }

    @When("I click on Collect tab")
    public void i_click_on_Collect_tab() {
        getMainSteps().goToCollectPage();
    }


    @Then("I am on Collect tab")
    public void i_am_on_Collect_tab() {
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//div[contains(@id,'idCustomListLink')]/child::a"));
    }


}
