package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;

public class TestCase9 extends BaseTest{
	
    @Test
    public void testCase09() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getProductsBtnTextLink().click();

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");

        standAloneTests.searchProduct("Sleeveless Dress");

        scrollDown(500);

        ProductsPage productsPage = new ProductsPage(driver);

        scrollDown(500);

        async.explicitWait(driver, productsPage.getSearchedProductTitleIsVisible());
        assertEquals(productsPage.getSearchedProductTitleIsVisible().isDisplayed(), true);
    }
	
}
