package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//Open URL
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(3000);
		
		//back to previous web page
		driver.navigate().back();
		
		Thread.sleep(3000);
		//back to previous web page
		driver.navigate().forward();
		
		//refresh web page
		driver.navigate().refresh();
	}

}
