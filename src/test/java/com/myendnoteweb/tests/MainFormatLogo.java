package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MainFormatLogo extends Settings {
    @Test
    public void mainFormatLogo(){
        driver.findElement(By.id("lgLink4")).click();
        driver.findElement(By.xpath("//img[contains(@alt,'Clarivate Analytics')]")).click();
        if(!isWebElementPresent("//div[contains(@class,'gsg_Title')]")){
            System.out.println("It is not main page");
        }
        else {
            System.out.println("It is a main page");
        };
    }
}
