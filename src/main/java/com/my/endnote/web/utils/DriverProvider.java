package com.my.endnote.web.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static com.my.endnote.web.utils.Constants.*;

public class DriverProvider {
  private static final Logger LOGGER = Logger.getLogger(DriverProvider.class.getName());
  private static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null) {
      createDriver();
    }
    return driver;
  }

  private static void createDriver() {
    String driverName = System.getProperty(DRIVER_TYPE, CHROME);
    LOGGER.info("Using driver " + driverName);
    switch (driverName) {
      case GRID:
        String port = System.getProperty(GRID_PORT, DEFAULT_PORT);
        String host = System.getProperty(GRID_HOST, DEFAULT_HOST);
        String file = System.getProperty(GRID_FILE, DEFAULT_FILE);
        try {
          driver = new RemoteWebDriver(new URL(host + ":" + port + "/" + file), getChromeOptions());
        } catch (MalformedURLException e) {
          new RuntimeException(e);
        }
        break;
      case CHROME:
        System.setProperty(CHROME_DRIVER, "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
  }

  private static ChromeOptions getChromeOptions() {
    ChromeOptions options = new ChromeOptions();
    options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
    options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
    options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
    options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    return options;
  }

  protected static void cleanUp() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }
}
