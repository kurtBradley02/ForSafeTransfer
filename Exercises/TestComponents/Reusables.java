package TestComponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.CartPage;
import pageobjects.HomePage;
import pageobjects.LoginSignUpPage;

import static org.testng.AssertJUnit.assertEquals;

public class Reusables extends BaseTest{

    WebDriver driver;
    JavascriptExecutor js;
    public Reusables(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public void scrollDown(Integer distance){
        js.executeScript("window.scrollBy(0,"+distance.toString()+")");
    }

    public void hover(WebElement elem){
        action = new Actions(driver);
        action.moveToElement(elem).perform();
    }

    public void login() throws InterruptedException {
        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);

        loginSignUpPage.getLoginEmailAddressField().sendKeys("randomtestdata@mail.com");
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

    public void registerUser() throws InterruptedException {

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(1000);
        loginSignUpPage.getNameField().sendKeys("test");
        loginSignUpPage.getEmailAddressField().sendKeys("randomtestdata@mail.com");
        loginSignUpPage.getSignUpBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getEnterAccountInformationIsVisible().isDisplayed(), true);

        loginSignUpPage.getTitleMrFieldChkBox().click();
        loginSignUpPage.getName2Field().sendKeys("test");
        loginSignUpPage.getPasswordField().sendKeys("test1234");

        this.scrollDown(500);

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

        Thread.sleep(1000);
        cartPage.getNameOnCardField().sendKeys("test");
        cartPage.getCardNumberField().sendKeys("1234");
        cartPage.getCvcField().sendKeys("123");
        cartPage.getExpirationDateMonthField().sendKeys("01");
        cartPage.getExpirationDateYearField().sendKeys("1234");
        cartPage.getPayAndConfirmBtn().click();

        //assertEquals(cartPage.getReviewYourOrderIsVisible().isDisplayed(), true);
    }

    public void deleteAccount() throws InterruptedException{

        LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        Thread.sleep(5000);
        loginSignUpPage.getDeleteBtn().click();

        Thread.sleep(1000);
        assertEquals(loginSignUpPage.getAccountDeletedIsVisible().isDisplayed(), true);

        loginSignUpPage.getContinueBtn().click();
    }
}
