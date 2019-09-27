package autpractice.util;

public class ExcelUtilsDemo {

	
	
	public static void main(String[] args) {
		String relativePathString  = System.getProperty("user.dir");
		ExcelUtil excelUtil = new ExcelUtil(relativePathString + "/excel/data.xlsx", "Sheet1");	
		double d=  ExcelUtil.getCellDataNumeric(2, 1);
		System.out.println(d);
		
		
		System.out.println(ExcelUtil.getCellDataString(1, 1));
	}
}
