package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");*/
		
		driver.get("https://www.testmuai.com/selenium-playground/simple-form-demo/");
		Thread.sleep(3000);
		WebElement txt_user= driver.findElement(By.id("user-message"));
		txt_user.sendKeys("Test Exception");
		
		
		driver.findElement(By.id("showInput")).click();
		
		
	}

}
