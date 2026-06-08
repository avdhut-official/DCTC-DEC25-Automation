package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
		
		String str = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		System.out.println(str);
		
		int all_pages =Integer.parseInt(str.substring(str.indexOf("to")+3, str.indexOf("of")-1));
		System.out.println(all_pages);
		
		//Traverse All Pages
		for(int x=1;x<=all_pages;x++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//nav[@aria-label='pagination']//button[text()="+x+"]")).click();
			
			
			/*
			int rows=driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
			
			for(int i=1;i<=rows;i++)
			{
				//Only Name
				System.out.println(driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[1]")).getText());
				
			}*/
			
			List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
			//All Rows
			for(WebElement row:all_rows)
			{
				System.out.println(row.getText());
			}
		}
	}
}
