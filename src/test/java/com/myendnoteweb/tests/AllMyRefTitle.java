package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMyRefTitle extends MainPage {

    @Test
    public void allMyRefTitle() {
        signIN();
        clickByXpath(".//a[contains(text(), 'Show Getting Started Guide')]");
        clickByXpath(".//a[contains(text(), 'Hide Getting')]");
        clickByXpath(".//td[contains(text(), 'All My References')]");


    }
}
