package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PanelPage extends BasePage {

    @FindBy(xpath = ".//a[contains(@title,'View references not in a group')]")
    private WebElement unfiled;

    @FindBy(xpath = ".//a/input[contains(@value,'Hide panel')]")
    private WebElement hidePanel;

    public WebElement getUnfiled() {
        return unfiled;
    }

    public WebElement getHidePanel() {
        return hidePanel;
    }
}
