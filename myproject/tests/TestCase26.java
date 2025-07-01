package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.util.BaseTest;

public class TestCase26 extends BaseTest{
	
    @Test
    public void testCase26() throws InterruptedException{
    	  
    	  standAloneTests.initHomePage();

          scrollDown(10000);

          Thread.sleep(1000);

          assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);

          scrollUp(10000);

          Thread.sleep(4000);

          assertEquals(homePage.getFullFledgedPracticeWebsiteForAutomationEngineersIsVisible().isDisplayed(), true);

    }
	
}
