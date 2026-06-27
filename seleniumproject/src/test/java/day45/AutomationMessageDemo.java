package day45;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationMessageDemo {
	
	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}

}
