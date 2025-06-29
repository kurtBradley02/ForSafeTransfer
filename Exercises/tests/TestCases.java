package tests;

import org.testng.annotations.*;
import TestComponents.BaseTest;
import TestComponents.Reusables;
import pageobjects.*;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;

public class TestCases extends BaseTest {
    
    @Test(priority=1, enabled=false)
    public void testCase01() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getSignUpLoginBtnTextLink().click();

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getNewUserSignUpIsVisible().isDisplayed(), true);

        loginSignUpPage.getNameField().sendKeys("test");
        loginSignUpPage.getEmailAddressField().sendKeys("randomtestdata@mail.com");
        loginSignUpPage.getSignUpBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getEnterAccountInformationIsVisible().isDisplayed(), true);

        loginSignUpPage.getTitleMrFieldChkBox().click();
        loginSignUpPage.getName2Field().sendKeys("test");
        loginSignUpPage.getPasswordField().sendKeys("test1234");

        scrollDown(500);

        Thread.sleep(3000);

        dropdown(loginSignUpPage.getDayOfBirthField()).selectByValue("2");
        dropdown(loginSignUpPage.getMonthOfBirthField()).selectByIndex(6);
        dropdown(loginSignUpPage.getYearOfBirthField()).selectByValue("1992");

        loginSignUpPage.getSignUpForOurNewsLetterChkBox().click();
        loginSignUpPage.getReceiveSpecialOffersFromOurPartnersChkBox().click();

        loginSignUpPage.getFirstNameField().sendKeys("Kurt");
        loginSignUpPage.getLastNameField().sendKeys("Jocson");
        loginSignUpPage.getCompanyField().sendKeys("sp");

        scrollDown(500);
        Thread.sleep(3000);

        loginSignUpPage.getAddressField().sendKeys("earth");
        loginSignUpPage.getAddress2Field().sendKeys("earth");

        dropdown(loginSignUpPage.getCountryField()).selectByValue("Canada");

        loginSignUpPage.getStateField().sendKeys("metro manila");
        loginSignUpPage.getCityField().sendKeys("las pinas");
        loginSignUpPage.getZipCode().sendKeys("1747");
        loginSignUpPage.getMobileNumber().sendKeys("09123456781");

        scrollDown(500);
        Thread.sleep(3000);

        loginSignUpPage.getCreateAccountBtn().click();


        Thread.sleep(3000);
        assertEquals(loginSignUpPage.getAccountCreatedIsVisible().isDisplayed(), true);

        loginSignUpPage.getContinueBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getLoggedInAsUsernameIsVisible().isDisplayed(), true);

        loginSignUpPage.getDeleteBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getAccountDeletedIsVisible().isDisplayed(), true);

    }

    @Test(priority=2, enabled=false)
    public void testCase02() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getSignUpLoginBtnTextLink().click();

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        assertEquals(loginSignUpPage.getLoginToYourAccountIsVisible().isDisplayed(),true);

        loginSignUpPage.getLoginEmailAddressField().sendKeys("randomtestdata@mail.com");
        loginSignUpPage.getPasswordField().sendKeys("test1234");
        loginSignUpPage.getLoginBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getLoggedInAsUsernameIsVisible().isDisplayed(), true);

        loginSignUpPage.getDeleteBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getAccountDeletedIsVisible().isDisplayed(), true);

    }

    @Test(priority=3, enabled=false)
    public void testCase03() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getSignUpLoginBtnTextLink().click();

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        assertEquals(loginSignUpPage.getLoginToYourAccountIsVisible().isDisplayed(),true);

        loginSignUpPage.getLoginEmailAddressField().sendKeys("incorrect@mail.com");
        loginSignUpPage.getPasswordField().sendKeys("incorrect password");
        loginSignUpPage.getLoginBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getYourEmailAndPasswordIsIncorrectIsVisible().isDisplayed(), true);

    }

    @Test(priority=4, enabled=false)
    public void testCase04() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getSignUpLoginBtnTextLink().click();

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        assertEquals(loginSignUpPage.getLoginToYourAccountIsVisible().isDisplayed(),true);

        loginSignUpPage.getLoginEmailAddressField().sendKeys("randomtestdata@mail.com");
        loginSignUpPage.getPasswordField().sendKeys("test1234");
        loginSignUpPage.getLoginBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getLoggedInAsUsernameIsVisible().isDisplayed(), true);

        loginSignUpPage.getLogoutBtn().click();

        assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/login");

    }

    @Test(priority=5, enabled=false)
    public void testCase05() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getSignUpLoginBtnTextLink().click();

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getNewUserSignUpIsVisible().isDisplayed(), true);

        loginSignUpPage.getNameField().sendKeys("test");
        loginSignUpPage.getEmailAddressField().sendKeys("randomtestdata@mail.com");
        loginSignUpPage.getSignUpBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getEmailAddressAlreadyExistIsVisible().isDisplayed(), true);

    }

    @Test(priority=6, enabled=false)
    public void testCase06() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getContactUsBtnTextLink().click();

        ContactPage contactPage = new ContactPage(driver);

        Thread.sleep(1000);
        assertEquals(contactPage.getGetInTouchIsVisible().isDisplayed(), true);

        contactPage.getNameField().sendKeys("name");
        contactPage.getEmailField().sendKeys("email@mail.com");
        contactPage.getSubjectField().sendKeys("test subject");
        contactPage.getMessageField().sendKeys("test message");
        contactPage.getUploadFileBtn().sendKeys("/Users/kurtjocson/Desktop/TestUpload.rtf");

        scrollDown(500);

        contactPage.getSubmitBtn().click();

        Thread.sleep(1000);
        alertOkAccept();

        Thread.sleep(1000);
        assertEquals(contactPage.getSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible().isDisplayed(), true);

        contactPage.getHomeBtn().click();
    }

    @Test(priority = 7, enabled=false)
    public void testCase07() throws InterruptedException{

        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getTestCaseBtnTextLink().click();

        TestCasePage testCase = new TestCasePage(driver);

        assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/test_cases");

        assertEquals(testCase.getTestCasePageIsVisible().isDisplayed(), true);

    }

    @Test(priority = 8, enabled=false)
    public void testCase08() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getProductsBtnTextLink().click();

        ProductsPage productsPage = new ProductsPage(driver);

        //TODO: vague step
        //assertEquals(productsPage.getProductsListIsVisible(), true);

        scrollDown(500);

        productsPage.getFirstProductViewProductsBtn().click();

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");

        assertEquals(productsPage.getProductNameIsVisible().isDisplayed(), true);
        assertEquals(productsPage.getCategoryIsVisible().isDisplayed(), true);
        assertEquals(productsPage.getPriceIsVisible().isDisplayed(), true);
        assertEquals(productsPage.getAvailabilityIsVisible().isDisplayed(), true);
        assertEquals(productsPage.getConditionIsVisible().isDisplayed(), true);
        assertEquals(productsPage.getBrandIsVisible().isDisplayed(), true);

    }

    @Test(priority = 9, enabled=false)
    public void testCase09() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getProductsBtnTextLink().click();

        ProductsPage productsPage = new ProductsPage(driver);

        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");

        productsPage.getProductNameField().sendKeys("test");

        productsPage.getSearchBtn().click();

        scrollDown(500);

        Thread.sleep(1000);
        assertEquals(productsPage.getSearchedProductIsVisible().isDisplayed(), true);

        scrollDown(500);

        assertEquals(productsPage.getSearchedProductTitleIsVisible().isDisplayed(), true);

    }

    @Test(priority=10, enabled=false)
    public void testCase10() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        scrollDown(1000);

        assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);

        homePage.getEmailAddressField().sendKeys("randomtest@mail.com");
        homePage.getArrowBtn().click();

        Thread.sleep(1000);
        assertEquals(homePage.getYouHaveBeenSuccessfullySubscribedIsVisible().isDisplayed(), true);
    }

    @Test(priority=11, enabled=false)
    public void testCase11() throws InterruptedException{

        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getCartBtnTextLink().click();

        scrollDown(1000);

        assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);

        homePage.getEmailAddressField().sendKeys("randomtest@mail.com");
        homePage.getArrowBtn().click();

        Thread.sleep(1000);
        assertEquals(homePage.getYouHaveBeenSuccessfullySubscribedIsVisible().isDisplayed(), true);



    }

    @Test(priority=12, enabled=false)
    public void testCase12() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        scrollDown(500);

        hover(homePage.getFirstProduct());

        homePage.getAddToCart().click();
        homePage.getContinueShopping().click();

        scrollDown(500);

        hover(homePage.getSecondProduct());

        homePage.getAddToCart().click();
        homePage.getViewCart().click();

        CartPage cartPage = new CartPage(driver);

        assertEquals(cartPage.getFirstProductIsVisible().isDisplayed(), true);
        assertEquals(cartPage.getSecondProductIsVisible().isDisplayed(), true);

        //TODO: state value for view cart assertions
        assertEquals(cartPage.getPrice1IsVisible().getText(), "");
        assertEquals(cartPage.getPrice2IsVisible().getText(), "");
        assertEquals(cartPage.getQuantity1IsVisible().getText(), "");
        assertEquals(cartPage.getQuantity2IsVisible().getText(), "");
        assertEquals(cartPage.getTotal1IsVisible().getText(), "");
        assertEquals(cartPage.getTotal2IsVisible().getText(), "");


    }

    @Test(priority=13, enabled=false)
    public void testCase13() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        scrollDown(500);

        homePage.getViewProduct().click();

        scrollDown(500);

        assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/product_details/1");

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

        productDetailsPage.getQuantityField().sendKeys("4");

        productDetailsPage.getAddToCart().click();

        homePage.getViewCart().click();

        CartPage cartPage = new CartPage(driver);

        //TODO: assert text value
        assertEquals(cartPage.getQuantity1IsVisible().getText(), "4");

    }


    @Test(priority=14, enabled=false)
    public void testCase14() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        Reusables reusables = new Reusables(driver);

        reusables.orderFirstProduct();

        CartPage cartPage = new CartPage(driver);

        Thread.sleep(1000);
        cartPage.getProceedToCheckoutBtn().click();
        cartPage.getRegisterLoginBtnTextLink().click();

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);
        reusables.registerUser();

        homePage.getCartBtnTextLink().click();

        reusables.checkout();

        reusables.deleteAccount();

    }

    @Test(priority=15, enabled=false)
    public void testCase15() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        Reusables reusables = new Reusables(driver);

        homePage.getSignUpLoginBtnTextLink().click();

        reusables.registerUser();

        homePage.getHomeBtnTextLink().click();

        Thread.sleep(1000);
        reusables.orderFirstProduct();

        reusables.checkout();

        reusables.deleteAccount();

    }


    @Test(priority=16, enabled=false)
    public void testCase16() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        homePage.getSignUpLoginBtnTextLink().click();

        Reusables reusables = new Reusables(driver);

        reusables.login();

        reusables.orderFirstProduct();

        reusables.checkout();

        reusables.deleteAccount();

    }



    @Test(priority=17, enabled=false)
    public void testCase17() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");


        Reusables reusables = new Reusables(driver);

        reusables.orderFirstProduct();

        CartPage cartPage = new CartPage(driver);

        cartPage.getRemoveItem().click();

        Thread.sleep(1000);
        assertEquals(cartPage.getCartIsEmptyIsVisible().isDisplayed(), true);

    }


    @Test(priority=18, enabled = false)
    public void testCase18() throws InterruptedException{
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        scrollDown(500);

        assertEquals(homePage.getCategoryIsVisible().isDisplayed(), true);

        homePage.getWomenCategoryBtn().click();

        Thread.sleep(1000);
        homePage.getWomenTopsCategoryBtn().click();

        ProductsPage productsPage = new ProductsPage(driver);

        Thread.sleep(1000);
        assertEquals(productsPage.getWomenTopsProductIsVisible().isDisplayed(), true);

        productsPage.getMenCategoryBtn().click();
        
        Thread.sleep(1000);
        productsPage.getTshirtCategoryBtn().click();

        Thread.sleep(1000);
        assertEquals(productsPage.getTshirtCategoryIsVisible().isDisplayed(), true);

    }
    
    @Test(priority = 19, enabled = false)
    public void testCase19() {
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        homePage.getProductsBtnTextLink().click();
        
        scrollDown(1000);
        
        ProductsPage productsPage = new ProductsPage(driver);
        
        

        
    }
    
    @Test(priority = 20, enabled = false)
    public void testCase20() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        homePage.getProductsBtnTextLink().click();
        
        ProductsPage productsPage = new ProductsPage(driver);
        
        scrollDown(200);
        
        Thread.sleep(1000);
        assertEquals(productsPage.getAllProductsIsVisible().isDisplayed(), true);
        
        productsPage.getSearchField().sendKeys("Dress");
        
        productsPage.getSearchBtn().click();
        
        assertEquals(productsPage.getSearchedProductIsVisible().isDisplayed(), true);
        
        //TODO: assert for searched products
        
        Reusables reusables = new Reusables(driver);
        
        reusables.orderFirstProduct();
        
        //TODO: assert for searched products on cart
        
        homePage.getSignUpLoginBtnTextLink().click();
        
        reusables.login();
        
        homePage.getCartBtnTextLink().click();
        
        //TODO: assert for searched products on cart
    }
    

    @Test(priority = 21, enabled = false)
    public void testCase21() throws InterruptedException {
    	HomePage homePage = new HomePage(driver);
    	
        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        homePage.getProductsBtnTextLink().click();
        
        ProductsPage productsPage = new ProductsPage(driver);
        
        scrollDown(200);
        
        Thread.sleep(1000);
        assertEquals(productsPage.getAllProductsIsVisible().isDisplayed(), true);
        
        scrollDown(200);
        
        productsPage.getFirstProductViewProductsBtn().click();
        
        scrollDown(500);
        
        Thread.sleep(1000);
        assertEquals(productsPage.getWriteYourReviewIsVisible().isDisplayed(), true);
        
        Thread.sleep(1000);
        productsPage.getNameField().sendKeys("test");
        productsPage.getEmailField().sendKeys("test@mail.com");
        productsPage.getReviewField().sendKeys("test review");
        
        productsPage.getSubmitBtn().click();
        
        Thread.sleep(1000);
        assertEquals(productsPage.getThankYouForYourReviewIsVisible().isDisplayed(), true);
        
        
    }
    
    @Test(priority = 22, enabled = false)
    public void testCase22() throws InterruptedException {
    	HomePage homePage = new HomePage(driver);
    	
        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        scrollDown(1000);
        
        Thread.sleep(1000);
        
        assertEquals(homePage.getRecommendedItemsIsVisible().isDisplayed(), true);
        
        homePage.getAddToCartRecommendedProductBtn().click();
        
        Thread.sleep(1000);
        homePage.getViewCart().click();
        
        //TODO: assert on products on cart
        
    }
    
    @Test(priority = 23, enabled = false)
    public void testCase23() throws InterruptedException {
    	HomePage homePage = new HomePage(driver);
    	
        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        homePage.getSignUpLoginBtnTextLink().click();
        
        Reusables reusables = new Reusables(driver);
        
        reusables.registerUser();
        
        reusables.orderFirstProduct();
        
        reusables.checkout();
        
        //TODO: assert registration address
        //TODO: assert billing address
        
        Thread.sleep(1000);
        reusables.deleteAccount();
    	
    }
    
    
    @Test(priority = 24, enabled = false)
    public void testCase24() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        Reusables reusables = new Reusables(driver);
        
        reusables.orderFirstProduct();
        
        reusables.checkOutRegister();
        
        reusables.registerUser();
        
        homePage.getCartBtnTextLink().click();
        
        reusables.checkout();
        
        CartPage cartPage = new CartPage(driver);
        
        Thread.sleep(3000);
        
        cartPage.getDownloadInvoiceBtn().click();
        
        cartPage.getContinueBtn().click();
        
        //TODO: assert for download successful
    
        Thread.sleep(1000);
        
        reusables.deleteAccount();
        
    }
    
    @Test(priority = 25)
    public void testCase25() throws InterruptedException {
    	HomePage homePage = new HomePage(driver);
    	
        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        scrollDown(10000);
        
        Thread.sleep(1000);
        
        assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);
        
        Thread.sleep(1000);
        homePage.getArrowUpBtn().click();
        
        Thread.sleep(3000);
        
        assertEquals(homePage.getFullFledgedPracticeWebsiteForAutomationEngineersIsVisible().isDisplayed(), true);
        
    }
    
    @Test(priority = 26, enabled = false)
    public void testCase26() throws InterruptedException {
    	HomePage homePage = new HomePage(driver);
    	
        //TODO: i need to assert that everything is loaded without any errors
        assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        
        scrollDown(10000);
        
        Thread.sleep(1000);
        
        assertEquals(homePage.getSubscriptionIsVisible().isDisplayed(), true);
        
        scrollDown(10000);
        
        Thread.sleep(4000);
        
        assertEquals(homePage.getFullFledgedPracticeWebsiteForAutomationEngineersIsVisible().isDisplayed(), true);
        
    }
    
    

}
