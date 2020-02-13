package com.myendnoteweb.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Settings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    public void start() {
        driver.get("https://access.clarivate.com/login?app=endnote");
        driver.manage().window().maximize();
        driver.findElement(By.id("mat-input-0")).sendKeys("abunudonn-0963@yopmail.com");
        System.out.println("Login");
        driver.findElement(By.id("mat-input-1")).sendKeys("A123456@");
        System.out.println("Password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='wui-btn--login mat-flat-button mat-primary']")).click();
        System.out.println("Press button");
    }

    @After
    public void close() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.quit();
    }
}
