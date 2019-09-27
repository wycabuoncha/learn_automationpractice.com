package autpractice.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	//relativePathString + "/excel/
	public ExcelUtil(String excelPathString , String sheetName) {
		try {

			workbook = new XSSFWorkbook(excelPathString);
			sheet = workbook.getSheet(sheetName);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static int  getRowCount() {
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();	
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return rowCount;	
	}
	
	public static int  getColumnCount() {	
		int colCount = 0;
		
		try {
		  colCount = sheet.getRow(0).getPhysicalNumberOfCells();	
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		return colCount;
	}
	
	
	
	public static String getCellDataString(int rowNo, int columnNo) {
		
		   String cellData = null;
		   try {
			   cellData = sheet.getRow(rowNo).getCell(columnNo).getStringCellValue();
		} catch (Exception e) {
			// TODO: handle exception
		}
		   return cellData;
		   
		   
		
	}
	
	
	public static double getCellDataNumeric(int rowNo, int columnNo) {	
		   double cellData = 0; 
		   try {
			  cellData =  sheet.getRow(rowNo).getCell(columnNo).getNumericCellValue();
		} catch (Exception e) {
			// TODO: handle exception
		}
		   return cellData;

  }
}
