package day45;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDemo {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
	}

}
