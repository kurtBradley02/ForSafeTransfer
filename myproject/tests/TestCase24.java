package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.CartPage;
import com.myproject.pageobjects.ProductsPage;
import com.myproject.util.BaseTest;
import com.myproject.util.StandAloneTests;



public class TestCase24 extends BaseTest{
	
    @Test
    public void testCase24() throws InterruptedException{
    	 
    	 standAloneTests.initHomePage();

         standAloneTests.orderFirstProduct();

         standAloneTests.checkOutRegister();

         standAloneTests.registerUser("test24","randomtestdata24@mail.com");

         homePage.getCartBtnTextLink().click();

         standAloneTests.checkout();

         CartPage cartPage = new CartPage(driver);

         Thread.sleep(3000);

         cartPage.getDownloadInvoiceBtn().click();

         cartPage.getContinueBtn().click();

         //TODO: assert for download successful

         Thread.sleep(1000);

         standAloneTests.deleteAccount();

    }
	
}
