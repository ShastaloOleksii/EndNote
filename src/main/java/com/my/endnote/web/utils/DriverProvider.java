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

public class DriverProvider {
  public static final String DRIVER_TYPE = "driver_type";
  public static final String GRID = "grid";
  public static final String CHROME = "chrome";
  public static final String FILE = "wd/hub";
  public static final String PORT = "9999";
  public static final String HOST = "http://192.168.88.183";
  private static WebDriver driver;
  public static final int WAIT_TIME = 10;
  public static final String CHROME_DRIVER = "webdriver.chrome.driver";

  public static WebDriver getDriver() throws MalformedURLException {
    if (driver == null) {
      createDriver();
    }
    return driver;
  }

  private static void createDriver() throws MalformedURLException {
    String driverName = System.getProperty(DRIVER_TYPE, CHROME);
    switch (driverName) {
      case GRID:
        String port = System.getProperty("grid_port", PORT);
        String host = System.getProperty("grid_host", HOST);
        String file = System.getProperty("grid_file", FILE);
        driver = new RemoteWebDriver(new URL(host + ":" + port + "/" + file), getChromeOptions());
        break;
      case CHROME:
        System.setProperty(CHROME_DRIVER, "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
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
