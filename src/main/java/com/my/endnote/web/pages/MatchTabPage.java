package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MatchTabPage extends BasePage {

  @FindBy(xpath = ".//span[contains(text(),'Find the Best')]")
  private WebElement matchTabHeading;

  @FindBy(xpath = ".//textarea[contains(@name,'title')]")
  private WebElement titleField;

  @FindBy(xpath = ".//textarea[contains(@name,'abstract')]")
  private WebElement abstractField;

  @FindBy(xpath = ".//input[contains(@value,'Find Journals')]")
  private WebElement findJornalsButton;

  public WebElement getMatchTabHeading() {
    return matchTabHeading;
  }

  public WebElement getTitleField() {
    return titleField;
  }

  public WebElement getAbstractField() {
    return abstractField;
  }

  public WebElement getFindJornalsButton() {
    return findJornalsButton;
  }
}
