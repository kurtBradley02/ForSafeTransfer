package com.myproject.util;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.myproject.pageobjects.HomePage;

public class BaseTest {

	public ExtentReportNG reporter;
	public ITestResult result;

	public WebDriver driver;
	public JavascriptExecutor js;

	public HomePage homePage;
	public StandAloneTests standAloneTests;


	@BeforeClass
	public void initDriver(){
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		standAloneTests = new StandAloneTests(driver);
		homePage = new HomePage(driver);
	}

	@AfterClass
	public void endSuite() throws InterruptedException {
		driver.quit();
	}
	

	@BeforeMethod
	public void initReporter(ITestResult result){
		reporter = new ExtentReportNG();
		reporter.setUpExtent(result.getMethod().getMethodName());
	}
	
	@AfterMethod
	public void logTestStatus(ITestResult result) throws InterruptedException {
		reporter.test = reporter.extent.createTest(result.getMethod().getMethodName());

		if(result.getStatus() == ITestResult.SUCCESS){
			reporter.test.pass("Test Passed");
		}else if(result.getStatus() == ITestResult.FAILURE){
			reporter.test.fail("Test Failed: "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			reporter.test.skip("Test Skipped"+result.getThrowable());
		}
		
		reporter.tearDownExtent();
		driver.close();

	}
	

	public void scrollDown(Integer distance) throws InterruptedException {
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,"+distance.toString()+")");
	}

	public void scrollUp(Integer distance){
		distance = distance * -1;
		js.executeScript("window.scrollBy(0,"+distance.toString()+")");
	}

	Select sel;
	public Select dropdown(WebElement elem){
		sel = new Select(elem);
		return sel;
	}

	Alert alert;
	public void alertOkAccept(){
		alert = driver.switchTo().alert();
		alert.accept();
	}

	Actions action;
	public void hover(WebElement elem){
		action = new Actions(driver);
		action.moveToElement(elem).perform();
	}
}
