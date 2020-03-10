package com.my.endnote.web.steps;

import com.my.endnote.web.pages.FormatTabPage;
import com.my.endnote.web.steps.base.BaseStep;

public class FormatTabSteps extends BaseStep {
    FormatTabPage formatTabPage;

    public FormatTabSteps() {
        super();
        formatTabPage = pagesProvider.getFormatTabPage();
    }

    public void openFavoriteList() {
        formatTabPage.getSelectFavaorites().click();
    }
}
