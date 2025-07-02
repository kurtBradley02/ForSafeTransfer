package seleniumframework.testdata;

import org.testng.annotations.Test;

import seleniumframework.testcomponents.BaseTest;

public class DeleteUser extends BaseTest {

	@Test(priority = 1)
	public void testCase01() {

		standAloneTests.initHomePage();

		homePage.getSignUpLoginBtnTextLink().click();

		standAloneTests.login("randomtestdata1@mail.com", "test1234");

		standAloneTests.deleteAccount();

	}

	@Test(priority = 2)
	public void testCase14() {

		standAloneTests.initHomePage();

		homePage.getSignUpLoginBtnTextLink().click();

		standAloneTests.login("randomtestdata14@mail.com", "test1234");

		standAloneTests.deleteAccount();

	}

	@Test(priority = 3)
	public void testCase15() {

		standAloneTests.initHomePage();

		homePage.getSignUpLoginBtnTextLink().click();

		standAloneTests.login("randomtestdata15@mail.com", "test1234");

		standAloneTests.deleteAccount();

	}

	@Test(priority = 4)
	public void testCase23() {

		standAloneTests.initHomePage();

		homePage.getSignUpLoginBtnTextLink().click();

		standAloneTests.login("randomtestdata23@mail.com", "test1234");

		standAloneTests.deleteAccount();

	}

	@Test(priority = 5)
	public void testCase24() {

		standAloneTests.initHomePage();

		homePage.getSignUpLoginBtnTextLink().click();

		standAloneTests.login("randomtestdata24@mail.com", "test1234");

		standAloneTests.deleteAccount();

	}

}
