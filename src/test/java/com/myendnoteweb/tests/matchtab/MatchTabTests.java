package com.myendnoteweb.tests.matchtab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;

public class MatchTabTests extends BaseTest {

    @Test
    public void loginClickOnTheMatchTabHeadingIsPresent() {
        getLoginSteps().signIn(getLogin(), getPassword());
        getMainSteps().goToMatchPage();
        getMatchTabSteps().matchTabHeadingAssert();
    }
}
