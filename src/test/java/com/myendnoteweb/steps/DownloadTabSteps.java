package com.myendnoteweb.steps;

import com.myendnoteweb.pages.DownloadsTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class DownloadTabSteps extends BaseStep {
    public DownloadsTabPage downloadsTabPage;


    public DownloadTabSteps(WebDriver driver) {
        super(driver);
        downloadsTabPage = pagesProvider.getDownloadsTabPage();
    }

    public void switchToIFrame() {
        driver.switchTo().frame(downloadsTabPage.getiFrame());
    }

    public void goToCaptureReference() {
        downloadsTabPage.getEndNoteCapture().click();
    }
}
