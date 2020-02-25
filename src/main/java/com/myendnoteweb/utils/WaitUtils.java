package com.myendnoteweb.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

public class WaitUtils {
    WebDriver driver = new ChromeDriver();
    int timeout = 30;
    WebDriverWait wait = new WebDriverWait(driver, timeout);

    public void waitElementToBeClickable(WebElement web) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(web));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitVisibilityOf(WebElement web) {
        try {
            wait.until(ExpectedConditions.visibilityOf(web));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

    public void waitTitleIs(WebElement web) {
        String title = web.getText();
        try {
            wait.until(ExpectedConditions.titleIs(title));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitAlertIsPresent() {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitElementToBeSelected(WebElement web) {
        try {
            wait.until(ExpectedConditions.elementToBeSelected(web));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitFrameToBeAvailableAndSwitchToIt(WebElement frame) {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

    public void waitInvisibilityOf(WebElement web) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(web));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitInvisibilityOfElementWithText(String xpath, String text) {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(xpath), text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

    public void waitVisibilityOfAllElements(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.invisibilityOfAllElements(webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitPresenceOfElementLocated(String xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitTextToBePresentInElement(WebElement webElement, String text) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitTextToBePresentInElementLocated(String xpath, String text) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath), text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitTextToBePresentInElementValue(WebElement webElement, String text) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElementValue(webElement, text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitTitleContains(String text) {
        try {
            wait.until(ExpectedConditions.titleContains(text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitVisibilityOfAllElementsL(String xpath) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitTextToBe(String xpath, String text) {
        try {
            wait.until(ExpectedConditions.textToBe(By.xpath(xpath), text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitVisibilityOfNestedElementsLocatedBy(WebElement webElement, String id) {
        try {
            wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(webElement, By.id(id)));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitNot(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.not((ExpectedCondition<?>) webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitAnd(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.and((ExpectedCondition<?>) webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitAttributeContains(WebElement webElement, String attribute, String text) {
        try {
            wait.until(ExpectedConditions.attributeContains(webElement, attribute, text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitAttributeToBe(WebElement webElement, String attribute, String text) {
        try {
            wait.until(ExpectedConditions.attributeToBe(webElement, attribute, text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitAttributeToBeNotEmpty(WebElement webElement, String text) {
        try {
            wait.until(ExpectedConditions.attributeToBeNotEmpty(webElement, text));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitElementSelectionStateToBe(WebElement webElement, boolean selected) {
        try {
            wait.until(ExpectedConditions.elementSelectionStateToBe(webElement, selected));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitInvisibilityOfElementLocated(String xpath) {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitJavaScriptThrowsNoExceptions(String javaScript) {
        try {
            wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitJsReturnsValue(String javaScript) {
        try {
            wait.until(ExpectedConditions.jsReturnsValue(javaScript));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitNumberOfElementsToBe(String xpath, Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(xpath), number));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitNumberOfElementsToBeLessThan(String xpath, Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath(xpath), number));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitNumberOfElementsToBeMoreThan(String xpath, Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(xpath), number));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitNumberOfWindowsToBe(Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(number));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitOr(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.or((ExpectedCondition<?>) webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitPresenceOfNestedElementLocatedBy(WebElement webElement, String childXpath) {
        try {
            wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(webElement, By.id(childXpath)));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitRefreshed(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.refreshed((ExpectedCondition<Object>) webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitStaLenessOf(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.stalenessOf(webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitTextMatches(String xpath, Pattern pattern) {
        try {
            wait.until(ExpectedConditions.textMatches(By.xpath(xpath), pattern));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitUrlContains(String url) {
        try {
            wait.until(ExpectedConditions.urlContains(url));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitUrlMatches(String url) {
        try {
            wait.until(ExpectedConditions.urlMatches(url));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void waitUrlToBe(String url) {
        try {
            wait.until(ExpectedConditions.urlToBe(url));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}