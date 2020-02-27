package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {


    @FindBy(id = "lgLink3")
    private WebElement organize;

    @FindBy(id = "lgLink6")
    private WebElement options;

    @FindBy(xpath = ".//a[contains(text(), 'Hide Getting Started Guide')]")
    private WebElement hideGettingStartedGuide;

    @FindBy(id = "lgLink5")
    private WebElement matchTab;

    @FindBy(xpath = ".//img[@id='proSmallImg']")
    private WebElement personProSmallImg;

    @FindBy(id = "lgLink1")
    private WebElement myReferencesTab;

    @FindBy(id = "lgLink2")
    private WebElement collectTab;

    @FindBy(id = "lgLink4")
    private WebElement formatTab;

    @FindBy(id = "lgLink7")
    private WebElement downloadsTab;

    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    private WebElement showGettingStartedGuide;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    private WebElement collectTabHeading;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    private WebElement formatTabHeading;

    @FindBy(xpath = "//span[contains(text(),'Find the Best')]")
    private WebElement matchTabHeading;

    @FindBy(xpath = ".//div[contains(@id,'idError') and .//a[contains(@title,'Learn')]]")
    private WebElement learnAboutEndNote;

    @FindBy(xpath = ".//td[contains(@id, 'idFoderDesc')]")
    private WebElement allMyReferencesTitle;

    public MainPage(WebDriver driver) {
        super(driver);
    }


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

    public WebElement getShowGettingStartedGuide() {
        return showGettingStartedGuide;
    }

    public WebElement getCollectTabHeading() {
        return collectTabHeading;
    }

    public WebElement getFormatTabHeading() {
        return formatTabHeading;
    }

    public WebElement getMatchTabHeading() {
        return matchTabHeading;
    }

    public WebElement getLearnAboutEndNote() {
        return learnAboutEndNote;
    }


    @Override
    public String toString() {
        return "MainPage{" +
                "organize=" + organize +
                ", options=" + options +
                ", hideGettingStartedGuide=" + hideGettingStartedGuide +
                ", matchTab=" + matchTab +
                ", personProSmallImg=" + personProSmallImg +
                ", collectTab=" + collectTab +
                ", formatTab=" + formatTab +
                ", downloadsTab=" + downloadsTab +
                ", showGettingStartedGuide=" + showGettingStartedGuide +
                ", collectTabHeading=" + collectTabHeading +
                ", formatTabHeading=" + formatTabHeading +
                ", matchTabHeading=" + matchTabHeading +
                ", learnAboutEndNote=" + learnAboutEndNote +
                '}';
    }

   /* public MainPage(WebElement logo) {
        super(logo);
    }*/

  /*  public MainPage(WebElement logo, WebElement organize, WebElement options, WebElement hideGettingStartedGuide, WebElement matchTab, WebElement personProSmallImg, WebElement collectTab, WebElement formatTab, WebElement downloadsTab, WebElement showGettingStartedGuide, WebElement collectTabHeading, WebElement formatTabHeading, WebElement matchTabHeading, WebElement learnAboutEndNote) {
        super(logo);
        this.organize = organize;
        this.options = options;
        this.hideGettingStartedGuide = hideGettingStartedGuide;
        this.matchTab = matchTab;
        this.personProSmallImg = personProSmallImg;
        this.collectTab = collectTab;
        this.formatTab = formatTab;
        this.downloadsTab = downloadsTab;
        this.showGettingStartedGuide = showGettingStartedGuide;
        this.collectTabHeading = collectTabHeading;
        this.formatTabHeading = formatTabHeading;
        this.matchTabHeading = matchTabHeading;
        this.learnAboutEndNote = learnAboutEndNote;
    }*/


}
