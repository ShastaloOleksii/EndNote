package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PanelPage extends BasePage {

    @FindBy(xpath = ".//a/input[contains(@value,'Show panel')]")
    private WebElement showPanel;

    @FindBy(xpath = ".//a/input[contains(@value,'Hide panel')]")
    private WebElement hidePanel;

    public WebElement getShowPanel() {
        return showPanel;
    }

    public WebElement getHidePanel() {
        return hidePanel;
    }
}
