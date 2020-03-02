package com.myendnoteweb.utils;

import com.myendnoteweb.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagesProvider {
    private LoginPage loginPage;
    private MainPage mainPage;
    private LogOutPage logOutPage;
    private CollectTabPage collectTabPage;
    private DownloadsTabPage downloadsTabPage;
    private FormatTabPage formatTabPage;
    private MatchTabPage matchTabPage;
    private OptionTabPage optionTabPage;
    private OrganizeTabPage organizeTabPage;
    private PanelPage panelPage;
    private RegistrationPage registrationPage;
    private MailPage mailPage;

    public PagesProvider(WebDriver driver) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        logOutPage = PageFactory.initElements(driver, LogOutPage.class);
        collectTabPage = PageFactory.initElements(driver, CollectTabPage.class);
        downloadsTabPage = PageFactory.initElements(driver, DownloadsTabPage.class);
        formatTabPage = PageFactory.initElements(driver, FormatTabPage.class);
        matchTabPage = PageFactory.initElements(driver, MatchTabPage.class);
        optionTabPage = PageFactory.initElements(driver, OptionTabPage.class);
        organizeTabPage = PageFactory.initElements(driver, OrganizeTabPage.class);
        panelPage = PageFactory.initElements(driver, PanelPage.class);
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public LogOutPage getLogOutPage() {
        return logOutPage;
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

    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }

    public MailPage getMailPage() {
        return mailPage;
    }


}
