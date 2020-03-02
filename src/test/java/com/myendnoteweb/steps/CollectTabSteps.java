package com.myendnoteweb.steps;

import com.myendnoteweb.pages.CollectTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class CollectTabSteps extends BaseStep {
    private CollectTabPage collectTabPage;

    public CollectTabSteps(WebDriver driver) {
        super(driver);
        collectTabPage = pagesProvider.getCollectTabPage();
//        page = new CollectTabPage(driver);

    }

    public void doSomething() {
        collectTabPage.getBritishLibrary().click();
        waitUtils.waitElementToBeClickable(collectTabPage.getSelectSearchConnection());
        collectTabPage.getSelectSearchConnection().click();
    }

    public void clickOnSelectSearchConnection() {
        collectTabPage.getSelectSearchConnection().click();
    }
}
