package autopractice.tests.userAuthentication;

import org.testng.Assert;
import org.testng.annotations.Test;

import autopractice.tests.BaseTest;



public class SignuppageTest extends BaseTest {

	////Open the authentication page contain sign in and sign up form
	
	@Test (priority = 1)
	public void openAuthenticationPage() {
		home.clickLoginLink();
	}
	
	
	@Test(priority = 2)
	public void signupWithValidRegisteredEmailAddress() {
		authenticationPage.enterEmailAddressToCreateAccount("onchari@myspace.com");
		Assert.assertEquals(signupPage.getPageTitle(), "Login - My Store");
	}
	
	@Test(priority = 3)
	public void  fillInPersonalInfoFields() {
		//Title
		
		//First name
		//Last name
		//email address
		//Date of Birth
		//Sign up for our newsletter!
		//Receive special offers from our partners!
		
		//ADDRESS
		//First name *
		//Last name *
		//Company
		//Address *
		//Address (Line 2)
		//City *
		//State *
		//Zip/Postal Code *

		//Country *
		//Additional information
		//Home phone
		//Mobile phone *
		// Assign an address alias for future reference. *
	}
	
	
	//@Test(priority = 2)
	public void regUsingInvalidEmailFormat() {
		System.out.println("");
		//authenticationPage.enterEmailAddressToCreateAccount("onchari@myspace.com");
	}
	
	//@Test(priority = 2)
	public void signupUsingValidUnregisteredEmail() {
		System.out.println("WHOOOPS");
	}
	//regUsingValidEmail
	
	//registerWithBlankInput
	//backToHomepage
}
