package com.my.endnote.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = ".//a[contains(@target,'self')]")
    private WebElement logOutRef;

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

    public WebElement getLogOutRef() {
        return logOutRef;
    }

}