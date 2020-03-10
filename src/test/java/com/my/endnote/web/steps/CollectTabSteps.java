package com.my.endnote.web.steps;

import com.my.endnote.web.pages.CollectTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CollectTabSteps extends BaseStep {
    private CollectTabPage collectTabPage;

    public CollectTabSteps() {
        super();
        collectTabPage = pagesProvider.getCollectTabPage();
    }

    public void choiceLBritishLibrary() {
        collectTabPage.getBritishLibrary().click();
    }

    public void clickOnSelectSearchConnection() {
        collectTabPage.getSelectSearchConnection().click();
    }

    @And("I click on the text Select Favorites")
    public void goToSelectFavorites() {
        collectTabPage.getSelectFavorites().click();
    }

    public void selectBritishLibraryInFavorites() {
        collectTabPage.getSelectFavoritesBritishLibrary().click();
    }

    public void copyToFavoritesButtonClick() {
        collectTabPage.getCopyToFavoritesButton().click();
    }

    @And("I click on the Hide link")
    public void hideFavoritesTable() {
        collectTabPage.getHideTableOfFavoritesLibrary().click();
    }

    public void linkHideTableFavoritePresent() {
    }

    @Then("I am on Collect tab")
    public void i_am_on_Collect_tab() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@id,'idCustomListLink')]/child::a"));
    }

    @Then("I see the tables of favorite libraries")
    public void I_See_The_Tables_Of_Favorite_Libraries() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//span[contains(@id,'idHideCustomListLink')]"));
    }

    @Then("I see the table is closed")
    public void I_See_The_Table_Is_Closed() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@id,'idCustomListLink')]/child::a"));
    }
}
