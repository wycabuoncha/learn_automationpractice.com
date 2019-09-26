package autopractice.tests;
import org.testng.annotations.Test;
public class HomepageTest extends BaseTest {
	
    @Test(priority=1)
    public void launchApplication() {
    	
    	ExtendReportingManager("HomePageTestReport.html", "HOMEPAGE REPORT","my description");
    	
    
        home.clickLoginLink();  
        
        extentReports.flush();
    }

  
}
