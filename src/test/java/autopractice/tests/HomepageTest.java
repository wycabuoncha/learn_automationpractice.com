package autopractice.tests;

import org.testng.annotations.Test;
import autpractice.pages.HomePage;
import autpractice.util.PropertyManager;


public class HomepageTest extends BaseTest {
	
   
    
    @Test(priority=1)
    public void launchApplication() {
        driver.get(PropertyManager.getInstance().getUrl());
        home = new HomePage(driver);
        home.clickLoginLink();   
    }
    
  
    
    
 

  
}
