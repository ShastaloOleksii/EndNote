package com.my.endnote.web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverProvider {
    private static WebDriver driver;
    public static final int WAIT_TIME = 20;

    public static final String CHROME_DRIVER = "webdriver.chrome.driver";

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(CHROME_DRIVER, "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    protected static void cleanUp() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
