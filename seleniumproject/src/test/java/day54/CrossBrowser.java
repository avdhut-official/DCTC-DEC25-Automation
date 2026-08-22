package day54;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void testURL()
	{
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	

}
