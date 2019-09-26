package autopractice.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import autpractice.pages.HomePage;
import autpractice.util.DriverManager;
import autpractice.util.DriverManagerFactory;
import autpractice.util.DriverType;

public class BaseTest {
	DriverManager driverManager;
    WebDriver driver;
    HomePage home;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentReports extentReports = new ExtentReports();
    ExtentTest test;
    
    public void ExtendReportingManager(String reportName, String title, String description) {
    	extentHtmlReporter  = new ExtentHtmlReporter("./ExtentReports/" + reportName);
    	extentReports.attachReporter(extentHtmlReporter);
    	test = extentReports.createTest(title, description);
	}
    
   
    
  
    
    @BeforeTest
    public void beforeTest() {
  	  driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @AfterTest
    public void afterTest() {
    }
    
    @BeforeMethod
    public void beforeMethod() {
  	 
    }

    @AfterMethod
    public void afterMethod() {
  	 
    }
    
    @BeforeClass
    public void beforeClass() {
    	 driver = driverManager.getDriver();
    }

    @AfterClass
    public void afterClass() {
    	 driverManager.quitDriver();
    }

    
    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }



}
