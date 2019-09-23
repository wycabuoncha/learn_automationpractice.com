package autopractice.tests;

import org.testng.annotations.Test;

import autpractice.pages.HomePage;
import autpractice.util.DriverManager;
import autpractice.util.DriverManagerFactory;
import autpractice.util.DriverType;
import autpractice.util.PropertyManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HomepageTest {
	DriverManager driverManager;
    WebDriver driver;
    HomePage home;

    
    @Test
    public void launchApplication() {
        driver.get(PropertyManager.getInstance().getUrl());
        home = new HomePage(driver);
        home.getclickSignInLink().click();    
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

  @BeforeTest
  public void beforeTest() {
	  driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
