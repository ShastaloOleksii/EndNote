package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;

public class AllMyRefTitle extends MainPage {

    @Test
    public void allMyRefTitle() {
        signIN();
        clickByXpath(".//a[contains(text(), 'Show Getting Started Guide')]");
        clickByXpath(".//a[contains(text(), 'Hide Getting')]");
        clickByXpath(".//td[contains(text(), 'All My References')]");


    }
}
