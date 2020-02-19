package com.myendnoteweb.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class XPathHW extends FatherXPath {
    //Link used
    //https://access.clarivate.com/login?app=endnote
    @Test
    public void xpathLast2() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//div/span[last()]"));
    }

    @Test
    public void not() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//a[not(@class)]"));
    }

    @Test
    public void not1() {
        Assert.assertTrue(isWebElementDisplayedXpath(".//script[not(@var ) and not(@type) and not(@async)]"));
    }

    @Test
    public void ancestor() {
        By sel = By.xpath(".//td/nav[@id = 'enwHeader']//ancestor::div");
        list(sel);
    }

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


    /*
       Link used
       https://www.myendnoteweb.com/EndNoteWeb.html
       .//span[@class= 'dropdown']//ancestor::li
       .//*[form]/parent::tr
       .//*[input]/parent::div
       .//tr[contains(@id,'display')]/preceding::*
        .//tr[contains(@id,'display')]/preceding::div[contains(@class, 'ne-main-nav-wrapper')]
        .//input[contains(@id,'refID')]/preceding-sibling::input[contains(@name,'max_page_count')]
        .//input[contains(@id,'idRestoreval')]/preceding-sibling::*
        .//table[contains(@id, 'summaryOuterTable')]/descendant::div[contains(@class,'ne')]
        .//table[contains(@id, 'summaryOuterTable')]/descendant::td[contains(text(),'3')]
        .//div[contains(@id,'')]/following-sibling::ul
        .//div[contains(@id,'')]/following-sibling::form
        .//ul[contains(@class,'')]/following-sibling::*
        .//div[count(div)=2]
        .//div[count(ul)]/descendant::li[contains(@class,'ne')]
        .//div[count(div)=2] | .//div[count(ul)]/descendant::li[contains(@class,'ne')]
        .//div[contains(@id,'')]/following-sibling::ul | .//div[contains(@id,'')]/following-sibling::form
        .//td[count(div) >= 2 ] | .//tr[count(div<=3)]
        .//div[count(ul) >= 1 ] | .//div[count(ul<=2)]
        .//div[count(ul) >= 5 mod 2 ] | .//div[count(ul<=5 mod 3)]
         .//ul[count(li)>= 5 mod 2] | ul[count(li) <= 5 mod 3]
     */


}
