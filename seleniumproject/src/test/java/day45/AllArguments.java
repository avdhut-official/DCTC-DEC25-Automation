package day45;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllArguments {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		//Disabling the Automation Bar
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		//disabling the notification
		options.addArguments("--disable-notifications");
		
		//accept ssl certificates
		options.setAcceptInsecureCerts(true);
		
		//maximize window
		options.addArguments("start-maximized");
		
		//incognito mode
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
	}

}
