package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormatTabPage extends BasePage {

    public FormatTabPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//a[contains(text(), 'Select Favorites')]")
    private WebElement selectFavaorites;

    @FindBy(xpath = ".//table[contains(@class, 'connectFiles')]")
    private WebElement connectFiles;

    public WebElement getSelectFavaorites() {
        return selectFavaorites;
    }

    public WebElement getConnectFiles() {
        return connectFiles;
    }



}
