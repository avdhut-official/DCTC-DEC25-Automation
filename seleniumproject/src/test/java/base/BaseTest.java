package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	
	protected WebDriver driver;
	protected ChromeOptions options;
	
	@BeforeClass
	public void dependencyCheck()
	{
		System.out.println("Running Before Class");
		options = new ChromeOptions();
		
		//incognito mode
		options.addArguments("--incognito");
		options.setImplicitWaitTimeout(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	

}
