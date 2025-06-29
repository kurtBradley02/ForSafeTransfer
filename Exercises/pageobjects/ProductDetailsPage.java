package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductDetailsPage{

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement quantityField;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }

    public ProductDetailsPage(WebDriver driver) {


        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getQuantityField() {
        return quantityField;
    }
}
