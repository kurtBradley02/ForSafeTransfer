package com.myproject.tests;

import org.testng.annotations.Test;

import com.myproject.util.BaseTest;

public class TestCase1 extends BaseTest{
	
    @Test
    public void testCase01() throws InterruptedException {

        standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.registerUser("test1","randomtestdata1@mail.com");

        standAloneTests.deleteAccount();

    }
	
}
