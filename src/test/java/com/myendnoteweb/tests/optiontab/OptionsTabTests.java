package com.myendnoteweb.tests.optiontab;

import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.pages.OptionTabPage;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OptionsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        preconditions();
        MainPage mainPage = new MainPage(driver);
        getOptionTabSteps().clickOnTheButton(mainPage.getOptions());
        Assert.assertTrue(isWebElementDisplayedXpath(".//div[contains(@class,'heading')]"));
    }

}
