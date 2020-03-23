package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizeTabPage extends BasePage {

  @FindBy(xpath = "//div[contains(@class,'heading')]")
  private WebElement organizeHeading;

  public WebElement getOrganizeHeading() {
    return organizeHeading;
  }

}
