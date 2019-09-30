package autpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	WebDriver driver;
	
	 private WebDriverWait wait;
	@FindBy(xpath = "//a[@class=\"login\"]")
	WebElement loginLink;
	
	
	public HomePage(WebDriver webdriver) {
		this.driver = webdriver;	
		 wait = new WebDriverWait(driver, 5);
		PageFactory.initElements(driver, this);
	}
	

	public AuthenticationPage clickLoginLink() {
		wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
		return new AuthenticationPage(driver);
	}
    
   
   

}
