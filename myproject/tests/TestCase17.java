package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.CartPage;
import com.myproject.util.BaseTest;
import com.myproject.util.StandAloneTests;





public class TestCase17 extends BaseTest{
	
    @Test
    public void testCase17() throws InterruptedException{

        standAloneTests.initHomePage();

        StandAloneTests standAloneTests = new StandAloneTests(driver);

        standAloneTests.orderFirstProduct();

        CartPage cartPage = new CartPage(driver);

        cartPage.getRemoveItem().click();

        Thread.sleep(1000);
        assertEquals(cartPage.getCartIsEmptyIsVisible().isDisplayed(), true);

    }
	
}
