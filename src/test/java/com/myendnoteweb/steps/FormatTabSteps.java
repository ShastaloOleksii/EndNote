package com.myendnoteweb.steps;

import com.myendnoteweb.pages.FormatTabPage;
import com.myendnoteweb.steps.base.BaseStep;
import org.openqa.selenium.WebDriver;

public class FormatTabSteps extends BaseStep {
    FormatTabPage formatTabPage;

    public FormatTabSteps(WebDriver driver) {
        super(driver);

        formatTabPage = pagesProvider.getFormatTabPage();
       // formatTabPage = PageFactory.initElements(driver, FormatTabPage.class);
    }

    public void openFavoriteList() {
        formatTabPage.getSelectFavaorites().click();
    }
}
