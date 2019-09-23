package autpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import autpractice.util.*;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver webdriver) {
		this.driver = webdriver;
	}
	
	private By bestSellersBy = By.xpath("//a[text()=\"Best Sellers\"]") ;
	private By popularBy  = By.xpath("//a[text()=\"Popular\"]");
	
	
    By signIn = By.linkText("Sign in");
    
    public WebElement getclickSignInLink() {
        return Utils.waitForElementPresence(driver, signIn,  PropertyManager.getInstance().getWaitInterval());
    }
    
   

}
