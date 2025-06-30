package TestComponents;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	public ExtentReports extent;
    public ExtentTest test;
    

    public void setUpExtent() {
        String reportPath = "C:\\Users\\turks\\OneDrive\\Desktop\\Eclipse Projects\\SeleniumFramework\\reports\\ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }
    
    
    public void tearDownExtent() {
        extent.flush();
    }

	

}
