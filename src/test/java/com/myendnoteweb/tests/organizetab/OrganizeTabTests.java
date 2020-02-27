package com.myendnoteweb.tests.organizetab;

import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.pages.OrganizeTabPage;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrganizeTabTests extends BaseTest {


    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        preconditions();
        MainPage mainPage = new MainPage(driver);
        getOrganizeTabSteps().clickOnTheButton(mainPage.getOrganize());
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
