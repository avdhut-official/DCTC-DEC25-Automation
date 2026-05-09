package day35;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleDemo2 {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//parent window handle
		String parent_id = driver.getWindowHandle();
		System.out.println("Before Click :"+parent_id);
		
		//opened new tab
		driver.findElement(By.linkText("Open Tab")).click();
		
		//all window handles which are opened
		Set<String> all_window = driver.getWindowHandles();
		System.out.println(all_window);
		
		for(String child : all_window)
		{
			if(!child.equals(parent_id))		//true or false
			{
				driver.switchTo().window(child);
				System.out.println("Swithced to Child Window");
				Thread.sleep(3000);
				
				driver.findElement(By.name("searchQuery")).sendKeys("Lets Search");
				
				//driver.close();
			}
			
		}
		
		
		
	}

}
