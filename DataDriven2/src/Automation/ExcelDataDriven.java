package Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataDriven {
	
	DataFormatter formatter = new DataFormatter();
	
	@Test(dataProvider="getData")
	public void print_data(String username,String password) {
		
		System.out.println(username+" "+password);
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Gopi\\Desktop\\LoginDatas.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[rowCount-1][columnCount];
		
		for(int i=0;i<rowCount-1;i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		} return data;
		
	}

}
