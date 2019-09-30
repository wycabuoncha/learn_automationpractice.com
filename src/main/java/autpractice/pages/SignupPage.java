package autpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignupPage  {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public SignupPage(WebDriver webdriver) {
		this.driver = webdriver;
		wait  = new WebDriverWait(driver, 30);
	}
	
	@FindBy(id = "account-creation_form")
	WebElement accountCreationForm;
	
	
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
	
}
