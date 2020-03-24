package com.my.endnote.web.steps;

import com.my.endnote.web.pages.OptionTabPage;
import com.my.endnote.web.steps.base.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.net.MalformedURLException;

public class OptionTabSteps extends BaseStep {
  OptionTabPage optionTabPage;

  public OptionTabSteps() throws MalformedURLException {
    super();
    optionTabPage = pagesProvider.getOptionTabPage();
  }

  @Then("I am on the Options tab")
  public void i_Am_On_The_Options_Tab() {
    Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(text(),'Change Password')]"));
  }

  @And("I click to logo")
  public void i_Click_To_Logo() {
    optionTabPage.getLogo().click();
  }
}
