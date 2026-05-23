package day39;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo2 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//List<WebElement> all_table = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		//System.out.println(all_table.size());
		
		/*for(WebElement x : all_table)
		{
			System.out.println(x.getText());
		}*/
		
		/*//Formatting the Table
		System.out.print("Hello\t");
		System.out.print("Hi");
		System.out.print("Hi");*/
		
		//We want to locate particular Author Book Details
		
		//Number of Rows
		int all_rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		for(int r=2;r<=all_rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(author);
			
			if(author.equals("Amit"))
			{
				String book_name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(book_name);
			}
		}
		
		
		
	}
	

}
