package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement menu = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		WebElement menu_1=driver.findElement(By.xpath("//span[text()='Account']"));
		
		Actions act=new Actions(driver);
		
		//Move the mouse cursor
		act.moveToElement(menu).moveToElement(menu_1).click().perform();
		
		Thread.sleep(3000);
		
		//Right click
		WebElement order=driver.findElement(By.xpath("//h2[normalize-space()='Your Orders']"));
		act.contextClick(order).perform();
		
	}

}
