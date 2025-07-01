package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.util.BaseTest;

public class TestCase25 extends BaseTest{
	
    @Test
    public void testCase20() throws InterruptedException{
    	  
    	  standAloneTests.initHomePage();

          scrollDown(10000);

          Thread.sleep(1000);

          assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);

          Thread.sleep(1000);
          homePage.getArrowUpBtn().click();

          Thread.sleep(3000);

          assertEquals(homePage.getFullFledgedPracticeWebsiteForAutomationEngineersIsVisible().isDisplayed(), true);
    }
	
}
