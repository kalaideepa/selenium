package Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FromExcel {

	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider="getData")

	public void print(String username,String password) {

		/* System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click(); */

		System.out.println(username+" "+password);


	}



	@DataProvider
	public Object[][] getData() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Gopi\\Desktop\\LoginDatas.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int coulmnCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount-1][coulmnCount];

		for(int i=0;i<rowCount-1;i++) {
			XSSFRow row = sheet.getRow(i+1);

			for(int j=0;j<coulmnCount;j++) {

				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}

		} return data; 


	}  


}
