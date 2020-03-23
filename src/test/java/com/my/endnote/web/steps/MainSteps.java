package com.my.endnote.web.steps;

import com.my.endnote.web.pages.MainPage;
import com.my.endnote.web.steps.base.BaseStep;
import com.my.endnote.web.utils.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MainSteps extends BaseStep {
  private MainPage mainPage;
  private WaitUtils waitUtils;

  public MainSteps() throws MalformedURLException {
    super();
    mainPage = pagesProvider.getMainPage();
  }


  public MainPage getMainPage() {
    return mainPage;
  }

  @When("I am go to collect tab page")
  public void goToCollectPage() {
    mainPage.getCollectTab().click();
  }

  @When("I am go to logout panel")
  public void goToLogOutPanel() {
    mainPage.getPersonProSmallImg().click();
  }

  @And("I go to login page")
  public void goToLoginPage() {
    mainPage.getLogOutRef().click();
  }

  @When("I am go to Downloads tab page")
  public void goToDownloadsPage() {
    mainPage.getDownloadsTab().click();
  }

  @When("I am go to Format tab page")
  public void goToFormatPage() {
    mainPage.getFormatTab().click();
  }

  @When("I am go to Match tab page")
  public void goToMatchPage() {
    mainPage.getMatchTab().click();
  }

  @When("I am go to Options tab page")
  public void goToOptionsPage() {
    mainPage.getOptions().click();
  }

  @When("I am go to Organize tab page")
  public void goToOrganizePage() {
    mainPage.getOrganize().click();
  }

  @When("I am go to My References tab")
  public void goToMyReferencesPage() {
    mainPage.getMyReferencesTab().click();
  }

  @When("I click on the Hide Getting Started Guide if this tab opened")
  public void showOrHideGettingStartedGuide() {
    if (isWebElementDisplayedXpath(".//a[contains(text(), 'Hide Getting Started Guide')]")) {
      mainPage.getHideGettingStartedGuide().click();
    }
  }

  @Then("Title All My References is present")
  public void titleAllMyReferencesIsPresent() {
    Assert.assertTrue(isWebElementDisplayedXpath(".//td[contains(text(), 'All My References')]"));
  }

  @Then("I am on My References tab")
  public void goToMyReferenceTab() {
    Assert.assertTrue(isWebElementDisplayedXpath(".//a[contains(text(), 'Show Getting Started Guide')]"));
  }

  @Then("The main tabs menu is present on main page")
  public void tabsMenuIsPresent() {
    Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar-default')]"));
  }

  @Then("The logo is present on main page")
  public void logoIsPresentOnMainPage() {
    Assert.assertTrue(isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));
  }

  @Then("The localization panel is present on mane page")
  public void localizationPanelPresentOnMainPage() {
    Assert.assertTrue(isWebElementDisplayedID("languages1"));
  }

  @Then("The attribute \"class\" is present")
  public void attributeClassPresent() {
    Assert.assertTrue(attributes(mainPage.getLearnAboutEndNote(), "class"));
  }

  @Then("The attribute \"alt\" is present")
  public void attributeAltPresent() {
    Assert.assertTrue(attributes(mainPage.getFormatTab(), "alt"));
  }

}
