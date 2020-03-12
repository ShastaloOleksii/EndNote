package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormatTabPage extends BasePage {

    @FindBy(xpath = ".//a[contains(text(), 'Select Favorites')]")
    private WebElement selectFavaorites;

    public WebElement getSelectFavaorites() {
        return selectFavaorites;
    }



}
