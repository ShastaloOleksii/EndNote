package com.myendnoteweb.pages;

import com.myendnoteweb.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectTabPage extends BasePage {
    public CollectTabPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = ".//select[contains(@id, 'idRemoteSearchConnection')]")
    private WebElement selectSearchConnection;

    @FindBy(xpath = ".//option[contains(@value,'British Library')]")
    private WebElement britishLibrary;

    public WebElement getSelectSearchConnection() {
        return selectSearchConnection;
    }

    public WebElement getBritishLibrary() {
        return britishLibrary;
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
