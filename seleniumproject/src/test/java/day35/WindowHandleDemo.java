package day35;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//parent window handle
		String id = driver.getWindowHandle();
		System.out.println("Before Click :"+id);
		
		driver.findElement(By.linkText("Open Tab")).click();
		
	/*	String id_tab = driver.getWindowHandle();
		System.out.println("After Click :"+id_tab);*/
		
		//all window handles which are opened
		Set<String> all_window = driver.getWindowHandles();
		System.out.println(all_window);
		
		driver.findElement(By.linkText("Open Tab")).click();
		
		all_window = driver.getWindowHandles();
		System.out.println(all_window);
		
		//close window - where the selenium driver focus is 
		//driver.close();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
