package autpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriverWait wait;
	WebDriver driver;
	
	//element locators of the web elements on this page
	@FindBy(xpath = "//form[@id=\"login_form\"]") 	
	WebElement loginForm;
	
	@FindBy(id = "email") 	
	WebElement emailAddressField;
	
	@FindBy(id ="passwd" ) 
	WebElement passwordField;
	
	@FindBy(id = "SubmitLogin") 
	WebElement submitLoginBtn;
	
	@FindBy(xpath = "//a[contains(text(), \"Forgot your password?\")]") 
	WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//div[@class = \"form-group form-ok\"]/input[@id=\"email\"]")
	WebElement isvalidEmail;
	
	@FindBy(xpath = "//div[@class = \"form-group form-error\"]/input[@id=\"email\"]" )
  	WebElement isInvalidEmail;
	
	@FindBy(xpath = "//li[contains(text(), \"An email address required.\")]" )
	WebElement emailAddressRequired;
	
	@FindBy(xpath = "//li[contains(text(),\"Invalid email address.\")]")
	WebElement invalidEmailAddress;	
	
	@FindBy(xpath = "//li[contains(text(), \"Password is required.\")]")
	WebElement passwordIsRequired;
	
	@FindBy(xpath =  "//li[contains(text(), \"Invalid password.\")]")
	WebElement invalidPassword;
	
	@FindBy(xpath = "//li[contains(text(),\"Authentication failed.\")]")
	WebElement authenticationError;	
		
	
	public LoginPage(WebDriver webDriver) {		
		this.driver = webDriver;
		wait  = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	//=============GETS===================
	
	
	
	//are all fields displayed
	public void login(String username, String password) {
		wait.until(ExpectedConditions.visibilityOf(emailAddressField)).sendKeys(username);
		//emailAddressField.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
		
		wait.until(ExpectedConditions.elementToBeClickable(submitLoginBtn)).click();
		//submitLoginBtn.click();
	}

}
