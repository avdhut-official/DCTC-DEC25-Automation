package day41;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Sending Values Manually 
		
		//WebElement date= driver.findElement(By.id("datepicker"));
		//date.sendKeys("06/12/2026");
		
		/*driver.findElement(By.id("start-date")).sendKeys("04/30/2026");
		driver.findElement(By.id("end-date")).sendKeys("05/31/2026");
		driver.findElement(By.className("submit-btn")).click();*/
		
		
		
	}

}
