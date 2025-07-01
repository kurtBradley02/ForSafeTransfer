package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;



public class TestCase5 extends BaseTest{
	
    @Test
    public void testCase05() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.checkRegisterNameEmail("test5","randomtestdata5@mail.com");

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        async.explicitWait(driver, loginSignUpPage.getEmailAddressAlreadyExistIsVisible());
        assertEquals(loginSignUpPage.getEmailAddressAlreadyExistIsVisible().isDisplayed(), true);
    }
	
}
