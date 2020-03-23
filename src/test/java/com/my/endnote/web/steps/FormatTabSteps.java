package com.my.endnote.web.steps;

import com.my.endnote.web.pages.FormatTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.qameta.allure.Description;
import org.testng.Assert;

import java.net.MalformedURLException;

public class FormatTabSteps extends BaseStep {
  FormatTabPage formatTabPage;

  public FormatTabSteps() throws MalformedURLException {
    super();
    formatTabPage = pagesProvider.getFormatTabPage();
  }

  @And("I am opened Select Favorites table")
  @Description("This method is opened Favorite")
  public void openFavoriteList() {
    formatTabPage.getSelectFavaorites().click();
  }

  @Then("I am on format tab")
  public void I_Am_Go_Format_Tab() {
    Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
  }

  @Then("The Select Favorites table is opened")
  public void selectFavoritesTablePresent() {
    Assert.assertTrue(isWebElementDisplayedXpath(".//table[contains(@class, 'connectFiles')]"));
  }
}
