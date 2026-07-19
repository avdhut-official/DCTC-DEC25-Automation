package day48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWorkbook3 {
	
	public static void main(String[] args) throws IOException {
		
		
		//File Path
		String path = System.getProperty("user.dir")+"\\testdata\\miscellaneousData.xlsx";
		System.out.println(path);
		
		//Open Excel File
		FileInputStream fis = new FileInputStream(path);
		
		//Create Workbook Object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		System.out.println("Workbook Opened Successfully");
		
		//Lets get the Sheet Name
		XSSFSheet sheet = workbook.getSheet("Sheet1");
						
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
			
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		fis.close();
	}

}
