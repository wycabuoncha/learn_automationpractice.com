package autopractice.tests.userAuthentication;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import autopractice.tests.BaseTest;


public class LoginpageTest extends BaseTest  {
		
		@Test
		@Parameters({ "correctUsername", "correctPassword" })
		public void loginWithValidPassword(String username, String password) {
			ExtendReportingManager("LoginPageTest.html", "LOGIN REPORT","LOGIN description");
			 home.clickLoginLink();
			 authenticationPage.alreadyReisteredLogin(username, password);
			extentReports.flush();
		}
		
		
		// loginUsingInvalidEmailFormat()
		// loginUsingUnregisteredEmail()
		//loginUsingInvalidPassword()
		//resetPassword()
		//loginUsingValidData()
		
	}


