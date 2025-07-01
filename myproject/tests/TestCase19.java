package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.HomePage;
import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;


public class TestCase19 extends BaseTest{
	
    @Test
    public void testCase19() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getProductsBtnTextLink().click();

        scrollDown(500);

        ProductsPage productsPage = new ProductsPage(driver);
        
        async.explicitWait(driver, productsPage.getBrandIsVisible());
        assertEquals(productsPage.getBrandIsVisible().isDisplayed(), true);
        
        productsPage.getPoloBtnTextLink().click();
        
        assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/brand_products/Polo");
        
        async.explicitWait(driver, productsPage.getBrandIsVisible());
        assertEquals(productsPage.getBrandIsVisible().isDisplayed(), true);
        
        productsPage.getPoloBtnTextLink().click();
        
        assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/brand_products/Polo");

    }
	
}
