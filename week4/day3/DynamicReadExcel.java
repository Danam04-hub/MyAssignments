package week4.day3;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicReadExcel {
	public static String[][] readData(String filename) throws IOException {
		//Open the Workbook
	XSSFWorkbook wb = new XSSFWorkbook("./Data/LegalEntity.xlsx");
	//Open the WorkSheet
	XSSFSheet ws = wb.getSheet("Sheet1");
	//To get the number of rows
	int rowCount=ws.getLastRowNum();
	System.out.println("Row Count: "+rowCount);
	//To get the number of columns
	int columnCount = ws.getRow(1).getLastCellNum();
	System.out.println("Column Count: "+columnCount);
	
		//Declare 2D String Array
		String[][] data=new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				                   
				data[i-1][j]=allData;
		
		
	}

}
		wb.close();
		return data;
	}
}


