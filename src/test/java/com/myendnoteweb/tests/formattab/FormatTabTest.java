package com.myendnoteweb.tests.formattab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class FormatTabTest extends BaseTest {

    @Test
    public void loginClickOnTheFormatTabHeadingIsPresent() {
        preconditions();
        getFormatTabSteps().clickOnTheButton(getMainPage().getFormatTab());
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'heading')]"));
        getFormatTabSteps().clickOnTheButton(getFormatTabPage().getSelectFavaorites());
        Assert.assertTrue(isWebElementDisplayedXpath(".//table[contains(@class, 'connectFiles')]"));

    }
}
