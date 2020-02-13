package com.myendnoteweb.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignIn extends Settings {


    @Test
    public void SignIn() {

        driver.get("https://access.clarivate.com/login?app=endnote");
        driver.manage().window().maximize();
        driver.findElement(By.id("mat-input-0")).sendKeys("abunudonn-0963@yopmail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("A123456@");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/microui-app/section/microui-base/div[1]/div/base-login/div/div[3]/div[1]/login/steam-login/form/div[2]/div[2]/button/span/span[1]")).click();

    }

}
