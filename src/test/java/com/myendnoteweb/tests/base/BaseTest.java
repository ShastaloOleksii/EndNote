package com.myendnoteweb.tests.base;

import com.myendnoteweb.base.BasePage;
import com.myendnoteweb.pages.CollectTabPage;
import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.pages.OptionTabPage;
import com.myendnoteweb.steps.*;
import com.myendnoteweb.tests.collecttab.CollectTabTests;
import com.myendnoteweb.utils.CustomWaiter;
import com.myendnoteweb.utils.InitDrivers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    private CollectTabSteps collectTabSteps = new CollectTabSteps();
    private MainSteps mainSteps = new MainSteps();
    private LoginSteps loginSteps = new LoginSteps();
    private FormatTabSteps formatTabSteps = new FormatTabSteps();
    private DownloadTabSteps downloadTabSteps = new DownloadTabSteps();
    private LogOutSteps logOutSteps = new LogOutSteps();
    private MatchTabSteps matchTabSteps = new MatchTabSteps();
    private OptionTabSteps optionTabSteps = new OptionTabSteps();
    private OrganizeTabSteps organizeTabSteps = new OrganizeTabSteps();
    private PanelSteps panelSteps = new PanelSteps();
    public static final int WAIT_TIME = 15;


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
        }

        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        driver.get(host);
        driver.manage().window().maximize();
    }
/*
    public void signIN() {
        loginPage.getLoginField().sendKeys(login);
        System.out.println("Login");
        loginPage.getPasswordField().sendKeys(password);
        System.out.println("Password");
        // wait.until(CustomWaiter.visibilityOfElement(buttonLogIn));
        loginPage.getButtonLogIn().click();
        System.out.println("Press button");
    }*/


   /* public void signIN() {
        loginField.sendKeys(login);
        System.out.println("Login");
        passwordField.sendKeys(password);
        System.out.println("Password");
       // wait.until(CustomWaiter.visibilityOfElement(buttonLogIn));
        buttonLogIn.click();
        System.out.println("Press button");
    }*/

    @After
    public void close() {
        //driver.quit();
    }

    public void click(WebElement web) {
        // Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(web));
        web.click();
    }

    public void preconditions() {
        LoginPage loginPage = new LoginPage(driver);
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
