package day36;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("alertBtn")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();
		
		//Simple Alert
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.accept(); // clicking on the Ok button of alert
		
		//Confirmation Alert
		driver.findElement(By.id("confirmBtn")).click();
		alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.dismiss();	// clicking on the Cancel button of alert
		
		//Prompt Alert
		driver.findElement(By.id("promptBtn")).click();
		alt = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.sendKeys("Vinay");
		alt.accept();
		
	}

}
