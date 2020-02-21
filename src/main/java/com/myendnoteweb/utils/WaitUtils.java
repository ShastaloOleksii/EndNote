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

    public boolean waitElementToBeClickable(WebElement web) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(web));
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean waitVisibilityOf(WebElement web) {
        try {
            wait.until(ExpectedConditions.visibilityOf(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean waitTitleIs(WebElement web) {
        String title = web.getText();
        try {
            wait.until(ExpectedConditions.titleIs(title));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitAlertIsPresent() {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitElementToBeSelected(WebElement web) {
        try {
            wait.until(ExpectedConditions.elementToBeSelected(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitFrameToBeAvailableAndSwitchToIt(WebElement frame) {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean waitInvisibilityOf(WebElement web) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(web));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitInvisibilityOfElementWithText(String xpath, String text) {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(xpath), text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean waitVisibilityOfAllElements(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.invisibilityOfAllElements(webElement));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitPresenceOfElementLocated(String xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitTextToBePresentInElement(WebElement webElement, String text) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitTextToBePresentInElementLocated(String xpath, String text) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath), text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitTextToBePresentInElementValue(WebElement webElement, String text) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElementValue(webElement, text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitTitleContains(String text) {
        try {
            wait.until(ExpectedConditions.titleContains(text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitVisibilityOfAllElementsL(String xpath) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitTextToBe(String xpath, String text) {
        try {
            wait.until(ExpectedConditions.textToBe(By.xpath(xpath), text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitVisibilityOfNestedElementsLocatedBy(WebElement webElement, String id) {
        try {
            wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(webElement, By.id(id)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitNot(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.not((ExpectedCondition<?>) webElement));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitAnd(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.and((ExpectedCondition<?>) webElement));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitAttributeContains(WebElement webElement, String attribute, String text) {
        try {
            wait.until(ExpectedConditions.attributeContains(webElement, attribute, text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitAttributeToBe(WebElement webElement, String attribute, String text) {
        try {
            wait.until(ExpectedConditions.attributeToBe(webElement, attribute, text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitAttributeToBeNotEmpty(WebElement webElement, String text) {
        try {
            wait.until(ExpectedConditions.attributeToBeNotEmpty(webElement, text));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitElementSelectionStateToBe(WebElement webElement, boolean selected) {
        try {
            wait.until(ExpectedConditions.elementSelectionStateToBe(webElement, selected));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitInvisibilityOfElementLocated(String xpath) {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitJavaScriptThrowsNoExceptions(String javaScript) {
        try {
            wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitJsReturnsValue(String javaScript) {
        try {
            wait.until(ExpectedConditions.jsReturnsValue(javaScript));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitNumberOfElementsToBe(String xpath, Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(xpath), number));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitNumberOfElementsToBeLessThan(String xpath, Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath(xpath), number));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitNumberOfElementsToBeMoreThan(String xpath, Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(xpath), number));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitNumberOfWindowsToBe(Integer number) {
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(number));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitOr(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.or((ExpectedCondition<?>) webElement));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitPresenceOfNestedElementLocatedBy(WebElement webElement, String childXpath) {
        try {
            wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(webElement, By.id(childXpath)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitRefreshed(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.refreshed((ExpectedCondition<Object>) webElement));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitStaLenessOf(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.stalenessOf(webElement));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitTextMatches(String xpath, Pattern pattern) {
        try {
            wait.until(ExpectedConditions.textMatches(By.xpath(xpath), pattern));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitUrlContains(String url) {
        try {
            wait.until(ExpectedConditions.urlContains(url));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitUrlMatches(String url) {
        try {
            wait.until(ExpectedConditions.urlMatches(url));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitUrlToBe(String url) {
        try {
            wait.until(ExpectedConditions.urlToBe(url));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}