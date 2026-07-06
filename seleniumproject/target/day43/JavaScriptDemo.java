package day43;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));

		highlightElement(driver, username);

		username.sendKeys("standard_user");
		
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("password"));

		highlightElement(driver, password);
		
		Thread.sleep(1000);
		
		password.sendKeys("secret_sauce");
	}
	
	public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.border=''", element);
	}

}
