package com.myendnoteweb.tests.base;

import com.myendnoteweb.steps.*;
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
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    public static final String PROPERTIES = "src/test/resources/properties/properties.properties";
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";
    private String classAtribute = "class";
    private String altAtribute = "alt";
    public WebDriver driver;
    private String host;
    private Properties property = new Properties();
    private String login;
    private String password;
    private String chromeDriver;
    private String firstName;
    private String lastName;
    private String urlBefore;
    private String urlAfter;
    private String mailHost;
    private CollectTabSteps collectTabSteps;
    private MainSteps mainSteps;
    private LoginSteps loginSteps;
    private FormatTabSteps formatTabSteps;
    private DownloadTabSteps downloadTabSteps;
    private LogOutSteps logOutSteps;
    private MailPageSteps mailPageSteps;
    private MatchTabSteps matchTabSteps;
    private OptionTabSteps optionTabSteps;
    private OrganizeTabSteps organizeTabSteps;
    private PanelSteps panelSteps;
    private RegistrationPageSteps registrationPageSteps;

    public String getClassAtribute() {
        return classAtribute;
    }

    public String getAltAtribute() {
        return altAtribute;
    }

    public String getMailHost() {
        return mailHost;
    }


    public String getUrlBefore() {
        return urlBefore;
    }

    public String getUrlAfter() {
        return urlAfter;
    }

    public MailPageSteps getMailPageSteps() {
        return mailPageSteps;
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
        initProperties();

        setFields();

        System.setProperty(CHROME_DRIVER, chromeDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        driver.get(host);
        driver.manage().window().maximize();

        initSteps();
    }

    private void initProperties() {
        try (FileInputStream fis = new FileInputStream(PROPERTIES)) {
            property.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void initSteps() {
        collectTabSteps = new CollectTabSteps(driver);
        downloadTabSteps = new DownloadTabSteps(driver);
        formatTabSteps = new FormatTabSteps(driver);
        loginSteps = new LoginSteps(driver);
        logOutSteps = new LogOutSteps(driver);
        mailPageSteps = new MailPageSteps(driver);
        mainSteps = new MainSteps(driver);
        matchTabSteps = new MatchTabSteps(driver);
        optionTabSteps = new OptionTabSteps(driver);
        organizeTabSteps = new OrganizeTabSteps(driver);
        panelSteps = new PanelSteps(driver);
        registrationPageSteps = new RegistrationPageSteps(driver);
    }

    private void setFields() {
        host = property.getProperty("host");
        chromeDriver = property.getProperty("chrome.driver");
        login = property.getProperty("login");
        password = property.getProperty("password");
        firstName = property.getProperty("firstName");
        lastName = property.getProperty("lastName");
        urlBefore = property.getProperty("urlBefore");
        urlAfter = property.getProperty("urlAfter");
        mailHost = property.getProperty("mailHost");
    }

    @After
    public void close() {
        // driver.quit();
    }


    public boolean attributes(WebElement web, String attribute) {
        if (web.getAttribute(attribute) == null) {
            return false;
        } else {
            System.out.println(web.getAttribute(attribute));
            return true;
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
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofMillis(milisek))
                .ignoring(NoSuchElementException.class);
        return wait.until(driver -> webElement.getText());

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
