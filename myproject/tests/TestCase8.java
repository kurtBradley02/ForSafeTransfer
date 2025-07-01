package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.pageobjects.ProductDetailsPage;
import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;

public class TestCase8 extends BaseTest{
	
    @Test
    public void testCase08() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getProductsBtnTextLink().click();

        ProductsPage productsPage = new ProductsPage(driver);

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");

        scrollDown(500);

        async.explicitWait(driver, productsPage.getProductsListIsVisible());
        assertEquals(productsPage.getProductsListIsVisible().isDisplayed(), true);

        scrollDown(500);

        productsPage.getFirstProductViewProductsBtn().click();

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/product_details/1");

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

        async.explicitWait(driver, productDetailsPage.getProductNameIsVisible());
        assertEquals(productDetailsPage.getProductNameIsVisible().isDisplayed(), true);
        assertEquals(productDetailsPage.getCategoryIsVisible().isDisplayed(), true);
        assertEquals(productDetailsPage.getPriceIsVisible().isDisplayed(), true);
        assertEquals(productDetailsPage.getAvailabilityIsVisible().isDisplayed(), true);
        assertEquals(productDetailsPage.getConditionIsVisible().isDisplayed(), true);
        assertEquals(productDetailsPage.getBrandIsVisible().isDisplayed(), true);
    }
	
}
