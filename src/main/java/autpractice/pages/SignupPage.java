package autpractice.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import autpractice.util.Utils;


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
	
	@FindBy(id = "days") WebElement birthDay;
	
	@FindBy(id = "months") WebElement birthMonth;
	
	@FindBy(id = "years") WebElement birthYear;
	
	@FindBy(xpath = "//input[@id =\"newsletter\"]" ) WebElement newsletter;
	
	@FindBy(xpath = "//input[@id =\"optin\"]") WebElement specialOffer;
	
	@FindBy(id = "firstname") WebElement firstname;
	
	@FindBy(id = "lastname") WebElement lastname;
	
	@FindBy(id = "company") WebElement company;
	
	@FindBy(id = "address1") WebElement address1;
	
	@FindBy(id = "address2") WebElement address2;
	
	@FindBy(id = "city") WebElement city;
	
	@FindBy(xpath ="//select[@id =\"id_state\"]" ) WebElement state;
	
	@FindBy(id = "postcode") WebElement postcode;
	
	@FindBy(xpath = "//select[@id= \"id_country\"]/option[@value =\"21\"]") WebElement country;
	
	@FindBy(id="other") WebElement other;
	
	@FindBy(id = "phone") WebElement homePhone;
	
	@FindBy(id = "phone_mobile") WebElement mobilePhone;
	
	@FindBy(id = "submitAccount") WebElement submitAccount;
	

	@FindBy(id ="alias") WebElement alias;
	
	
	public SignupPage(WebDriver webdriver) {
		this.driver = webdriver;
		wait  = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
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
	
	public WebElement isElementVisible(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
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
	
	

	
	public WebElement getNewsLetter() {
		return isElementVisible(newsletter);
	}
	
	public WebElement specialOffer() {
		return isElementVisible(specialOffer);
	}
	
	public WebElement getlastname() {
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
	
	public Select selectState() {
		WebElement element = isElementVisible(state);
		return new Select(element);
	}
	
	
	
	public WebElement getPostCode() {
		return isElementVisible(postcode);
	}
	
	
	
	public WebElement getHomePhone() {
		return isElementVisible(homePhone);
	}
	
	public WebElement getMobilePhone() {
		return isElementVisible(mobilePhone);
	}
	
	public WebElement getOther() {
		return isElementVisible(other);
	}
	
	public WebElement getAlias() {
		return isElementVisible(alias);
	}
	
	public WebElement getSubmitButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(submitAccount));
	}
	
	// -------SETTERS
	
	//DATE OF BIRTH 
	public void selectCustomerDateOfBirthDay()
	{	
		WebElement element = wait.until(ExpectedConditions.visibilityOf(birthDay));
		Select select = new Select(element);
		select.selectByValue("12");
	      
	}

	/*
	 * public Select selectCustomerMonthOfBirth() { return new
	 * Select(Utils.waitForElementPresence(driver,birthMonth,30)); } public Select
	 * selectCustomerDateOfBirthYear() { return new
	 * Select(Utils.waitForElementPresence(driver,birthYear,30)); }
	 */
	
	

	    public void selectState(String state) {
	        Select selectState = this.selectState();
	        selectState.selectByValue(state);
	    }
	
	public void setCountry() {
		WebElement element = isElementVisible(country);
		if(isElementAlreadySelected(element)) {
			System.out.println("United States is already selected");
		}
		
	}
	
	public boolean isElementAlreadySelected(WebElement element) {
		boolean selected = false;
		if(element.isSelected()) {
		 selected = true;
		}
		return selected;
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
