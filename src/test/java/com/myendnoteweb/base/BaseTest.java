package com.myendnoteweb.base;

import com.myendnoteweb.utils.InitDrivers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends  InitDrivers{
    private static final int WAIT_TIME = 10;
    protected String host;
    protected FileInputStream fis;
    protected Properties property = new Properties();
    public String login;
    public String password;
    protected String chromeDriver;


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



    @After
    public void close() {
        driver.quit();
    }

}
