package tests;

import org.testng.annotations.Test;
import TestComponents.BaseTest;
import TestComponents.Reusables;
import pageobjects.LoginSignUpPage;

public class RegisterAccount extends BaseTest {

    @Test
    public void registerAccount() throws InterruptedException {
        driver.get("https://www.automationexercise.com/login");

        Reusables reusables = new Reusables(driver);

        reusables.registerUser();

    }

}
