package com.myendnoteweb.base;

import com.myendnoteweb.utils.InitDrivers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BasePage extends InitDrivers {
    protected WebDriverWait wait;
   // protected WebDriver driver;
    private static final int waitTime = 20;
    protected FileInputStream fis;
    protected Properties property = new Properties();
    protected String login;
    protected String password;
    protected String chromeDriver;
    protected String host;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(host);
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    @After
    public void close() {
        //driver.quit();
    }

    public void click(WebElement web) {
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
            driver.findElement(By.xpath(xpath));
            System.out.println("All ok, relax");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("The test is fail, web element is absent on the page");
            return false;
        }
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

}


