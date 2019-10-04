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
		authenticationPage.enterEmailAddressToCreateAccount("onchabri@myspace.com");
		Assert.assertEquals(signupPage.getPageTitle(), "Login - My Store");
		
		
	}
	
	
	@Test(priority = 3)
	public void signupForm()  throws InterruptedException {
		signupPage.getMr().click();
		
		  signupPage.getFirstName().sendKeys("Onchari");
		  signupPage.getLastName().sendKeys("Wycliffe");
		  signupPage.getEmailAddres().sendKeys("onchari@gmail.com");
		  signupPage.getPassword().sendKeys("434983504960fdsfdg3er");
		
		 signupPage.selectCustomerDateOfBirthDay();
		 /* signupPage.setCustomerMonthOfBirthDay("4");
		 * signupPage.setCustomerYearOfBirthDay("2000");
		 */
		 
		  /* signupPage.getNewsLetter().click(); signupPage.specialOffer().click();
		 * signupPage.getfirstname().sendKeys("Onchari");
		 * signupPage.getlastname().sendKeys("Wycliffe");
		 * signupPage.getCompany().sendKeys("Oxfatech Technologies Ltd");
		 * signupPage.getAddress1().sendKeys("Cellulant West End Towers");
		 * signupPage.getAddress2().sendKeys("Nagi Palza, 2nd floor suit 5");
		 * signupPage.getCity().sendKeys("Nairobi"); signupPage.selectState("8");
		 * signupPage.getPostCode().sendKeys("45657678"); signupPage.setCountry();
		 * signupPage.getOther().
		 * sendKeys("Please deliver the items to my second address if you get my phone number is switched off"
		 * ); signupPage.getHomePhone().sendKeys("07102344456");
		 * signupPage.getMobilePhone().sendKeys("0710725442");
		 * signupPage.getAlias().sendKeys("The home of champions");
		 */
		
		//Thread.sleep(20000);
		
	}
	
	
	
}
