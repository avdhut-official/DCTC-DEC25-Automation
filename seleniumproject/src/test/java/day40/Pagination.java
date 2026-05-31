package day40;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
		
		
		//For Page Details
		for(int p=1;p<=6;p++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//nav[@aria-label='pagination']//button[text()="+p+"]")).click();
		
			//Display Row Details
			/*
			List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
			
			for(WebElement row : all_rows)
			{
				System.out.println(row.getText());
			}*/
			
			
			//Displayed only Required Details
			List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
			int rows=all_rows.size();
			
			for(int r=1;r<=rows;r++)
			{
				//Name
				System.out.print(driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[1]")).getText());
				
				//Position
				System.out.print("\t"+driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[2]")).getText());
				
				//Office
				System.out.println("\t"+driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[3]")).getText());
			}
			
		}
	}
}
