package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsTabPage extends BasePage {

    @FindBy(xpath = ".//a[contains(@title, 'EndNote Capture')]")
    private WebElement endNoteCapture;

    @FindBy(xpath = ".//iframe")
    private WebElement iFrame;

    public WebElement getiFrame() {
        return iFrame;
    }

    public WebElement getEndNoteCapture() {
        return endNoteCapture;
    }

}
