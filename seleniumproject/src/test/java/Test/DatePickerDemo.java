package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		/*
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement start_date= driver.findElement(By.id("start-date"));
		start_date.sendKeys("04/30/2026");
		
		WebElement end_date= driver.findElement(By.id("end-date"));
		end_date.sendKeys("05/31/2026");
		*/
		
		driver.get("https://demoqa.com/date-picker");

		driver.findElement(By.id("datePickerMonthYearInput")).click();

		String expectedMonth = "December";
		String expectedYear = "2026";
		String expectedDate = "1";
		while (true) {
			String month = driver.findElement(By.className("react-datepicker__current-month")).getText();

			if (month.contains(expectedMonth) && month.contains(expectedYear)) {
				break;
			}

			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}

		//driver.findElement(By.xpath("//div[text()='15']")).click();
		List<WebElement> all_dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']//div//div"));
		
		for(WebElement date : all_dates)
		{
			if(date.getText().equals(expectedDate))
			{
				System.out.println("Clicked");
				date.click();
				break;
			}
		}
		
	}
}
