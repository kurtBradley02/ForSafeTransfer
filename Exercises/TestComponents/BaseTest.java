package TestComponents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseTest {

	public WebDriver driver;
	public JavascriptExecutor js;

	@BeforeTest
	public void initializeDriver(){
//		WebDriverManager.safaridriver().setup();
//		driver = new SafariDriver();
		
        // Configure ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Preferences for downloads
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("download.default_directory", "C:\\your\\download\\path"); // change path if needed
        prefs.put("download.shelf.enabled", false);

        // Block notifications (optional but often helps)
        prefs.put("profile.default_content_setting_values.notifications", 2);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

		
		driver.get("https://automationexercise.com");
		js = (JavascriptExecutor) driver;
	}

	//TODO: Scroll
	public void scrollDown(Integer distance){
		js.executeScript("window.scrollBy(0,"+distance.toString()+")");
	}

	public void scrollUp(Integer distance){
		distance = distance * -1;
		js.executeScript("window.scrollBy(0,"+distance.toString()+")");
	}

	//TODO: Select
	Select sel;
	public Select dropdown(WebElement elem){
		sel = new Select(elem);
		return sel;
	}

	//TODO: Alert
	Alert alert;
	public void alertOkAccept(){
		alert = driver.switchTo().alert();
		alert.accept();
	}

	//TODO: Actions
	Actions action;
	public void hover(WebElement elem){
		action = new Actions(driver);
		action.moveToElement(elem).perform();
	}


	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();
	}

}
