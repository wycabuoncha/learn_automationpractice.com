package autopractice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.WebDriverWait;
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

import autpractice.pages.AuthenticationPage;
import autpractice.pages.HomePage;
import autpractice.pages.LoginPage;
import autpractice.pages.SignupPage;
import autpractice.util.DriverManager;
import autpractice.util.DriverManagerFactory;
import autpractice.util.DriverType;
import autpractice.util.PropertyManager;

public class BaseTest {
	DriverManager driverManager;
    WebDriver driver;
  
    ExtentHtmlReporter extentHtmlReporter;
    protected ExtentReports extentReports = new ExtentReports();
    ExtentTest test;
    protected HomePage home;
    public SignupPage signupPage;
    protected AuthenticationPage authenticationPage;
	private WebDriverWait wait; 
   
 
    
    public void ExtendReportingManager(String reportName, String title, String description) {
    	extentHtmlReporter  = new ExtentHtmlReporter("./ExtentReports/" + reportName);
    	extentReports.attachReporter(extentHtmlReporter);
    	test = extentReports.createTest(title, description);
	}
       
    @BeforeTest
    public void launchBrowser() {
  	  driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
	  	 driver = driverManager.getDriver();
	  	 //driver.manage().timeouts().implicitlyWait(PropertyManager.getInstance().getImplicitWaitTime(), TimeUnit.SECONDS);
		 driver.get(PropertyManager.getInstance().getUrl());
		 driver.manage().window().maximize();

		 home = new HomePage(driver);
		 authenticationPage = new AuthenticationPage(driver);
		 signupPage = new SignupPage(driver);
    }

    @BeforeClass
    public void terminateBrowser() {
    	Object cObject = new Object();
    	String nameString = cObject.getClass().getName();
    	ExtendReportingManager(nameString +".html", nameString + " REPORT","Wmy description");
    	
  
  
        
       
    }

    @AfterClass
    public void afterClass() {
    	
    	 extentReports.flush();
    }

    @AfterTest
    public void afterTest() {
    	 driverManager.quitDriver();
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
