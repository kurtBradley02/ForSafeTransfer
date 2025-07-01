package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;



public class TestCase15 extends BaseTest{
	
    @Test
    public void testCase15() throws InterruptedException{

        standAloneTests.initHomePage();

        scrollDown(10000);

        assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);

        homePage.getEmailAddressField().sendKeys("randomtest@mail.com");
        homePage.getArrowBtn().click();

        async.explicitWait(driver, homePage.getYouHaveBeenSuccessfullySubscribedIsVisible());
        assertEquals(homePage.getYouHaveBeenSuccessfullySubscribedIsVisible().isDisplayed(), true);
    }
	
}
