package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;



public class TestCase11 extends BaseTest{
	
    @Test
    public void testCase11() throws InterruptedException{

    	 standAloneTests.initHomePage();

         homePage.getCartBtnTextLink().click();

         scrollDown(1000);

         Thread.sleep(1000);
         assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);

         homePage.getEmailAddressField().sendKeys("randomtest@mail.com");
         homePage.getArrowBtn().click();

         Thread.sleep(1000);
         assertEquals(homePage.getYouHaveBeenSuccessfullySubscribedIsVisible().isDisplayed(), true);
    }
	
}
