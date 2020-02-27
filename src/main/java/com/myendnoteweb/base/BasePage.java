package com.myendnoteweb.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private WebDriver driver;


    @FindBy(xpath = ".//img[contains(@alt,'Clarivate Analytics')]")
    private WebElement logo;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLogo() {
        return logo;
    }

    public void click(WebElement web) {
        web.click();
    }

    public boolean attributes(WebElement web, String attribute) {
        if (web.getAttribute(attribute) == null) {
            return false;
        } else {
            System.out.println(web.getAttribute(attribute));
            return true;
        }

    }


}
