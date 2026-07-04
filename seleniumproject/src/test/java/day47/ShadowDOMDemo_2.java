package day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMDemo_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/list/mens_outerwear");
		
		
		//step 1
		WebElement shadowHost = driver.findElement(By.cssSelector("shop-app"));
		
		//step 2
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		
		List<WebElement> allElements = shadowRoot.findElements(By.cssSelector("*"));
		
		for(WebElement element : allElements)
		{
			System.out.println(element.getTagName());
		}
	}

}
