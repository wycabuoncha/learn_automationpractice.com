package autpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import autpractice.base.BasePage;

public class CustomerRegistrationPage extends BasePage {

@FindBy(id = "id_gender1") 	WebElement mrTitle;
	
	@FindBy(id = "id_gender2") 	WebElement mrsTitle;
	
	@FindBy(id="customer_firstname") WebElement customerFirstname;
	
	@FindBy(id = "customer_lastname") WebElement customerLastname;
	
	public CustomerRegistrationPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	
	//Getters
	public WebElement getFirstName() {
		return customerFirstname;
	}


	@Override
	protected By getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

