package com.myendnoteweb.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(xpath = ".//img[contains(@alt,'Clarivate Analytics')]")
    private WebElement logo;


}
