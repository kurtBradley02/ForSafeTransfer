package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;


import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.StandAloneTests;

public class TestCase20 extends BaseTest{
	
    @Test
    public void testCase20() throws InterruptedException{
    	
    	standAloneTests.initHomePage();

        homePage.getProductsBtnTextLink().click();

        ProductsPage productsPage = new ProductsPage(driver);

        scrollDown(200);

        Thread.sleep(1000);
        assertEquals(productsPage.getAllProductsIsVisible().isDisplayed(), true);

        productsPage.getSearchField().sendKeys("Dress");

        productsPage.getSearchBtn().click();

        assertEquals(productsPage.getSearchedProductIsVisible().isDisplayed(), true);

        //TODO: assert for searched products

        StandAloneTests standAloneTests = new StandAloneTests(driver);

        standAloneTests.orderFirstProduct();

        //TODO: assert for searched products on cart

        homePage.getSignUpLoginBtnTextLink().click();

        standAloneTests.login("randomtestdata20@mail.com", "test1234");

        homePage.getCartBtnTextLink().click();

        //TODO: assert for searched products on cart
    }
	
}
