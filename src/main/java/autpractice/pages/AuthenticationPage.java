package autpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import autpractice.base.TestBase;

public class AuthenticationPage extends TestBase {

	WebDriverWait wait;
	protected WebDriver driver;
	
	//locators for : error login, email input, create account button, valid email
	@FindBy(xpath = "//li[contains(text(), \"Invalid email address.\")]")
	WebElement invalidcreateEmail;
	
	@FindBy(xpath = "//li[contains(text(), \"An account using this email address has already been registered\")]")
	WebElement alreadyExistingEmail;
	
	
	@FindBy(xpath = "//div[@class = \"form-group form-error\"]/input[@id=\"email\"]" )
  	WebElement invalidloginEmail;
	
	@FindBy(id = "email_create")
	WebElement emailCreate;
	
	
	
	@FindBy(xpath = "//div[@class=\"form-group form-error\"]/input[@id=\"email_create\"]") 
	WebElement createEmailRed;
	
	@FindBy(xpath = "//div[@class=\"form-group form-ok\"]/input[@id=\"email_create\"]") 
	WebElement createEmailGreen;
	
	@FindBy(id = "SubmitCreate")
	WebElement createAccount;
	
	
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
	
	
		
	
   public AuthenticationPage(WebDriver webDriver) {
		
		this.driver = webDriver;
		wait  = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	//=============GETS===================
	
   //Create An Account
   public SignupPage enterEmailAddressToCreateAccount(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailCreate)).sendKeys(email);
		wait.until(ExpectedConditions.elementToBeClickable(createAccount)).click();
		return new SignupPage(driver);	
	}
	
//Login
	public void alreadyReisteredLogin(String username, String password) {
		wait.until(ExpectedConditions.visibilityOf(emailAddressField)).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(submitLoginBtn)).click();
		
	}
	
	public WebElement getEmailHighlightedRed() {	
		return wait.until(ExpectedConditions.visibilityOf(createEmailRed));
	}
	
	public WebElement getEmailHighlightedGreen() {
		return wait.until(ExpectedConditions.visibilityOf(createEmailGreen));
	}
}

