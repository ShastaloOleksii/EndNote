package com.my.endnote.web.steps;

import com.my.endnote.web.pages.OptionTabPage;
import com.my.endnote.web.steps.base.BaseStep;

public class OptionTabSteps extends BaseStep {
    OptionTabPage optionTabPage;

    public OptionTabSteps() {
        super();
        optionTabPage = pagesProvider.getOptionTabPage();
    }

}
