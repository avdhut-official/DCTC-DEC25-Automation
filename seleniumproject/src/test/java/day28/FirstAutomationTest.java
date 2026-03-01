package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		WebDriver driver= new ChromeDriver();
		
		//WebDriver driver =new FirefoxDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		//open url 
		driver.get("https://www.spicejet.com/");
		
		//Show the title of web page
		System.out.println(driver.getTitle());

		//close the browser
		driver.close();
	}

}
