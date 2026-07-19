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

public class LoginMultipleUsers2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Excel Path
		String path = System.getProperty("user.dir")+"\\testdata\\loginData.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		DataFormatter formatter = new DataFormatter();
		
		int rows = sheet.getLastRowNum();
		
		for(int r=1;r<=rows; r++)
		{
			String username = formatter.formatCellValue(sheet.getRow(r).getCell(0));
			String password = formatter.formatCellValue(sheet.getRow(r).getCell(1));
			
			System.out.println("--------------------------------------------------");
			System.out.println("Executing For : "+username);
			
			//Launch Browser
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name")).sendKeys(username);
			
			driver.findElement(By.id("password")).sendKeys(password);
			
			driver.findElement(By.id("login-button")).click();
			
			Thread.sleep(3000);
			
			String actualResult="";
			
			//Login Validation
			
			if(driver.getCurrentUrl().contains("inventory"))
			{
				actualResult="PASS";
			}
			else
			{
				actualResult="FAIL";
			}
			
			System.out.println(username+"--->"+actualResult);
			System.out.println("Login Attempt Completed");
			
			driver.quit();
			
		}
		
		workbook.close();
		fis.close();
	}

}
