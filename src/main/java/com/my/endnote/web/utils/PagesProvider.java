package com.my.endnote.web.utils;

import com.my.endnote.web.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagesProvider {
  private LoginPage loginPage;
  private MainPage mainPage;
  private CollectTabPage collectTabPage;
  private DownloadsTabPage downloadsTabPage;
  private FormatTabPage formatTabPage;
  private MatchTabPage matchTabPage;
  private OptionTabPage optionTabPage;
  private OrganizeTabPage organizeTabPage;
  private PanelPage panelPage;
  private static PagesProvider pagesProvider;

  private PagesProvider(WebDriver driver) {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    mainPage = PageFactory.initElements(driver, MainPage.class);
    collectTabPage = PageFactory.initElements(driver, CollectTabPage.class);
    downloadsTabPage = PageFactory.initElements(driver, DownloadsTabPage.class);
    formatTabPage = PageFactory.initElements(driver, FormatTabPage.class);
    matchTabPage = PageFactory.initElements(driver, MatchTabPage.class);
    optionTabPage = PageFactory.initElements(driver, OptionTabPage.class);
    organizeTabPage = PageFactory.initElements(driver, OrganizeTabPage.class);
    panelPage = PageFactory.initElements(driver, PanelPage.class);
  }

  public static PagesProvider getPagesProvider() {
    if (pagesProvider == null)
      pagesProvider = new PagesProvider(DriverProvider.getDriver());
    return pagesProvider;
  }

  protected static void cleanUp() {
    pagesProvider = null;
  }

  public LoginPage getLoginPage() {
    return loginPage;
  }

  public MainPage getMainPage() {
    return mainPage;
  }

  public CollectTabPage getCollectTabPage() {
    return collectTabPage;
  }

  public DownloadsTabPage getDownloadsTabPage() {
    return downloadsTabPage;
  }

  public FormatTabPage getFormatTabPage() {
    return formatTabPage;
  }

  public MatchTabPage getMatchTabPage() {
    return matchTabPage;
  }

  public OptionTabPage getOptionTabPage() {
    return optionTabPage;
  }

  public OrganizeTabPage getOrganizeTabPage() {
    return organizeTabPage;
  }

  public PanelPage getPanelPage() {
    return panelPage;
  }


}
