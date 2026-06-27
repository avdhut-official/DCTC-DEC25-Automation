package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo_1 {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
}
