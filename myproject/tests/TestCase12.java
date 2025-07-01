package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.CartPage;
import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;





public class TestCase12 extends BaseTest{
	
    @Test
    public void testCase12() throws InterruptedException{

        standAloneTests.initHomePage();

        scrollDown(500);

        hover(homePage.getFirstProduct());
        homePage.getAddToCart().click();

        Thread.sleep(1000);
        homePage.getContinueShopping().click();

        Thread.sleep(1000);
        hover(homePage.getSecondProduct());

        homePage.getAddToCart2().click();

        Thread.sleep(1000);
        homePage.getViewCart().click();

        CartPage cartPage = new CartPage(driver);

        Thread.sleep(1000);
        assertEquals(cartPage.getFirstProductIsVisible().isDisplayed(), true);
        assertEquals(cartPage.getSecondProductIsVisible().isDisplayed(), true);

        //TODO: state value for view cart assertions
        assertEquals(cartPage.getPrice1IsVisible().getText(), "Rs. 500");
        assertEquals(cartPage.getPrice2IsVisible().getText(), "Rs. 400");

        assertEquals(cartPage.getQuantity1IsVisible().getText(), "1");
        assertEquals(cartPage.getQuantity2IsVisible().getText(), "1");

        assertEquals(cartPage.getTotal1IsVisible().getText(), "Rs. 500");
        assertEquals(cartPage.getTotal2IsVisible().getText(), "Rs. 400");

    }
	
}
