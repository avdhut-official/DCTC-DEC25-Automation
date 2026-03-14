package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLocators {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*driver.get("https://www.amazon.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links on Web Page :"+links.size());
		
		//printing names of Links
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		*/
		
	 	List<WebElement> button = driver.findElements(By.className("btn"));
		
	 	//printing names of Buttons
	 	for( WebElement btn : button)
	 	{
	 		System.out.println(btn.getText());
	 	}
		
	}
	

}
