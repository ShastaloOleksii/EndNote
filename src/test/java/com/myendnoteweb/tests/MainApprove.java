package com.myendnoteweb.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainApprove extends  Settings {

    @Test
    public  void mainPage(){
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.titleIs("EndNote"));
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("EndNote"));


        //Assert.assertTrue(title.equals("EndNote"));
//*[@id="sidepanel"]/form
}
}
