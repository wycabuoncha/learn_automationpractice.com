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

import autpractice.pages.HomePage;
import autpractice.util.DriverManager;
import autpractice.util.DriverManagerFactory;
import autpractice.util.DriverType;

public class BaseTest {
	DriverManager driverManager;
    WebDriver driver;
    HomePage home;
    @BeforeTest
    public void beforeTest() {
  	  driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @AfterTest
    public void afterTest() {
    }
    
    @BeforeMethod
    public void beforeMethod() {
  	  driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
  	  driverManager.quitDriver();
    }
    
    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    
    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }



}
