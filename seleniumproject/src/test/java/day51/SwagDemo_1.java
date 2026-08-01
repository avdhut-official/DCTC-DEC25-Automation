package day51;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagDemo_1 {
	
	WebDriver driver;		//Class Variable
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void openApplication()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority = 2)
	public void verifyTitle()
	{
		String expected ="Swag Labs";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
	}

}
