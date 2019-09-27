package autopractice.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginpageTest extends BaseTest  {
		
		@Test
		@Parameters({ "correctUsername", "correctPassword" })
		public void loginWithValidPassword(String username, String password) {
			ExtendReportingManager("LoginPageTest.html", "LOGIN REPORT","LOGIN description");
			 home.clickLoginLink();
			loginPage.login(username, password);
			extentReports.flush();
		}
	}


