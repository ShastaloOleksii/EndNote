package com.myendnoteweb.tests.collecttab;

import com.myendnoteweb.pages.CollectTabPage;
import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.steps.CollectTabSteps;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CollectTabTests extends BaseTest {

    @Test
    public void loginClickOnTheCollectTabHeadingIsPresent() {
        preconditions();
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        MainPage mainPage = new MainPage(driver);
        getCollectTabSteps().clickOnTheButton(mainPage.getCollectTab());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'navbar navbar-default')]"));
        CollectTabPage collectTabPage = new CollectTabPage(driver);
        getCollectTabSteps().clickOnTheButton(collectTabPage.getSelectSearchConnection());
        // Finish the dropdown list

    }
}
