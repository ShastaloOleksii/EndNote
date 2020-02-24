package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotTrivialPage extends BasePage {

    @FindBy(xpath = ".//a[contains(text(), 'Hide Getting Started Guide')]")
    public WebElement hideGettingStartedGuide;

    @FindBy(xpath = ".//img[contains(@alt,'Clarivate Analytics')]")
    public WebElement logo;


}
