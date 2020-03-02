package com.myendnoteweb.tests.optiontab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;

public class OptionsTabTests extends BaseTest {

    @Test
    public void loginClickOnTheOptionsTabHeadingIsPresent() {
        getLoginSteps().signIn(getLogin(), getPassword());
        getMainSteps().goToOptionsPage();
        getOptionTabSteps().optionsHeadingAssert();
    }

}
