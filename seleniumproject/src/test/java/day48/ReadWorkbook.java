package day48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWorkbook {
	
	public static void main(String[] args) throws IOException {
		
		
		//File Path
		String path = System.getProperty("user.dir")+"\\testdata\\loginData.xlsx";
		System.out.println(path);
		
		//Open Excel File
		FileInputStream fis = new FileInputStream(path);
		
		//Create Workbook Object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		System.out.println("Workbook Opened Successfully");
		
		//Lets get the Sheet Name
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println("Sheet Name : "+sheet.getSheetName());
		
		//Get the Row
		XSSFRow row = sheet.getRow(1);
		System.out.println("Row Retrived Successfully");
		
		//Get the Cell
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);
		
		workbook.close();
		fis.close();
	}

}
