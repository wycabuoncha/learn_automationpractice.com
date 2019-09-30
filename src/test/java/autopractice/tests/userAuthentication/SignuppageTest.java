package autopractice.tests.userAuthentication;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import autopractice.tests.BaseTest;
import autpractice.pages.SignupPage;



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
