package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OptionTabPage extends BasePage {
    @FindBy(xpath = ".//div[contains(@class,'heading')]")
    private WebElement optionsHeading;


    public WebElement getOptionsHeading() {
        return optionsHeading;
    }


}
