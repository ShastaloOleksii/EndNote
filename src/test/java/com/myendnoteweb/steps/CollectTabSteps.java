package com.myendnoteweb.steps;

import com.myendnoteweb.pages.CollectTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class CollectTabSteps extends BaseStep {
    private CollectTabPage collectTabPage;

    public CollectTabSteps(WebDriver driver) {
        super(driver);
        collectTabPage = pagesProvider.getCollectTabPage();
    }

    public void choiceLBritishLibrary() {
        collectTabPage.getBritishLibrary().click();
        /*waitUtils.waitElementToBeClickable(collectTabPage.getSelectSearchConnection());
        collectTabPage.getSelectSearchConnection().click();*/
    }

    public void clickOnSelectSearchConnection() {
        collectTabPage.getSelectSearchConnection().click();
    }

    public void goToSelectFavorites() {
        collectTabPage.getSelectFavorites().click();
    }

    public void selectBritishLibraryInFavorites() {
        collectTabPage.getSelectFavoritesBritishLibrary().click();
    }

    public void copyToFavoritesButtonClick() {
        collectTabPage.getCopyToFavoritesButton().click();
    }

    public void hideFavoritesTable() {
        collectTabPage.getHideTableOfFavoritesLibrary().click();
    }

    public  void linkHideTableFavoritePresent(){

    }

}
