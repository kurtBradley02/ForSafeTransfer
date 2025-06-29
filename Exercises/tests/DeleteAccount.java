package tests;

import org.testng.annotations.Test;
import TestComponents.BaseTest;
import pageobjects.LoginSignUpPage;

public class DeleteAccount extends BaseTest {

    @Test
    public void deleteAccount() throws InterruptedException {
        driver.get("https://www.automationexercise.com/login");

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);

        loginSignUpPage.getLoginEmailAddressField().sendKeys("randomtestdata@mail.com");
        loginSignUpPage.getPasswordField().sendKeys("test1234");
        loginSignUpPage.getLoginBtn().click();

        Thread.sleep(1000);
        loginSignUpPage.getDeleteBtn().click();

    }

}
