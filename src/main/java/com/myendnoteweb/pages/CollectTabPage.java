package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectTabPage extends BasePage {

    @FindBy(id = "lgLink2")
    public WebElement collectTab;

    public WebElement getCollectTab() {
        return collectTab;
    }



    /*public void signIN() {
        getLoginField().sendKeys(login);
        System.out.println("Login");
        getPasswordField().sendKeys(password);
        System.out.println("Password");
        getButtonLogIn().click();
        System.out.println("Press button");
    }*/
}
