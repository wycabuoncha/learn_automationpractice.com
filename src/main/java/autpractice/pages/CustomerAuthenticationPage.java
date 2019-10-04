package autpractice.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import autpractice.base.BasePage;

public class CustomerAuthenticationPage extends BasePage {

	By createForm = By.id("create-account_form");
	By loginForm  = By.id("login_form");
	
	public CustomerAuthenticationPage(WebDriver webDriver) {
		super(webDriver);	
	}

	@Override
	protected By getUniqueElement() {
		return createForm;
	}
	
	public Boolean verifyAuthenticationPageIsDisplayed() {
	 List<WebElement> logiform = driver.findElements(loginForm);
	 return logiform.size() > 0;
	}

}
