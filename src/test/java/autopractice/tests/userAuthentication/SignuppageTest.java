package autopractice.tests.userAuthentication;

import org.testng.annotations.Test;

import autopractice.tests.BaseTest;



public class SignuppageTest extends BaseTest {

	////Open the authentication page contain sign in and sign up form
	
	@Test (priority = 1)
	public void openAuthenticationPage() {
		home.clickLoginLink();
	}
	
	//@Test(priority = 2)
	public void regUsingInvalidEmailFormat() {
		System.out.println("");
		//authenticationPage.enterEmailAddressToCreateAccount("dddddddd@ffffff.com");
	}
	
	@Test(priority = 2)
	public void signupUsingValidUnregisteredEmail() {
		System.out.println("WHOOOPS");
	}
	//regUsingValidEmail
	
	//registerWithBlankInput
	//backToHomepage
}
