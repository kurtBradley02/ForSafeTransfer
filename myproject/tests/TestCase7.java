package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.TestCasePage;
import com.myproject.util.BaseTest;


public class TestCase7 extends BaseTest{
	
    @Test
    public void testCase07() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getTestCaseBtnTextLink().click();

        TestCasePage testCase = new TestCasePage(driver);

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/test_cases");
    }
	
}
