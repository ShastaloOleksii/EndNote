package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MatchTabPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Find the Best')]")
    private WebElement matchTabHeading;



    public WebElement getMatchTabHeading() {
        return matchTabHeading;
    }

}
