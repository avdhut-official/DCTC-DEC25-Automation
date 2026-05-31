package day41;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo3 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		String expected_month="December";
		String expected_year="2024";
		String expected_date="2";
		
		while(true)
		{
			String month_year = driver.findElement(By.className("react-datepicker__current-month")).getText();
			System.out.println(month_year);
			
			if(month_year.contains(expected_month) && month_year.contains(expected_year))
			{
				break;
			}
			
			//driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
			
		}
		
		//driver.findElement(By.xpath("//div[text()='26']")).click();
		
		List<WebElement> all_dates= driver.findElements(By.xpath("//div[@class='react-datepicker__month']//div//div"));
		for(WebElement date : all_dates)
		{
			if(date.getText().equals(expected_date))
			{
				date.click();
				break;
			}
		}
	}

}
