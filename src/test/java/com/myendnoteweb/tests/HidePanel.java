package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HidePanel extends  Settings {
    @Test
    public void hidePanel() {
        start();
        driver.findElement(By.xpath("//*[@id=\"summaryDisplayTable\"]/tbody/tr/td[1]/form")).click();
        if(driver.findElement(By.xpath("//*[@id=\"sidepanel\"]/form")).isDisplayed()){
            System.out.println("Pannel is present");
        }else{
            driver.findElement(By.xpath("//*[@id=\"summaryDisplayTable\"]/tbody/tr/td[1]/form")).click();
        }
        driver.findElement(By.xpath("//*[@id=\"hidepanel_img\"]/a")).click();
        if(driver.findElement(By.xpath("//*[@id=\"sidepanel\"]/form")).isDisplayed()){
            System.out.println("Pannel is present");
        }else{
            System.out.println("Panel is absent, test is passed");
        }


    }
}
