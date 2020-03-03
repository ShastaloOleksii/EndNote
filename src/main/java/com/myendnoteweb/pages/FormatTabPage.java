package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormatTabPage extends BasePage {

    @FindBy(xpath = ".//a[contains(text(), 'Select Favorites')]")
    private WebElement selectFavaorites;

    @FindBy(xpath = ".//table[contains(@class, 'connectFiles')]")
    private WebElement connectFiles;


    @FindBy(xpath = ".//a[contains(@id, 'lgLink1')]")
    private WebElement myReferences;

    public WebElement getMyReferences() {
        return myReferences;
    }

    public WebElement getSelectFavaorites() {
        return selectFavaorites;
    }

    public WebElement getConnectFiles() {
        return connectFiles;
    }


}
