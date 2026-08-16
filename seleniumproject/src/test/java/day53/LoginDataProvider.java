package day53;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	
	WebDriver driver;
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {
			
			{"practice","SuperSecretPassword!"},
			{"wrongUser","SuperSecretPassword!"},
			{"practice","WrongPassword"}
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
	public void loginTest(String username, String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);;
		driver.findElement(By.id("password")).sendKeys(password);;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("UserName :"+username+" | Password: "+password);
		driver.quit();
	}

}
