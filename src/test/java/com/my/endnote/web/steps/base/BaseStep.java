package com.my.endnote.web.steps.base;

import com.my.endnote.web.utils.DriverProvider;
import com.my.endnote.web.utils.PagesProvider;
import com.my.endnote.web.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseStep {
  protected WebDriver driver;
  protected WaitUtils waitUtils;
  protected PagesProvider pagesProvider;

  public BaseStep() throws MalformedURLException {
    driver = DriverProvider.getDriver();
    waitUtils = WaitUtils.getWaitUtils(20);
    pagesProvider = PagesProvider.getPagesProvider();
  }

  public boolean isWebElementDisplayedXpath(String xpath) {
    try {
      return driver.findElement(By.xpath(xpath)).isDisplayed();
    } catch (NoSuchElementException e) {
      System.out.println("The test is fail, web element is absent on the page");
      return false;
    }
  }

  public boolean isWebElementDisplayedID(String id) {
    try {
      driver.findElement(By.id(id));
      return true;
    } catch (NoSuchElementException e) {
      System.out.println("The test is fail, web element is absent on the page");
      return false;
    }
  }

  public boolean attributes(WebElement web, String attribute) {
    if (web.getAttribute(attribute) == null) {
      return false;
    } else {
      System.out.println(web.getAttribute(attribute));
      return true;
    }

  }

  public boolean isWebElementXpath(String xpath) {
    try {
      return driver.findElement(By.xpath(xpath)).isEnabled();
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


}