package autpractice.util;

public class DriverManagerFactory {

 static DriverManager driverManager;
 
 public static DriverManager getManager(DriverType type) {
	
	 switch(type) {
	 case CHROME:
		 driverManager  = new ChromeDriverManager();
		 break;
		 
     default:
    	 driverManager  = new ChromeDriverManager();
		 break;
	 }
	 
	 
	
	 
	 return driverManager;
	 
 }
}
