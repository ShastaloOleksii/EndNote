package com.my.endnote.web.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverProvider {
    private static WebDriver driver;
    public static final int WAIT_TIME = 10;
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";

    public static WebDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            System.setProperty(CHROME_DRIVER, "src/test/resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
            options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
            options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
            options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            options.addArguments("headless");
            driver = new RemoteWebDriver(new URL("http://192.168.88.183:5555/wd/hub"), options);
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
