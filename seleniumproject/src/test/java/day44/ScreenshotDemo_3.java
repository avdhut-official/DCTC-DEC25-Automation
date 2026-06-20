package day44;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo_3 {
	
	public static void main(String[] args) {
		
		//Take Web Element Screenshot
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));		
		email.sendKeys("vinay@test.com");
		
		takescreeshot(email,"login");
	}
	
	public static void takescreeshot(WebElement test, String name)
	{
		File source = test.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/"+ name +".png");
		
		source.renameTo(target);
	}

}
