package com.myendnoteweb.steps;

import com.myendnoteweb.pages.OrganizeTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrganizeTabSteps extends BaseStep {
    OrganizeTabPage organizeTabPage;


    public OrganizeTabSteps(WebDriver driver) {
        super(driver);
        organizeTabPage = pagesProvider.getOrganizeTabPage();
//        organizeTabPage= PageFactory.initElements(driver, OrganizeTabPage.class);
    }

    public void organizeHeadingAssert(){
        Assert.assertTrue(organizeTabPage.getOrganizeHeading().isDisplayed());
    }
}
