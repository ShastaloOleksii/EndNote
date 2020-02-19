package com.myendnoteweb.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FatherXPath {
    protected WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://access.clarivate.com/login?app=endnote");
        driver.manage().window().maximize();
        driver.findElement(By.id("mat-input-0")).sendKeys("abunudonn-0963@yopmail.com");
        System.out.println("Login");
        driver.findElement(By.id("mat-input-1")).sendKeys("A123456@");
        System.out.println("Password");
        driver.findElement(By.xpath("//button[contains(@class,'btn--login')]  ")).click();
        System.out.println("Press button");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void close() {
        driver.quit();
    }

    public void list(By mySelector) {

        List<WebElement> myElements = driver.findElements(mySelector);
        for (WebElement e : myElements) {
            System.out.println(e.getText());
        }
    }

    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void print(String str) {
        System.out.println(str);

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
    }

