package autpractice.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignupPage  {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(id = "account-creation_form") WebElement accountCreationForm;	
	
	@FindBy(id = "id_gender1") 	WebElement mrTitle;
	
	@FindBy(id = "id_gender2") 	WebElement mrsTitle;
	
	@FindBy(id="customer_firstname") WebElement customerFirstname;
	
	@FindBy(id = "customer_lastname") WebElement customerLastname;
	
	@FindBy(id = "email") 	WebElement email;
	
	@FindBy(id = "passwd") 	WebElement password;
	
	@FindBy(id = "firstname") WebElement firstname;
	
	@FindBy(id = "lastname") WebElement lastname;
	
	@FindBy(id = "company") WebElement company;
	
	@FindBy(id = "address1") WebElement address1;
	
	@FindBy(id = "address2") WebElement address2;
	
	@FindBy(id = "city") WebElement city;
	
	@FindBy(id = "postcode") WebElement postcode;
	
	@FindBy(id="other") WebElement other;
	
	@FindBy(id = "phone") WebElement phone;
	
	@FindBy(id = "phone_mobile") WebElement phoneMobile;
	
	@FindBy(id = "submitAccount") WebElement submitAccount;
	
	@FindBy(id = "days") WebElement birthDay;
	
	@FindBy(id = "months") WebElement birthMonth;
	
	@FindBy(id = "years") WebElement birthYear;
	
	@FindBy(id = "id_state") WebElement state;
	
	@FindBy(id = "id_country") WebElement country;

	
	
	public SignupPage(WebDriver webdriver) {
		this.driver = webdriver;
		wait  = new WebDriverWait(driver, 30);
	}
	
	
	public void test() {
		System.out.println("TEST");
	}
	
	public WebElement getSignupForm() {
		return wait.until(ExpectedConditions.visibilityOf(accountCreationForm));
	}


	public String getUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}


	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	
	
	//-----GETTERS---------------
	public WebElement getMr() {
		 return isElementVisible(mrsTitle);
	 }
	
	public WebElement getMrs() {
		return isElementVisible(mrsTitle);
	}
	
	
	public WebElement getFirstName() {
		return wait.until(ExpectedConditions.visibilityOf(customerFirstname));	
	}
	
	
	public WebElement getLastName() {
		return isElementVisible(customerLastname);
	}
	
	public WebElement	getEmailAddres() {
		return isElementVisible(email);
	}
	
	
	public WebElement getPassword() {
		return isElementVisible(password);
	}
	
	public WebElement lastname() {
		return isElementVisible(lastname);
	}
	
	public WebElement getfirstname() {
		return isElementVisible(lastname);
	}
	
	

	public WebElement getCompany() {
		return  isElementVisible(company);
	}
	
	
	public WebElement getAddress1() {
		return isElementVisible(address1);
	}
	
	public WebElement getAddress2() {
		return isElementVisible(address2);
	}
	
	public WebElement getCity() {
		return isElementVisible(city);
	}
	
	public WebElement isElementVisible(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public WebElement getPostCode() {
		return isElementVisible(postcode);
	}
	
	public WebElement getPhone() {
		return isElementVisible(phone);
	}
	
	public WebElement getPhoneMobile() {
		return isElementVisible(phoneMobile);
	}
	
	public WebElement getOther() {
		return isElementVisible(other);
	}
	
	public WebElement getSubmitButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(submitAccount));
	}
	
	
	
	public void signup() {
		
	}
	
	
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
