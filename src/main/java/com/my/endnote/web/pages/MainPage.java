package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

  @FindBy(xpath = ".//a[contains(@id,'lgLink3')]")
  private WebElement organize;

  @FindBy(xpath = ".//a[contains(@id,'lgLink6')]")
  private WebElement options;

  @FindBy(xpath = ".//a[contains(text(), 'Hide Getting Started Guide')]")
  private WebElement hideGettingStartedGuide;

  @FindBy(xpath = ".//a[contains(@id,'lgLink5')]")
  private WebElement matchTab;

  @FindBy(xpath = ".//img[@id='proSmallImg']")
  private WebElement personProSmallImg;

  @FindBy(id = "lgLink1")
  private WebElement myReferencesTab;

  @FindBy(xpath = ".//a[contains(@id,'lgLink2')]")
  private WebElement collectTab;

  @FindBy(xpath = ".//a[contains(@target,'self')]")
  private WebElement logOutRef;

  @FindBy(xpath = ".//a[contains(@alt,'Format references')]")
  private WebElement formatTab;

  @FindBy(xpath = ".//a[contains(@id,'lgLink7')]")
  private WebElement downloadsTab;

  @FindBy(xpath = ".//div[contains(@id,'idError') and .//a[contains(@title,'Learn')]]")
  private WebElement learnAboutEndNote;

  @FindBy(xpath = ".//td[contains(@id, 'idFoderDesc')]")
  private WebElement allMyReferencesTitle;


  public WebElement getMyReferencesTab() {
    return myReferencesTab;
  }

  public WebElement getAllMyReferencesTitle() {
    return allMyReferencesTitle;
  }

  public WebElement getOrganize() {
    return organize;
  }

  public WebElement getOptions() {
    return options;
  }

  public WebElement getHideGettingStartedGuide() {
    return hideGettingStartedGuide;
  }

  public WebElement getMatchTab() {
    return matchTab;
  }

  public WebElement getPersonProSmallImg() {
    return personProSmallImg;
  }

  public WebElement getCollectTab() {
    return collectTab;
  }

  public WebElement getFormatTab() {
    return formatTab;
  }

  public WebElement getDownloadsTab() {
    return downloadsTab;
  }

  public WebElement getLearnAboutEndNote() {
    return learnAboutEndNote;
  }

  public WebElement getLogOutRef() {
    return logOutRef;
  }

}
