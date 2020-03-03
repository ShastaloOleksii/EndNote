package com.myendnoteweb.steps;

import com.myendnoteweb.pages.OptionTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OptionTabSteps extends BaseStep {
    OptionTabPage optionTabPage;

    public OptionTabSteps(WebDriver driver) {
        super(driver);
        optionTabPage = pagesProvider.getOptionTabPage();
//        optionTabPage = PageFactory.initElements(driver, OptionTabPage.class);
    }

    public void optionsHeadingAssert(){
        Assert.assertTrue(optionTabPage.getOptionsHeading().isDisplayed());
    }
}
