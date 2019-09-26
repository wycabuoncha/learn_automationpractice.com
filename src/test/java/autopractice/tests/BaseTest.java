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
import autpractice.pages.LoginPage;
import autpractice.util.DriverManager;
import autpractice.util.DriverManagerFactory;
import autpractice.util.DriverType;
import autpractice.util.PropertyManager;

public class BaseTest {
	DriverManager driverManager;
    WebDriver driver;
  
    ExtentHtmlReporter extentHtmlReporter;
    ExtentReports extentReports = new ExtentReports();
    ExtentTest test;
    HomePage home;
    LoginPage loginPage; 
   
 
    
    public void ExtendReportingManager(String reportName, String title, String description) {
    	extentHtmlReporter  = new ExtentHtmlReporter("./ExtentReports/" + reportName);
    	extentReports.attachReporter(extentHtmlReporter);
    	test = extentReports.createTest(title, description);
	}
       
    @BeforeTest
    public void beforeTest() {
  	  driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
  	  
    }
    
    
    @BeforeClass
    public void beforeClass() {
    	 driver = driverManager.getDriver();
    	 driver.get(PropertyManager.getInstance().getUrl());
    	 home = new HomePage(driver);
    	 loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void afterClass() {
    	 driverManager.quitDriver();
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
    
 

    
    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }



}
