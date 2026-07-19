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
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginMultipleUsers3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Excel Path
		String path = System.getProperty("user.dir")+"\\testdata\\LoginValidation.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		DataFormatter formatter = new DataFormatter();
		
		int rows = sheet.getLastRowNum();
		
		for(int r=1;r<=rows; r++)
		{
			String username = formatter.formatCellValue(sheet.getRow(r).getCell(0));
			String password = formatter.formatCellValue(sheet.getRow(r).getCell(1));
			String expectedResult = formatter.formatCellValue(sheet.getRow(r).getCell(2));
			
			//Launch Browser
			
			ChromeOptions options = new ChromeOptions();
			
			//options.addArguments("--user--data-dir=C:\\AutomationProfile");
			
			options.addArguments("--incognito");
			
			WebDriver driver = new ChromeDriver(options);
			
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
		
			//Compare Results
			if(expectedResult.equalsIgnoreCase(actualResult))
			{
			
				System.out.println("--------------------------------------------------");
				System.out.println("Username : "+username);
				System.out.println("Expected :"+expectedResult);
				System.out.println("Actual :"+expectedResult);
				System.out.println("Status: TEST PASSED");
			}
			else
			{
				System.out.println("--------------------------------------------------");
				System.out.println("Username : "+username);
				System.out.println("Expected :"+expectedResult);
				System.out.println("Actual :"+expectedResult);
				System.out.println("Status: TEST FAILED");
			}
			
			//Logout if Login is Successful
			if(actualResult.equals("PASS"))
			{
				driver.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Logout")).click();
			}
			
			
			driver.quit();
			
		}
		
		workbook.close();
		fis.close();
	}

}
