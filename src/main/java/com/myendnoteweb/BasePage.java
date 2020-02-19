package com.myendnoteweb;

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

public class BasePage {
    protected WebDriver driver;
    private static final int waitTime = 20;
    FileInputStream fis;
    Properties property = new Properties();
    protected String login;
    protected String password;
    protected String chdriver;
    protected String host;

    @Before
    public void setUp() {
        try {
            fis = new FileInputStream("src/main/resources/properties/properties.properties");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            property.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        host = property.getProperty("host");
        chdriver = property.getProperty("chrome.driver");
        login = property.getProperty("login");
        password = property.getProperty("password");

        System.setProperty("webdriver.chrome.driver", chdriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(host);
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    @After
    public void close() {
        driver.quit();
    }


}


