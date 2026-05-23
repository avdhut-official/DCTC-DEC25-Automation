package day39;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> all_rows= driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr"));
		
		//Count Number of Rows
		System.out.println("Number of Rows : "+all_rows.size());
		
		//Data in all Rows
		for(WebElement each_row : all_rows)
		{
			System.out.println(each_row.getText());
		}
		
		//Count Number of Columns
		List<WebElement> heading= driver.findElements(By.xpath("//table[@id='product' and @name='courses']//th"));
		System.out.println("Table Heading :"+heading.size());
		
		
		//Display Only Particular Row Data
		WebElement particular_row= driver.findElement(By.xpath("//table[@id='product' and @name='courses']//tr[2]"));
		System.out.println(particular_row.getText());
		
		//Display Only Particular Row and Column Data
		WebElement particular_column= driver.findElement(By.xpath("//table[@id='product' and @name='courses']//tr[2]//td[2]"));
		System.out.println(particular_column.getText());
	}

}





