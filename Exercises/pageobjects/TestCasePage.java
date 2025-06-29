package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasePage{

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[1]/div/h2/b")
    WebElement testCasePageIsVisible;

    public TestCasePage(WebDriver driver) {


        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getTestCasePageIsVisible() {
        return testCasePageIsVisible;
    }
}
