package autpractice.util;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	
}
