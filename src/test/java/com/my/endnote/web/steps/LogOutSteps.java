package com.my.endnote.web.steps;

import com.my.endnote.web.pages.LogOutPage;
import com.my.endnote.web.steps.base.BaseStep;

public class LogOutSteps extends BaseStep {
    LogOutPage logOutPage;

    public LogOutSteps() {
        super();
        logOutPage = pagesProvider.getLogOutPage();
    }
}
