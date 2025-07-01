package com.myproject.tests;

import org.testng.annotations.Test;

import com.myproject.util.BaseTest;




public class TestCase23 extends BaseTest{
	
    @Test
    public void testCase20() throws InterruptedException{
    	
    	standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.registerUser("test23","randomtestdata23@mail.com");

        standAloneTests.orderFirstProduct();

        standAloneTests.checkout();

        //TODO: assert registration address
        //TODO: assert billing address

        Thread.sleep(1000);
        standAloneTests.deleteAccount();

    }
	
}
