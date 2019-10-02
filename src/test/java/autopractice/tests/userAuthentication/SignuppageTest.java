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
	public void signupWithValidRegisteredEmailAddress() throws InterruptedException {
		authenticationPage.enterEmailAddressToCreateAccount("onchabri@myspace.com");
		Assert.assertEquals(signupPage.getPageTitle(), "Login - My Store");
		
		Thread.sleep(20000);
	}
	
	
	
	
}
