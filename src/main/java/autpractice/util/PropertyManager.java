package autpractice.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/************************************************************************************************
Description: PropertyManager class reads global configurations and use them during test execution.
https://www.swtestacademy.com/read-configurations-property-file-selenium/
*************************************************************************************************/
public class PropertyManager {
	private static PropertyManager instance;
	private static final Object lock = new Object();
	private static final String propertyFilePath  = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\configurations.properties";
	private static String url;
	private FileInputStream inStream;
	private static String time;
	private static String waitInterval;
	
	
	public static PropertyManager getInstance() {
		if(instance == null) {
			synchronized(lock) {
				instance = new PropertyManager();
				instance.loadData();
			}	
		}
		
		return instance;
	}

	   //Get all configuration data and assign to related fields.
	private void loadData(){
		Properties  prop = new Properties ();
		try {
			 inStream = new FileInputStream(propertyFilePath);
			prop.load(inStream );
		} catch (IOException e) {
			System.out.println("Configuration properties file cannot be found");
		}
		
		
		url = prop.getProperty("url");
		waitInterval = prop.getProperty("wait_interval");
		time = prop.getProperty("implicityWaittime");
		
	}
	
	public String getUrl() {
		return url;
	}
	
	public int getImplicitWaitTime() {
		return Integer.parseInt(time);
	}

	public int getWaitInterval() {
		
		return Integer.parseInt(waitInterval);
	}

	
	
}
