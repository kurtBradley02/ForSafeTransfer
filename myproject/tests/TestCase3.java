package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;



public class TestCase3 extends BaseTest{
	
    @Test
    public void testCase03() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.login("incorrect@mail.com","incorrect");

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        async.explicitWait(driver ,loginSignUpPage.getYourEmailAndPasswordIsIncorrectIsVisible());
        assertEquals(loginSignUpPage.getYourEmailAndPasswordIsIncorrectIsVisible().isDisplayed(), true);
    }
	
}
