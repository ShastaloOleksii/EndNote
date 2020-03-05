package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsTabPage extends BasePage {

    @FindBy(xpath = ".//a[contains(@title, 'EndNote Capture')]")
    private WebElement endNoteCapture;
//.//div[contains(@id,'bookmarklet')]
    @FindBy(xpath = ".//iframe")
    private WebElement iFrame;


    public WebElement getiFrame() {
        return iFrame;
    }

    public WebElement getEndNoteCapture() {
        return endNoteCapture;
    }

}
