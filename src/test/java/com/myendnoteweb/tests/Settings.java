package com.myendnoteweb.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    public  ChromeDriver driver;
    @Before
    public  void  setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeWebDriver/chromedriver.exe");
        driver = new ChromeDriver();

    }
    @After
    public void close(){

    }
}
