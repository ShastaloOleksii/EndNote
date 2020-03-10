package com.my.endnote.web.tests.registration;

import com.my.endnote.web.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

//This class was changed
public class RegistrationPageTest extends BaseTest {
    private String email;

    @Test
    public void registration() throws InterruptedException {
        getRegistrationPageSteps().openWindow();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        getRegistrationPageSteps().switchToWindow(tabs, 0);
        // We are opening link of the mailbox
        getRegistrationPageSteps().goToPage(getMailHost());
        // We are taking email address
        email = getRegistrationPageSteps().readingEmail(email);
        // We are clicking on the check mailbox button
        getRegistrationPageSteps().goToMailBox();
        // We are switching to the second tab
        getRegistrationPageSteps().switchToWindow(tabs, 1);
        // We are opening address of the login page of the EndNote web app
        getRegistrationPageSteps().goToPage(getHost());
        //Colling method for main registration process
        getRegistrationPageSteps().registrationLowLevelProcess(getPassword(), getFirstName(), getLastName(), email);
        // We are switching to the first tab
        getRegistrationPageSteps().switchToWindow(tabs, 0);
        //Thread.sleep(5000); //This will be changed!!!
        getRegistrationPageSteps().waitForMail();
        getRegistrationPageSteps().registrationIntermediateLevelProcess(getUrlBefore(), email, getUrlAfter());
        getRegistrationPageSteps().switchToWindow(tabs, 1);
        getRegistrationPageSteps().registrationFinalStep(email, getPassword());
        Assert.assertTrue(getRegistrationPageSteps().isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));

    }

}
