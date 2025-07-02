package seleniumframework.testdata;

import org.testng.annotations.Test;

import seleniumframework.pageobjects.LoginSignUpPage;
import seleniumframework.testcomponents.BaseTest;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterUser extends BaseTest {
	
	@Test(priority=2)
	public void testCase02() throws InterruptedException {
	    standAloneTests.initHomePage();
	    homePage.getSignUpLoginBtnTextLink().click();
	    standAloneTests.registerUser("test2", "randomtestdata2@mail.com");

	    LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);
	    loginSignUpPage.getLogoutBtn().click();
	}

	@Test(priority=4)
	public void testCase04() throws InterruptedException {
	    standAloneTests.initHomePage();
	    homePage.getSignUpLoginBtnTextLink().click();
	    standAloneTests.registerUser("test4", "randomtestdata4@mail.com");

	    LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);
	    loginSignUpPage.getLogoutBtn().click();
	}

	@Test(priority=16)
	public void testCase16() throws InterruptedException {
	    standAloneTests.initHomePage();
	    homePage.getSignUpLoginBtnTextLink().click();
	    standAloneTests.registerUser("test16", "randomtestdata16@mail.com");

	    LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);
	    loginSignUpPage.getLogoutBtn().click();
	}

	@Test(priority=20)
	public void testCase20() throws InterruptedException {
	    standAloneTests.initHomePage();
	    homePage.getSignUpLoginBtnTextLink().click();
	    standAloneTests.registerUser("test20", "randomtestdata20@mail.com");

	    LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);
	    loginSignUpPage.getLogoutBtn().click();
	}
	
	@Test(priority=5)
	public void testCase05() throws InterruptedException {
	    standAloneTests.initHomePage();
	    homePage.getSignUpLoginBtnTextLink().click();
	    standAloneTests.registerUser("test5", "randomtestdata5@mail.com");

	    LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);
	    loginSignUpPage.getLogoutBtn().click();
	}


}
