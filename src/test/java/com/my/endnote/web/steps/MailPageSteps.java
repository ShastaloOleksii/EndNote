package com.my.endnote.web.steps;

import com.my.endnote.web.pages.MailPage;
import com.my.endnote.web.steps.base.BaseStep;

public class MailPageSteps extends BaseStep {
    MailPage mailPage;

    public MailPageSteps() {
        super();
        mailPage = pagesProvider.getMailPage();
    }
}
