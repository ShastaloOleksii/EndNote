package com.myendnoteweb.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SignOut extends Settings {

    @Test
    public void signOut() {


        start();
        driver.findElement(By.xpath("//img[@id='proSmallImg']")).click();
        driver.findElement(By.xpath("//*[@id=\"profile\"]/li[2]/ul[1]/li[2]/a")).click();


    }

}
