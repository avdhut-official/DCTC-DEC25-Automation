package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void validLoginTest()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("standard_user", "secret_sauce");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
