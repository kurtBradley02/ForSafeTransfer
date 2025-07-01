package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;



public class TestCase4 extends BaseTest{
	
    @Test
    public void testCase04() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.login("randomtestdata3@mail.com", "test1234");

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        async.explicitWait(driver,loginSignUpPage.getLoggedInAsUsernameIsVisible());
        assertEquals(loginSignUpPage.getLoggedInAsUsernameIsVisible().isDisplayed(), true);

        loginSignUpPage.getLogoutBtn().click();

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }
	
}
