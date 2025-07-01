package com.myproject.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.myproject.pageobjects.ContactPage;
import com.myproject.util.BaseTest;
import com.myproject.util.async;

public class TestCase6 extends BaseTest{
	
    @Test
    public void testCase06() throws InterruptedException{

        standAloneTests.initHomePage();

        homePage.getContactUsBtnTextLink().click();

        ContactPage contactPage = new ContactPage(driver);

        async.explicitWait(driver, contactPage.getGetInTouchIsVisible());
        assertEquals(contactPage.getGetInTouchIsVisible().isDisplayed(), true);

        contactPage.getNameField().sendKeys("name");
        contactPage.getEmailField().sendKeys("email1@mail.com");
        contactPage.getSubjectField().sendKeys("test subject");
        contactPage.getMessageField().sendKeys("test message");
        //contactPage.getUploadFileBtn().sendKeys("/Users/kurtjocson/Desktop/TestUpload.rtf");
        
        scrollDown(500);

        contactPage.getSubmitBtn().click();

        async.alertWait(driver);
        alertOkAccept();

        async.explicitWait(driver, contactPage.getSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible());
        assertEquals(contactPage.getSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible().isDisplayed(), true);

        contactPage.getHomeBtn().click();
    }
	
}
