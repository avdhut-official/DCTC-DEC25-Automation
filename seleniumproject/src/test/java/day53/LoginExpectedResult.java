package day53;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginExpectedResult {
	
	WebDriver driver;
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {
			
			{"practice","SuperSecretPassword!",true},
			{"wrongUser","SuperSecretPassword!",false},
			{"practice","WrongPassword",false}
		};
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(dataProvider = "loginData")
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
