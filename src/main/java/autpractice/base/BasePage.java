package autpractice.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public abstract class BasePage {
	protected WebDriver driver; 
	protected WebDriverWait wait;	
	
	public BasePage(WebDriver webDriver)
		{
	       this.driver = webDriver;
			this.wait = new WebDriverWait(driver, 30);
			isLoaded();
		}
	
	/* Each page object must implement this method to return the identifier of a unique WebElement on that page.
	 The presence of this unique element will be used to assert that the expected page has finished loading 
	 https://github.com/iainrose/page-objects/blob/master/src/main/java/AbstractPageObject.java */
	
	protected abstract By getUniqueElement();
	
	protected void isLoaded() {
		//List of web elements that match the unique element locator for the page
		List<WebElement> uniqueElements = driver.findElements(getUniqueElement());
		
		Assert.assertTrue((uniqueElements.size() > 0), "Unique Element " + getUniqueElement().toString() + "Not found for " + this.getClass().getSimpleName());
		
		//wait until the unique element is visible in the browser and ready to use. This helps to make sure that the page is loaded
		// before the next step of the tests continue
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getUniqueElement()));
	}

}
