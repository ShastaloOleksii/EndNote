package com.myendnoteweb.steps.base;

import com.myendnoteweb.pages.CollectTabPage;
import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.pages.PanelPage;
import com.myendnoteweb.utils.InitDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class BaseStep {
    public WebDriver driver;

    public void clickOnTheButton(WebElement webElement){
        webElement.click();
    }

}
