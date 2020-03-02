package com.myendnoteweb.steps;

import com.myendnoteweb.pages.LogOutPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class LogOutSteps extends BaseStep {
    LogOutPage logOutPage;

    public LogOutSteps(WebDriver driver) {
        super(driver);

        logOutPage = pagesProvider.getLogOutPage();
       // logOutPage = PageFactory.initElements(driver, LogOutPage.class);
    }
}
