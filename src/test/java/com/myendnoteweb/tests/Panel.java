package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Panel extends MainPage {
    WebDriverWait wait;

    @Test
    public void panel() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'sideHead')]"));
    }


    @Test
    public void hidePanel() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath(".//form[contains(@name, 'citationSearchForm')]"));
        /*if (driver.findElement(By.xpath("//*[@id=\"sidepanel\"]/form")).isDisplayed()) {
            System.out.println("Pannel is present the test fail");
        } else {
            System.out.println("Panel is absent, test is passed");
        }*/
    }

    @Test
    public void unFiled() {
        signIN();
        driver.findElement(By.xpath(".//a[contains(@title,'View references not in a group')]")).click();
        driver.findElement(By.xpath(".//td[contains(@class,'heading')] ")).isDisplayed();

    }
}
