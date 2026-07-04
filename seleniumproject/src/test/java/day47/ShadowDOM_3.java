package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/list/mens_outerwear");
		
		
		//step 1
		WebElement shadowHost = driver.findElement(By.cssSelector("shop-app"));
		
		//step 2
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		
		//identifying the iron-pages - Level 1
		
		WebElement shadowHost_iron_pages = shadowRoot.findElement(By.cssSelector("iron-pages"));
		SearchContext shadowRoot_iron_pages = shadowHost_iron_pages.getShadowRoot();
		
		System.out.println(shadowHost_iron_pages.getTagName());
		
		
		//to locate - shop-list - Level 1
		WebElement shadowHost_shop_list = shadowRoot.findElement(By.cssSelector("shop-list"));
		SearchContext shadowRoot_shop_list = shadowHost_shop_list.getShadowRoot();
		
		System.out.println(shadowHost_shop_list.getTagName());
		
		//to locate h1 tag
		
		WebElement heading = shadowRoot_shop_list.findElement(By.cssSelector("h1"));
		System.out.println("Category : "+heading.getText());
		
	}

}
