package day46;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinksDemo {
	
		public static void main(String[] args) throws IOException {
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("start-maximized");
			
			WebDriver driver = new ChromeDriver(option);
			driver.get("http://www.deadlinkcity.com/");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("Total Links : "+links.size());
			
			for(WebElement link : links)
			{
				String linkURL = link.getAttribute("href");
				
				if(linkURL == null || linkURL.isEmpty())
				{
					System.out.println("URL is Missing");
					continue;
				}
				
				
				URL url = new URL(linkURL);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.connect();
				
				int responseCode = conn.getResponseCode();
				
				if(responseCode >= 400)
				{
					System.out.println(linkURL+"-->Broken Link ("+responseCode+")");
				}
				
				else
				{
					System.out.println(linkURL+"-->Valid Link ("+responseCode+")");
				}
			}
			
			driver.quit();
		}
		
}
