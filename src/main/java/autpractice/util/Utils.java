package autpractice.util;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	

	public static WebElement waitToBeClickable(WebDriver driver, By selector, int waitInterval) {
        return  (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.elementToBeClickable(selector));

    }
	
    public static WebElement waitForElementPresence(WebDriver driver, By selector, int waitInterval) {
        return  (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.presenceOfElementLocated(selector));

    }
    
    public static void waitForTitle(WebDriver webDriver, int timeOutInSeconds, String text) {
		WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
		wait.until(ExpectedConditions.titleContains(text));
	}
    
    
    public static String getSaltString(int emailValidity) {

        String generatedEmail ="";
       switch (emailValidity){
           case 1:
               String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
               StringBuilder salt = new StringBuilder();
               Random rnd = new Random();
               while (salt.length() < 10) { // length of the random string.
                   int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                   salt.append(SALTCHARS.charAt(index));
               }
               generatedEmail = salt.toString();

               break;
       }

       return generatedEmail;
   }
    
    
    private enum ElementStatus{
        VISIBLE,
        NOTVISIBLE,
        ENABLED,
        NOTENABLED,
        PRESENT,
        NOTPRESENT
    }
    
    ///https://stackoverflow.com/questions/14156656/how-to-verify-element-present-or-visible-in-selenium-2-selenium-webdriver
    private ElementStatus isElementVisible(WebDriver driver, By by,ElementStatus getStatus){
        try{
            if(getStatus.equals(ElementStatus.ENABLED)){
                if(driver.findElement(by).isEnabled())
                    return ElementStatus.ENABLED;
                return ElementStatus.NOTENABLED; 
            }
            if(getStatus.equals(ElementStatus.VISIBLE)){
                if(driver.findElement(by).isDisplayed())
                    return ElementStatus.VISIBLE;
                return ElementStatus.NOTVISIBLE;
            }
            return ElementStatus.PRESENT;
        }catch(org.openqa.selenium.NoSuchElementException nse){
            return ElementStatus.NOTPRESENT;
        }
    }
   
    
	
}
