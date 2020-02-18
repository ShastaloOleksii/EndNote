package com.myendnoteweb.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FatherXPath {
    protected WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
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
    public boolean trueFalse(String bool){
        System.out.println("Method was started");
        try {
            System.out.println(driver.findElement(By.xpath(bool)));
            driver.findElement(By.xpath(bool));
            return true;
        }
        catch (NotFoundException e){
            System.out.println("problem...");
            return false;
        }
    }

    }

