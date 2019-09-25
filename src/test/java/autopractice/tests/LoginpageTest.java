package autopractice.tests;

import org.testng.annotations.Test;

import autpractice.pages.HomePage;
import autpractice.util.PropertyManager;

public class LoginpageTest extends BaseTest  {
	
	
		
		@Test(priority=1, alwaysRun=true)
	    public void launchApplication() {
	        driver.get(PropertyManager.getInstance().getUrl());
	        home = new HomePage(driver);
	       
	    }
		
		@Test(priority = 2)
		public void loginWithValidPassword() {
			
		}
	}


