package autopractice.tests;

import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewBaseTest {

	private static final int BROWSER = 1;
	private static final String WEB_SERVER = "http://automationpractice.com/index.php";
	private boolean REMOTE_DRIVER = false;
	private WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUpWebDriver() {
		if (REMOTE_DRIVER) {
			setupRemoteDriver();
		} else {
			setupLocalDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	private void setupLocalDriver() {
		switch (BROWSER) {
		case 1:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			throw new RuntimeException("Browser type unsupported");
		}

	}

	//To be implemented
	private void setupRemoteDriver() {
		// TODO Auto-generated method stub

	}

	@BeforeMethod(alwaysRun = true)
	public void loadWebApplication() {
		driver.get(WEB_SERVER);
	}

	@AfterMethod(alwaysRun = true)
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass(alwaysRun =true)
	public void suiteTearDown() {
		driver.quit();
	}

}
