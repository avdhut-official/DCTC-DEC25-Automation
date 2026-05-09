package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//created object of wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait for element visibility
		WebElement txt_username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		txt_username.sendKeys("standard_user");
		
		WebElement txt_password=driver.findElement(By.id("password"));
		txt_password.sendKeys("secret_sauce");
		
		WebElement btn_login=wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		btn_login.click();
		
	}

}
