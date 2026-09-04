package day56;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwagDemo {
	
	WebDriver driver;		//Class Variable
	ChromeOptions options;
	@BeforeClass
	public void dependencyCheck()
	{
		System.out.println("Running Before Class");
		options = new ChromeOptions();
		
		//incognito mode
		options.addArguments("--incognito");
		options.setImplicitWaitTimeout(Duration.ofSeconds(10));
		
		//disable Chrome's password saving and password leak detection through ChromeOptions
		/*
		Map<String, Object> prefs = new HashMap<>();

		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);

		options.setExperimentalOption("prefs", prefs);*/
		
		
	}
	
	@Test(priority = 1)
	public void launchBrowser()
	{
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void openApplication()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority = 3)
	public void login()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(priority = 4)
	public void verifyHomePage()
	{
		Assert.assertEquals("Swag Labs", driver.getTitle());
		
	}
	
	@Test(priority = 5)
	public void addInventory() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
		
	}
	
	@Test(dependsOnMethods = "addInventory")
	public void cart() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	@Test(priority = 6)
	public void closeBrowser()
	{
		driver.quit();
	}
}
