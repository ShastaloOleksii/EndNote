package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MainFormatLogo extends Settings {
    @Test
    public void mainFormatLogo(){
        start();
        driver.findElement(By.id("lgLink4")).click();
        driver.findElement(By.xpath("//*[@id=\"enwHeader\"]/div[1]/div/div/h1/a/span[1]/img")).click();
       // driver.findElement(By.xpath("//*[@id=\"idShowGettingStarted\"]/div[1]"));
        if(!isWebElementPresent("//*[@id=\"idShowGettingStarted\"]/div[1]")){
            System.out.println("It is not main page");
        }
    }
}
