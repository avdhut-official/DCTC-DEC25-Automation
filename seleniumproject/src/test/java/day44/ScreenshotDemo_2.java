package day44;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		ScreenshotUtility.captureScreenshot(driver, timestamp);
		
		String timestamp_1 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		driver.findElement(By.name("email")).sendKeys("vinay@test.com");
		
		ScreenshotUtility.captureScreenshot(driver, timestamp_1);
	}

}
