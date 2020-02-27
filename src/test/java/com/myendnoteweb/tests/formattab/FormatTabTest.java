package com.myendnoteweb.tests.formattab;

import com.myendnoteweb.pages.FormatTabPage;
import com.myendnoteweb.pages.MainPage;
import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FormatTabTest extends BaseTest {

    @Test
    public void loginClickOnTheFormatTabHeadingIsPresent() {
        preconditions();
        MainPage mainPage = new MainPage(driver);
        getFormatTabSteps().clickOnTheButton(mainPage.getFormatTab());
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
        FormatTabPage formatTabPage = new FormatTabPage(driver);
        getFormatTabSteps().clickOnTheButton(formatTabPage.getSelectFavaorites());
        Assert.assertTrue(isWebElementDisplayedXpath(".//table[contains(@class, 'connectFiles')]"));

    }
}
