package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectTabPage extends BasePage {
//    public CollectTabPage(WebDriver driver) {
//        super(driver);
//    }

    @FindBy(xpath = ".//select[contains(@id, 'idRemoteSearchConnection')]")
    private WebElement selectSearchConnection;

    @FindBy(xpath = ".//select[contains(@id, 'idRemoteSearchConnection')]/child::option[contains(@value,'British Library')]")
    private WebElement britishLibrary;

    @FindBy(xpath = ".//div[contains(@id,'idCustomListLink')]/child::a")
    private WebElement selectFavorites;

    //.//table[contains(@class,'connectFiles')]
    @FindBy(xpath = ".//select[contains(@id, 'selectConnection')]/child::option[contains(@value,'British Library')]")
    private WebElement britishLibraryField;

    @FindBy(xpath = ".//select[contains(@id, 'selectConnection')]/child::option[contains(@value,'British Library')]")
    private WebElement selectConnectBritishLibrary;

    @FindBy(xpath = ".//input[contains(@name,'Copy to Favorites')]")
    private WebElement copyToFavoritesButton;

    @FindBy(xpath = ".//span[contains(@id,'idHideCustomListLink')]")
    private WebElement hideTableOfFavoritesLibrary;

    public WebElement getSelectSearchConnection() {
        return selectSearchConnection;
    }

    public WebElement getBritishLibrary() {
        return britishLibrary;
    }


    public WebElement getSelectFavorites() {
        return selectFavorites;
    }

    public WebElement getBritishLibraryField() {
        return britishLibraryField;
    }

    public WebElement getSelectFavoritesBritishLibrary() {
        return selectConnectBritishLibrary;
    }

    public WebElement getCopyToFavoritesButton() {
        return copyToFavoritesButton;
    }

    public WebElement getSelectConnectBritishLibrary() {
        return selectConnectBritishLibrary;
    }

    public WebElement getHideTableOfFavoritesLibrary() {
        return hideTableOfFavoritesLibrary;
    }


}
