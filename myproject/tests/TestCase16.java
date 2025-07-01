package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.StandAloneTests;
import com.myproject.util.async;





public class TestCase16 extends BaseTest{
	
    @Test
    public void testCase16() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        StandAloneTests standAloneTests = new StandAloneTests(driver);

        standAloneTests.login("randomtestdata16@mail.com", "test1234");

        standAloneTests.orderFirstProduct();

        standAloneTests.checkout();

        standAloneTests.deleteAccount();
    }
	
}
