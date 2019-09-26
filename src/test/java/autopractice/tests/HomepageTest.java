package autopractice.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import autpractice.pages.HomePage;
import autpractice.util.PropertyManager;


public class HomepageTest extends BaseTest {
	
     
    @Test(priority=1)
    public void launchApplication() {
    	ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("./ExtentReports/homepageTest.html");
    	
    	ExtentReports extentReports = new ExtentReports();
    	extentReports.attachReporter(extentHtmlReporter);
    	
    	ExtentTest test = extentReports.createTest("Home page Test", "This test is meant to test all the functionality in the homepage");
    	
    	test.log(Status.INFO, "Opening the application Url");
        driver.get(PropertyManager.getInstance().getUrl());
        
        test.pass("Successfully opened the AUT url");
        
        home = new HomePage(driver);
        try {
			test.addScreenCaptureFromPath("screenshot.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        test.log(Status.INFO, "Clicking Signin button");
        
        
        home.clickLoginLink();  
        
        extentReports.flush();
    }

  
}
