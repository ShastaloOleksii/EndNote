package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OrganizeTabTests extends MainPage {
    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        signIN();
        click(organize);
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
    }
}
