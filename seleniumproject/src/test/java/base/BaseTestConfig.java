package base;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
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

import tests.LoggingTest;
import utils.ConfigReader;
import utils.LoggerUtil;

public class BaseTestConfig {
	
	
	protected WebDriver driver;
	protected ChromeOptions options;
	private static final Logger logger = LoggerUtil.getLogger(BaseTestConfig.class);
	
	@BeforeMethod(alwaysRun = true)
	public void setup()
	{
		System.out.println("### BASE SETUP METHOD STARTED ###");
		logger.info(">>> BaseTestConfig.setup() STARTED");
		String browser = ConfigReader.getProperty("browser");
		logger.info("========Test Setup Started========");
		logger.info("Selected browser : {}",browser);
		
		
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
		
		logger.info(">>> Driver is null: {}", driver == null);
		logger.info("Browser Launched Successfully");
		
		driver.manage().window().maximize();
		
		String url = ConfigReader.getProperty("url");
		
		driver.get(url);
		logger.info(">>> Application navigation completed");
		logger.info("Application Opened : {}",url);
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		logger.info("Starting Browser Cleanup ");
		
		if(driver!=null)
		{
			driver.quit();
			driver = null;
		}
		
		logger.info("Browser Closed Successfully");
		
		logger.info("========Test Setup Completed========");
	}
	
}
