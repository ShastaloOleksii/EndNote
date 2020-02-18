package com.myendnoteweb;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected WebDriver driver;
    private static final int waitTime = 20;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://access.clarivate.com/login?app=endnote");
        driver.manage().window().maximize();

    }

    @After
    public void close() {
        //driver.quit();
    }


}


