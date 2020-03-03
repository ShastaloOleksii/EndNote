package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PanelPage extends BasePage {

    @FindBy(xpath = ".//a[contains(@title,'View references not in a group')]")
    private WebElement unfiled;


    public WebElement getUnfiled() {
        return unfiled;
    }


}
