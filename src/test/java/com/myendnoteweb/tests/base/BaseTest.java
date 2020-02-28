package com.myendnoteweb.tests.base;

import com.myendnoteweb.pages.*;
import com.myendnoteweb.steps.*;
import com.myendnoteweb.steps.base.BaseStep;
import com.myendnoteweb.utils.InitDrivers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public abstract class BaseTest extends InitDrivers {
    public WebDriver driver;
    private String host;
    private FileInputStream fis;
    private Properties property = new Properties();
    private String login;
    private String password;
    private String chromeDriver;
    private String firstName;
    private String lastName;
    private CollectTabSteps collectTabSteps = new CollectTabSteps(driver);
    private MainSteps mainSteps = new MainSteps(driver);
    private LoginSteps loginSteps = new LoginSteps(driver);
    private FormatTabSteps formatTabSteps = new FormatTabSteps(driver);
    private DownloadTabSteps downloadTabSteps = new DownloadTabSteps(driver);
    private LogOutSteps logOutSteps = new LogOutSteps(driver);
    private MatchTabSteps matchTabSteps = new MatchTabSteps(driver);
    private OptionTabSteps optionTabSteps = new OptionTabSteps(driver);
    private OrganizeTabSteps organizeTabSteps = new OrganizeTabSteps(driver);
    private PanelSteps panelSteps = new PanelSteps(driver);
    private RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps(driver);
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

    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }


    public LogOutPage getLogOutPage() {
        return logOutPage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public static final int WAIT_TIME = 4;


    public LogOutSteps getLogOutSteps() {
        return logOutSteps;
    }

    public DownloadTabSteps getDownloadTabSteps() {
        return downloadTabSteps;
    }

    public FormatTabSteps getFormatTabSteps() {
        return formatTabSteps;
    }

    public MatchTabSteps getMatchTabSteps() {
        return matchTabSteps;
    }

    public RegistrationPageSteps getRegistrationPageSteps() {
        return registrationPageSteps;
    }

    public OptionTabSteps getOptionTabSteps() {
        return optionTabSteps;
    }

    public OrganizeTabSteps getOrganizeTabSteps() {
        return organizeTabSteps;
    }

    public PanelSteps getPanelSteps() {
        return panelSteps;
    }

    public String getChromeDriver() {
        return chromeDriver;
    }

    public CollectTabSteps getCollectTabSteps() {
        return collectTabSteps;
    }

    public MainSteps getMainSteps() {
        return mainSteps;
    }

    public LoginSteps getLoginSteps() {
        return loginSteps;
    }

    public String getHost() {
        return host;
    }

    public FileInputStream getFis() {
        return fis;
    }

    public Properties getProperty() {
        return property;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Before
    public void setUp() {
        try {
            fis = new FileInputStream("src/test/resources/properties/properties.properties");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            property.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        {
            host = property.getProperty("host");
            chromeDriver = property.getProperty("chrome.driver");
            login = property.getProperty("login");
            password = property.getProperty("password");
            firstName = property.getProperty("firstName");
            lastName = property.getProperty("lastName");

        }

        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        driver.get(host);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        logOutPage = new LogOutPage(driver);
        collectTabPage = new CollectTabPage(driver);
        downloadsTabPage = new DownloadsTabPage(driver);
        formatTabPage = new FormatTabPage(driver);
        matchTabPage = new MatchTabPage(driver);
        optionTabPage = new OptionTabPage(driver);
        organizeTabPage = new OrganizeTabPage(driver);
        panelPage = new PanelPage(driver);
        registrationPage = new RegistrationPage(driver);
    }

    @After
    public void close() {
       // driver.quit();
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    public void preconditions() {
        loginPage = new LoginPage(driver);
        loginPage.getLoginField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getSignInButton().click();
    }

    public boolean attributes(WebElement web, String attribute) {
        if (web.getAttribute(attribute) == null) {
            return false;
        } else {
            System.out.println(web.getAttribute(attribute));
            return true;
        }

    }

    public boolean isWebElementDisplayedXpath(String xpath) {
        try {
            System.out.println("All ok, relax");
            return driver.findElement(By.xpath(xpath)).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("The test is fail, web element is absent on the page");
            return false;
        }
    }
/*
    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public String getAttribute(WebElement webElement, String attribute) {
        return webElement.getAttribute(attribute);
    }

    public boolean isPanelHidden(WebElement webElement, String attribute, String text) {
        return webElement.getAttribute(attribute).contains(text);
    }*/

    public boolean isWebElementDisplayedID(String id) {
        try {
            driver.findElement(By.id(id));
            System.out.println("All ok, relax");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("The test is fail, web element is absent on the page");
            return false;
        }
    }

    public String fluentWait(WebElement webElement, int waitTime, int milisek) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofMillis(milisek))
                .ignoring(NoSuchElementException.class);
        return wait.until(new Function<WebDriver, String>() {
            public String apply(WebDriver driver) {
                return webElement.getText();
            }

        });

    }


    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public String getAttribute(WebElement webElement, String attribute) {
        return webElement.getAttribute(attribute);
    }

    public boolean isPanelHidden(WebElement webElement, String attribute, String text) {
        return webElement.getAttribute(attribute).contains(text);
    }


    public boolean waitForVisible(WebElement web) {
        try {
            //wait.until(ExpectedConditions.visibilityOf(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }


}
