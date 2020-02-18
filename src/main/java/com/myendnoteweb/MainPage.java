package com.myendnoteweb;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    /*private  MainPage(){

    }
    public  static MainPage(driver){
        MainPage mp = new MainPage();
        PageFactory.initElements(driver, mp);
    }*/
    @FindBy(xpath = ".//img[@id='proSmallImg']")
    public WebElement personProSmallImg;

    @FindBy(xpath = ".//span[contains(@class,'fa-cog')]")
    public WebElement logOutRef;

    @FindBy(xpath = ".//a[contains(text(), 'Show Getting')]")
    public WebElement showGetting;

    @FindBy(xpath = ".//span[contains(@class,'fa-cog')]")
    public WebElement logo;

    public void clickByXpath(String xpath) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickById(String id) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();

    }

    public void isDispl() {
        logOutRef.isDisplayed();
    }

    public void title() {
        showGetting.isDisplayed();
    }

    public void equals(String text, String xpath) {

    }

    public boolean isWebElementDisplayedXpath(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
            System.out.println("All ok, relax");
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("The test is fail, web element is absent on the page");
            return false;

        }
    }

    public boolean isWebElementDisplayedID(String id) {
        try {
            driver.findElement(By.id(id));
            System.out.println("All ok, relax");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("The test is fail, web element is absent on the page");
            return false;

        }
    }

    public void signIN() {
        driver.findElement(By.id("mat-input-0")).sendKeys("abunudonn-0963@yopmail.com");
        System.out.println("Login");
        driver.findElement(By.id("mat-input-1")).sendKeys("A123456@");
        System.out.println("Password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(@class,'btn--login')]  ")).click();
        System.out.println("Press button");
    }
   /* public void waiter(String xpath){
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
*/
    // Waiting for web element appearance during waitTime
    /*protected void waitUntilElementIsVisible(Integer waitTime, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    protected boolean isWebElementDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }

    protected boolean isWebElementSelected(WebElement webElement) {
        return webElement.isSelected();
    }

    protected boolean isWebElementEnabled(WebElement webElement) {
        return webElement.isEnabled();
    }*/
}
