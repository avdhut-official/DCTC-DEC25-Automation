package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTestConfig {
	
	
	protected WebDriver driver;
	protected ChromeOptions options;
	
	@BeforeMethod
	public void setup()
	{
		String browser = ConfigReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		}
		else
		{
			throw new IllegalArgumentException("Invalid Browser: "+browser);
		}
		
		driver.manage().window().maximize();
		driver.get(ConfigReader.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	

}
