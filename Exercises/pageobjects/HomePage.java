package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homeBtnTextLink;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")
    WebElement viewProduct;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
    WebElement viewCart;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")
    WebElement addToCart;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/a")
    WebElement addToCart2;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/p")
    WebElement firstProduct;

    @FindBy(xpath = "//*[@id=\"Men\"]/div/ul/li[1]/a")
    WebElement secondProduct;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement signUpLoginBtnTextLink;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")
    WebElement contactUsBtnTextLink;

    @FindBy(xpath = "a")
    WebElement testCaseBtnTextLink;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement productsBtnTextLink;

    //TODO: Scroll down to footer

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")
    WebElement subscriptionIsVisible;

    @FindBy(xpath = "//*[@id=\"susbscribe_email\"]")
    WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"subscribe\"]/i")
    WebElement arrowBtn;

    @FindBy(xpath = "//*[@id=\"success-subscribe\"]/div")
    WebElement youHaveBeenSuccessfullySubscribedIsVisible;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement cartBtnTextLink;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[2]/h2")
    WebElement recommendedItemsIsVisible;

    @FindBy(xpath = "a")
    WebElement recommendedAddToCartBtn;

    @FindBy(xpath = "a")
    WebElement viewCartBtnTextLink;

    @FindBy(xpath = "//*[@id=\"scrollUp\"]/i\n")
    WebElement arrowUpBtn;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/h2")
    WebElement categoryIsVisible;

    @FindBy(xpath = "//*[@id='accordian']/div[1]/div[1]/h4/a")
    WebElement womenCategoryBtn;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[2]/a")
    WebElement womenTopsCategoryBtn;
    
    @FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")
    WebElement addToCartRecommendedProductBtn;
    
    @FindBy(xpath = "//*[@id=\"slider-carousel\"]/div/div[2]/div[1]/h2")
    WebElement fullFledgedPracticeWebsiteForAutomationEngineersIsVisible;
    
    public WebElement getAddToCartRecommendedProductBtn() {
        return addToCartRecommendedProductBtn;
    }

    public WebElement getWomenTopsCategoryBtn() {
        return womenTopsCategoryBtn;
    }

    public WebElement getCategoryIsVisible() {
        return categoryIsVisible;
    }

    public WebElement getWomenCategoryBtn() {
        return womenCategoryBtn;
    }

    public WebElement getHomeBtnTextLink() {
        return homeBtnTextLink;
    }

    public WebElement getSignUpLoginBtnTextLink() {
        return signUpLoginBtnTextLink;
    }

    public WebElement getViewProduct() {
        return viewProduct;
    }

    public WebElement getContactUsBtnTextLink() {
        return contactUsBtnTextLink;
    }

    public WebElement getTestCaseBtnTextLink() {
        return testCaseBtnTextLink;
    }

    public WebElement getProductsBtnTextLink() {
        return productsBtnTextLink;
    }

    public WebElement getSubscriptionIsVisible() {
        return subscriptionIsVisible;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public WebElement getArrowBtn() {
        return arrowBtn;
    }

    public WebElement getYouHaveBeenSuccessfullySubscribedIsVisible() {
        return youHaveBeenSuccessfullySubscribedIsVisible;
    }

    public WebElement getCartBtnTextLink() {
        return cartBtnTextLink;
    }

    public WebElement getRecommendedItemsIsVisible() {
        return recommendedItemsIsVisible;
    }

    public WebElement getRecommendedAddToCartBtn() {
        return recommendedAddToCartBtn;
    }

    public WebElement getViewCartBtnTextLink() {
        return viewCartBtnTextLink;
    }

    public WebElement getArrowUpBtn() {
        return arrowUpBtn;
    }

    public WebElement getFullFledgedPracticeWebsiteForAutomationEngineersIsVisible() {
        return fullFledgedPracticeWebsiteForAutomationEngineersIsVisible;
    }



    public WebElement getFirstProduct() {
        return firstProduct;
    }

    public WebElement getViewCart() {
        return viewCart;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getSecondProduct() {
        return secondProduct;
    }

    public WebElement getAddToCart2() {
        return addToCart2;
    }

    public WebElement getContinueShopping() {
        return continueShopping;
    }


    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
