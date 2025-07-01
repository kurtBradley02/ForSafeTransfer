package com.myproject.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.myproject.pageobjects.CartPage;
import com.myproject.pageobjects.HomePage;
import com.myproject.pageobjects.LoginSignUpPage;
import com.myproject.pageobjects.ProductsPage;

import static org.testng.AssertJUnit.assertEquals;

public class StandAloneTests extends BaseTest{

    WebDriver driver;
    JavascriptExecutor js;
    public StandAloneTests(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public void initHomePage(){
        driver.get("https://automationexercise.com");
 
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
    }

    public void scrollDown(Integer distance){
        js.executeScript("window.scrollBy(0,"+distance.toString()+")");
    }

    public void hover(WebElement elem){
        action = new Actions(driver);
        action.moveToElement(elem).perform();
    }

    public void login(String email, String password){
        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        async.explicitWait(driver, loginSignUpPage.getLoginEmailAddressField());
        loginSignUpPage.getLoginEmailAddressField().sendKeys(email);
        loginSignUpPage.getPasswordField().sendKeys("test1234");
        loginSignUpPage.getLoginBtn().click();
    }

    public void orderFirstProduct() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        Thread.sleep( 1000);

        scrollDown(500);

        hover(homePage.getFirstProduct());

        homePage.getAddToCart().click();

        Thread.sleep(1000);
        homePage.getViewCart().click();

        Thread.sleep(1000);
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/view_cart");
    }

    public void checkOutRegister() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);

        Thread.sleep(1000);
        cartPage.getProceedToCheckoutBtn().click();
        cartPage.getRegisterLoginBtnTextLink().click();
    }

    public void checkRegisterNameEmail(String name, String email) throws InterruptedException {

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);
        loginSignUpPage.getNameField().sendKeys(name);
        loginSignUpPage.getEmailAddressField().sendKeys(email);
        loginSignUpPage.getSignUpBtn().click();

    }

    public void searchProduct(String product) throws InterruptedException {

        ProductsPage productsPage = new ProductsPage(driver);

        scrollDown(200);

        Thread.sleep(1000);
        assertEquals(productsPage.getAllProductsIsVisible().isDisplayed(), true);

        productsPage.getSearchField().sendKeys(product);

        productsPage.getSearchBtn().click();

        assertEquals(productsPage.getSearchedProductIsVisible().isDisplayed(), true);
    }

    public void registerUser(String name, String email) throws InterruptedException {

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        checkRegisterNameEmail(name, email);

        async.explicitWait(driver, loginSignUpPage.getEnterAccountInformationIsVisible());
        assertEquals(loginSignUpPage.getEnterAccountInformationIsVisible().isDisplayed(), true);

        loginSignUpPage.getTitleMrFieldChkBox().click();
        loginSignUpPage.getName2Field().sendKeys("test");
        loginSignUpPage.getPasswordField().sendKeys("test1234");

        this.scrollDown(500);

        async.explicitWait(driver, loginSignUpPage.getDayOfBirthField());
        dropdown(loginSignUpPage.getDayOfBirthField()).selectByValue("2");
        dropdown(loginSignUpPage.getMonthOfBirthField()).selectByIndex(6);
        dropdown(loginSignUpPage.getYearOfBirthField()).selectByValue("1992");

        loginSignUpPage.getSignUpForOurNewsLetterChkBox().click();
        loginSignUpPage.getReceiveSpecialOffersFromOurPartnersChkBox().click();

        loginSignUpPage.getFirstNameField().sendKeys("Kurt");
        loginSignUpPage.getLastNameField().sendKeys("Jocson");
        loginSignUpPage.getCompanyField().sendKeys("sp");

        scrollDown(500);

        async.explicitWait(driver, loginSignUpPage.getAddressField());
        loginSignUpPage.getAddressField().sendKeys("earth");
        loginSignUpPage.getAddress2Field().sendKeys("earth");

        dropdown(loginSignUpPage.getCountryField()).selectByValue("Canada");

        loginSignUpPage.getStateField().sendKeys("metro manila");
        loginSignUpPage.getCityField().sendKeys("las pinas");
        loginSignUpPage.getZipCode().sendKeys("1747");
        loginSignUpPage.getMobileNumber().sendKeys("09123456781");

        scrollDown(500);

        async.explicitWait(driver, loginSignUpPage.getCreateAccountBtn());
        loginSignUpPage.getCreateAccountBtn().click();

        async.explicitWait(driver, loginSignUpPage.getAccountCreatedIsVisible());
        assertEquals(loginSignUpPage.getAccountCreatedIsVisible().isDisplayed(), true);

        loginSignUpPage.getContinueBtn().click();

        async.explicitWait(driver, loginSignUpPage.getLoggedInAsUsernameIsVisible());
        assertEquals(loginSignUpPage.getLoggedInAsUsernameIsVisible().isDisplayed(), true);

    }

    public void checkout() throws  InterruptedException{

        CartPage cartPage = new CartPage(driver);

        Thread.sleep(1000);
        cartPage.getProceedToCheckoutBtn().click();

        Thread.sleep(1000);
        assertEquals(cartPage.getAddressDetailsIsVisible().isDisplayed(), true);

        scrollDown(500);
        Thread.sleep(1000);
        cartPage.getCommentTextAreaField().sendKeys("description");

        scrollDown(500);
        cartPage.getPlaceOrderBtn().click();

        Thread.sleep(2000);
        cartPage.getNameOnCardField().sendKeys("test");
        cartPage.getCardNumberField().sendKeys("1234");
        cartPage.getCvcField().sendKeys("123");
        cartPage.getExpirationDateMonthField().sendKeys("01");
        cartPage.getExpirationDateYearField().sendKeys("1234");
        
        scrollDown(500);
        cartPage.getPayAndConfirmBtn().click();

        //assertEquals(cartPage.getReviewYourOrderIsVisible().isDisplayed(), true);
    }

    public void deleteAccount(){

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        async.explicitWait(driver, loginSignUpPage.getDeleteBtn());
        loginSignUpPage.getDeleteBtn().click();

        async.explicitWait(driver, loginSignUpPage.getAccountDeletedIsVisible(), 30);
        assertEquals(loginSignUpPage.getAccountDeletedIsVisible().isDisplayed(), true);

        loginSignUpPage.getContinueBtn().click();
    }
}
