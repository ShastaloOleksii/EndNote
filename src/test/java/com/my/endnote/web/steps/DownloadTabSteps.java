package com.my.endnote.web.steps;

import com.my.endnote.web.pages.DownloadsTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DownloadTabSteps extends BaseStep {
  public DownloadsTabPage downloadsTabPage;

  public DownloadTabSteps() {
    downloadsTabPage = pagesProvider.getDownloadsTabPage();
  }

  @Then("The Capture Reference is opened")
  public void switchToIFrame() {
    driver.switchTo().frame(downloadsTabPage.getiFrame());
    Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@class,'pagecntnav1')]/child::div[contains(@class,'captureHeading')]"));
  }

  @And("I am opened Capture Reference")
  public void goToCaptureReference() {
    downloadsTabPage.getEndNoteCapture().click();
  }

  @Then("I am on Downloads tab")
  public void presentOnDownloadsTabPageVerifi() {
    Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(@class,'summary_TopBox')]"));
  }
}
