package day50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagDemo {
	
	WebDriver driver;		//Class Variable
	
	@Test(priority = 1)
	public void launchBrowser()
	{
		driver = new ChromeDriver();
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
	}
	
	@Test(priority = 4)
	public void verifyHomePage()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 5)
	public void closeBrowser()
	{
		driver.quit();
	}
}
