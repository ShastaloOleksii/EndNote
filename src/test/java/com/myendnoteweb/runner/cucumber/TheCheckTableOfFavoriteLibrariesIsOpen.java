package com.myendnoteweb.runner.cucumber;

import com.myendnoteweb.tests.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TheCheckTableOfFavoriteLibrariesIsOpen extends BaseTest {

    @Before
    public void openDriver() {
        setUp();
    }

    @After
    public void closeDriver() {
        close();
    }

    @Given("I am on collect tab page")
    public void I_am_On_collect_tab_page() {
        getLoginSteps().signIn(getHost(), getLogin(), getPassword());
        getMainSteps().goToCollectPage();
    }

    @When("I click on the text Select Favorites")
    public void I_Click_On_The_Text_Select_Favorites() {
        getCollectTabSteps().goToSelectFavorites();
    }

    @Then("I see the tables of favorite libraries")
    public void I_See_The_Tables_Of_Favorite_Libraries() {
        Assert.assertTrue(getCollectTabSteps().isWebElementDisplayedXpath(".//span[contains(@id,'idHideCustomListLink')]"));
    }

}
