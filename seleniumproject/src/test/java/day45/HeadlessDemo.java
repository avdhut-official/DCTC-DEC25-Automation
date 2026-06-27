package day45;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");		// Headless Mode
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/droppable");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
