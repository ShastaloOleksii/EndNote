package com.myendnoteweb.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPathHW extends FatherXPath {
    //Link used
    // https://www.myendnoteweb.com/EndNoteWeb.html


    @Test
    public void xpathStartsWithOr() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        By mySelector = By.xpath(".//a[starts-with(text(),'Show' or starts-with(text(),'Hide'))]");
        list(mySelector);
    }

    @Test
    public void xpathStartsWith() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        By selectorStarts = By.xpath(".//div[starts-with(text(),'G')]");
        list(selectorStarts);
    }

    @Test
    public void xpathLast() {
        click(".//a/img[contains(@id,'proSmallImg')]");
        String last = driver.findElement(By.xpath(".//div/span[last()]")).getText();
        print(last);
    }

    @Test
    public void xpathLast2() {
        //Link used
        //https://access.clarivate.com/login?app=endnote
        String last = driver.findElement(By.xpath(".//div/span[last()]")).getText();
        print(last);
    }

    @Test
    public void not() {
        trueFalse(".//a[not(@class)]");
    }

    @Test
    public void not1() {
        trueFalse(".//script[not(@var ) and not(@type) and not(@async)]");
    }

    @Test
    public void ancestor() {
        By sel = By.xpath(".//td/nav[@id = 'enwHeader']//ancestor::div");
        list(sel);
    }
    /*.//span[@class= 'dropdown']//ancestor::li
       .//*[form]/parent::tr
       .//*[input]/parent::div
       .//tr[contains(@id,'display')]/preceding::*
        .//tr[contains(@id,'display')]/preceding::div[contains(@class, 'ne-main-nav-wrapper')]
        .//input[contains(@id,'refID')]/preceding-sibling::input[contains(@name,'max_page_count')]
        .//input[contains(@id,'idRestoreval')]/preceding-sibling::*
     */





}
