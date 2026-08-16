package day53;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestDifferentClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	//dataProviderClass - Considering the Test Data from TestData.class file
	//We are keeping the test data at one level and logic at another level
	
	@Test(dataProvider = "loginData", dataProviderClass = TestData.class)
	public void loginTest(String username, String password, boolean expectedResult)
	{
		driver.findElement(By.id("username")).sendKeys(username);;
		driver.findElement(By.id("password")).sendKeys(password);;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(expectedResult)
		{
			Assert.assertTrue(driver.getCurrentUrl().contains("/secure"),"Login Should be Successful");
		}
		else
		{
			Assert.assertFalse(driver.getCurrentUrl().contains("/secure"),"Login Should Fail");
		}
		
		driver.quit();
	}

}
