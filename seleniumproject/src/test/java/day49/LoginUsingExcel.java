package day49;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Excel Path
		String path = System.getProperty("user.dir")+"\\testdata\\loginData.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		DataFormatter formatter = new DataFormatter();
		
		//Read first data row (Row 1)
		String username = formatter.formatCellValue(sheet.getRow(1).getCell(0));
		
		String password = formatter.formatCellValue(sheet.getRow(1).getCell(1));
		
		//Launch Browser
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		workbook.close();
		
		fis.close();
	}

}
