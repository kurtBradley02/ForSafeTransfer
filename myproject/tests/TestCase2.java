package com.myproject.tests;

import org.testng.annotations.Test;

import com.myproject.util.BaseTest;

public class TestCase2 extends BaseTest{
	
    @Test
    public void testCase02() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.login("randomtestdata2@mail.com", "test1234");

        standAloneTests.deleteAccount();
    }
	
}
