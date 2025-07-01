package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;


import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;

public class TestCase21 extends BaseTest{
	
    @Test
    public void testCase21() throws InterruptedException{
    	
 
    	standAloneTests.initHomePage();

        homePage.getProductsBtnTextLink().click();

        ProductsPage productsPage = new ProductsPage(driver);

        scrollDown(200);

        Thread.sleep(1000);
        assertEquals(productsPage.getAllProductsIsVisible().isDisplayed(), true);

        scrollDown(200);

        productsPage.getFirstProductViewProductsBtn().click();

        scrollDown(500);

        Thread.sleep(1000);
        assertEquals(productsPage.getWriteYourReviewIsVisible().isDisplayed(), true);

        Thread.sleep(1000);
        productsPage.getNameField().sendKeys("test");
        productsPage.getEmailField().sendKeys("test@mail.com");
        productsPage.getReviewField().sendKeys("test review");

        productsPage.getSubmitBtn().click();

        Thread.sleep(1000);
        assertEquals(productsPage.getThankYouForYourReviewIsVisible().isDisplayed(), true);


    }
	
}
