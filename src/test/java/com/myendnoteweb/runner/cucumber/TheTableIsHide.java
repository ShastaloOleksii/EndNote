package com.myendnoteweb.runner.cucumber;

import com.myendnoteweb.tests.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TheTableIsHide extends BaseTest {
    @Before
    public void openDriver() {
        setUp();
    }

    @After
    public void closeDriver() {
        close();
    }

    @Given("I am on collect tab and table is opened")
    public void I_Am_On_Collect_Tab_And_Table_Is_Opened() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToCollectPage();
        getCollectTabSteps().goToSelectFavorites();
    }

    @When("I click on the Hide link")
    public void I_Click_On_The_Hide_Link() {
        getCollectTabSteps().hideFavoritesTable();
    }

    @Then("I see the table is closed")
    public void I_See_The_Table_Is_Closed() {
        Assert.assertTrue(getMainSteps().isWebElementDisplayedXpath(".//div[contains(@id,'idCustomListLink')]/child::a"));
    }
}
