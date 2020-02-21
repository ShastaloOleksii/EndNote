package com.myendnoteweb.tests;

import com.myendnoteweb.pages.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrganizeTabTests extends MainPage {
    public OrganizeTabTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        signIN();
        click(organize);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
