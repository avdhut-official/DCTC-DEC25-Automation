package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Using Web Element
	/*	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(frameElement);
		
		//System.out.println("Switched to Frame");
		
		driver.findElement(By.linkText("VIEW ALL COURSES")).click();*/
		
		//Using index to switch
		driver.switchTo().frame(0);
		System.out.println("Switched to Frame Using Index");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Learning paths']")).click();
		
		
		
		
		
	}

}
