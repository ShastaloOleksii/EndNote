package com.myendnoteweb.base;

import com.myendnoteweb.pages.CollectTabPage;
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
    private static final int WAIT_TIME = 10;
    protected String host;
    protected FileInputStream fis;
    protected Properties property = new Properties();
    public String login;
    public String password;
    protected String chromeDriver;
    public CollectTabPage collectTabPage = new CollectTabPage();
    @FindBy(xpath = ".//input[@id = 'mat-input-0']")
    private WebElement loginField;

    @FindBy(id = "mat-input-1")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'btn--login')]")
    private WebElement buttonLogIn;

    @FindBy(id = "lgLink4")
    public WebElement formatTab;

    @FindBy(id = "lgLink1")
    public WebElement myReferencesTab;
    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    public WebElement showGettingStartedGuide;

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
        PageFactory.initElements(driver, this);
    }

    public void signIN() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        wait.until(CustomWaiter.visibilityOfElement(loginField));
        loginField.sendKeys(login);
        System.out.println("Login");
        passwordField.sendKeys(password);
        System.out.println("Password");
       // wait.until(CustomWaiter.visibilityOfElement(buttonLogIn));
        buttonLogIn.click();
        System.out.println("Press button");
    }

    @After
    public void close() {
        //driver.quit();
    }

    public void click(WebElement web) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 10);
        wait.until(CustomWaiter.visibilityOfElement(web));
        web.click();
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

    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public String getAttribute(WebElement webElement, String attribute) {
        return webElement.getAttribute(attribute);
    }

    public boolean isPanelHidden(WebElement webElement, String attribute, String text) {
        return webElement.getAttribute(attribute).contains(text);
    }

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

}
