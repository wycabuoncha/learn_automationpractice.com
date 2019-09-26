package autopractice.tests;

import org.testng.annotations.Test;

import autpractice.pages.HomePage;
import autpractice.util.PropertyManager;

public class LoginpageTest extends BaseTest  {
	
			
	
		
		@Test
		public void loginWithValidPassword() {
			ExtendReportingManager("LoginPageTest.html", "LOGIN REPORT","LOGIN description");
			 home.clickLoginLink();
			loginPage.login("test1@automationpractice.com", "28328719@Aut?!");
			extentReports.flush();
		}
	}


