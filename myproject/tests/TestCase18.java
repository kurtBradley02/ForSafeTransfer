package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;



public class TestCase18 extends BaseTest{
	
    @Test
    public void testCase18() throws InterruptedException{

        standAloneTests.initHomePage();

        scrollDown(500);

        async.explicitWait(driver ,homePage.getCategoryIsVisible());
        assertEquals(homePage.getCategoryIsVisible().isDisplayed(), true);

        homePage.getWomenCategoryBtn().click();

        async.explicitWait(driver, homePage.getWomenTopsCategoryBtn());
        homePage.getWomenTopsCategoryBtn().click();

        ProductsPage productsPage = new ProductsPage(driver);

        async.explicitWait(driver, productsPage.getWomenTopsProductIsVisible());
        assertEquals(productsPage.getWomenTopsProductIsVisible().isDisplayed(), true);

        productsPage.getMenCategoryBtn().click();

        async.explicitWait(driver, productsPage.getTshirtCategoryBtn());
        productsPage.getTshirtCategoryBtn().click();

        async.explicitWait(driver, productsPage.getTshirtCategoryIsVisible());
        assertEquals(productsPage.getTshirtCategoryIsVisible().isDisplayed(), true);

    }
	
}
