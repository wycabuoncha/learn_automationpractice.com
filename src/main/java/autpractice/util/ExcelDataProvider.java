package autpractice.util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	
	
	public static Object[][] testData(String excelPath , String sheetName) {
		
		
		
		ExcelUtil excelUtil = new ExcelUtil(excelPath, sheetName);
		
		int rowCount = ExcelUtil.getRowCount();
		int columnCount = ExcelUtil.getColumnCount();
		
		Object cellData[][] = new Object[rowCount-1][columnCount];
		
		
		for (int row = 1;  row < rowCount; row++) {
			
			for(int col = 0; col < columnCount; col++) {
				cellData[row-1][col] = ExcelUtil.getCellDataString(row, col);
				System.out.println(cellData);
			}
		}
		return cellData;
	
	}
	
	@DataProvider(name = "test1data")
	public static Object[][] getData() {
		Object dataObject[][] = testData("C:\\Users\\OnchariWycliffe\\git\\learn_automationpractice.com\\excel\\data.xlsx", "Sheet1");
		return dataObject;
	}
	
	@Test(dataProvider ="test1data" )
	public void Test1(String user, String pass) {
		System.out.println(user);
	}
	
	
}
