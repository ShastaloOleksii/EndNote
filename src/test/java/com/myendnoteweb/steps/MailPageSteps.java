package com.myendnoteweb.steps;

import com.myendnoteweb.pages.MailPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class MailPageSteps extends BaseStep {
    MailPage mailPage;

    public MailPageSteps(WebDriver driver) {
        super(driver);
        mailPage = pagesProvider.getMailPage();
        // mailPage = PageFactory.initElements(driver, MailPage.class);
    }
}
