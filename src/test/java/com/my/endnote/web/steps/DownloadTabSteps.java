package com.my.endnote.web.steps;

import com.my.endnote.web.pages.DownloadsTabPage;
import com.my.endnote.web.steps.base.BaseStep;

public class DownloadTabSteps extends BaseStep {
    public DownloadsTabPage downloadsTabPage;


    public DownloadTabSteps() {
        super();
        downloadsTabPage = pagesProvider.getDownloadsTabPage();
    }

    public void switchToIFrame() {
        driver.switchTo().frame(downloadsTabPage.getiFrame());
    }

    public void goToCaptureReference() {
        downloadsTabPage.getEndNoteCapture().click();
    }
}
