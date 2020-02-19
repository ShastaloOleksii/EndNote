package com.myendnoteweb;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//img[@id='proSmallImg']")
    public WebElement personProSmallImg;

    @FindBy(xpath = ".//a[contains(@target,'self')]")
    public WebElement logOutRef;

    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    public WebElement showGettingStartedGuide;

    @FindBy(xpath = ".//a[contains(text(), 'Hide Getting Started Guide')]")
    public WebElement hideGettingStartedGuide;

    @FindBy(id = "mat-input-0")
    public WebElement loginField;

    @FindBy(id = "mat-input-1")
    public WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'btn--login')]")
    public WebElement buttonLogIn;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    public WebElement collectTabHeading;

    @FindBy(xpath = "//div[contains(@class,'heading')]")
    public WebElement formatTabHeading;

    @FindBy(xpath = "//span[contains(text(),'Find the Best')]")
    public WebElement matchTabHeading;

    @FindBy(id = "lgLink2")
    public WebElement collectTab;

    @FindBy(id = "lgLink7")
    public WebElement downloadsTab;

    @FindBy(id = "lgLink4")
    public WebElement formatTab;

    @FindBy(id = "lgLink1")
    public WebElement myReferencesTab;

    @FindBy(id = "lgLink5")
    public WebElement matchTab;

    @FindBy(xpath = ".//img[contains(@alt,'Clarivate Analytics')]")
    public WebElement logo;

    @FindBy(id = "lgLink6")
    public WebElement options;

    @FindBy(id = "lgLink3")
    public WebElement organize;

    @FindBy(xpath = ".//a[contains(@title,'View references not in a group')]")
    public WebElement unfiled;

    public void click(WebElement web) {
        web.click();
    }

    public void clickByXpath(String xpath) {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickById(String id) {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id(id)).click();

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
        loginField.sendKeys("igavudu-5763@yopmail.com");
        System.out.println("Login");
        passwordField.sendKeys("A123456@");
        System.out.println("Password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        buttonLogIn.click();
        System.out.println("Press button");
    }

}
