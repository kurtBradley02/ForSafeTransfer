package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.StandAloneTests;


public class TestCase22 extends BaseTest{
	
    @Test
    public void testCase22() throws InterruptedException{
    	
    	  standAloneTests.initHomePage();

          scrollDown(1000);

          Thread.sleep(1000);

          assertEquals(homePage.getRecommendedItemsIsVisible().isDisplayed(), true);

          homePage.getAddToCartRecommendedProductBtn().click();

          Thread.sleep(1000);
          homePage.getViewCart().click();

          //TODO: assert on products on cart

    }
	
}
