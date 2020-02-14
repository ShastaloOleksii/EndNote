package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePassord extends  Settings {
    @Test
    public void changePassword(){
        Integer waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        start();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"idGuideLink\"]/a")));
        driver.findElement(By.id("lgLink6")).click();
        driver.findElement(By.xpath("//*[@id=\"contentTable\"]/tbody/tr/td/form/table/tbody/tr[1]/td/div")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"contentTable\"]/tbody/tr/td/form/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/label")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"contentTable\"]/tbody/tr/td/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/label")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"contentTable\"]/tbody/tr/td/form/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[1]/label")).isDisplayed();
        driver.findElement(By.id("oldpw")).isDisplayed();
        driver.findElement(By.id("newpw")).isDisplayed();
        driver.findElement(By.id("confirmpw")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"contentTable\"]/tbody/tr/td/form/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/input")).isDisplayed();
        System.out.println("cool");

    }

}
