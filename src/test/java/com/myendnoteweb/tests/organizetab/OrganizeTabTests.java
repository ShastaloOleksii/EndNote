package com.myendnoteweb.tests.organizetab;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;

public class OrganizeTabTests extends BaseTest {


    @Test
    public void loginClickOnTheOrganizeTabHeadingIsPresent() {
        getLoginSteps().signIn(getLogin(),getPassword());
        getMainSteps().goToOrganizePage();

    }
}
