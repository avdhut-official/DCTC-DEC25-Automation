package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_4 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/list/mens_outerwear");

		// step 1
		WebElement shadowHost = driver.findElement(By.cssSelector("shop-app"));

		// step 2
		SearchContext shadowRoot = shadowHost.getShadowRoot();

		// to locate - shop-list - Level 1
		WebElement shadowHost_shop_list = shadowRoot.findElement(By.cssSelector("shop-list"));
		SearchContext shadowRoot_shop_list = shadowHost_shop_list.getShadowRoot();

		System.out.println(shadowHost_shop_list.getTagName());
		
		//to locate - shop-image - level 2
		
		WebElement shadowHost_shop_image = shadowRoot_shop_list.findElement(By.cssSelector("shop-image"));
		SearchContext shadowRoot_shop_image = shadowHost_shop_image.getShadowRoot();
		System.out.println(shadowHost_shop_image.getTagName());
		
		WebElement img = shadowRoot_shop_image.findElement(By.cssSelector("img"));
		System.out.println(img.getAttribute("alt"));
		System.out.println(img.getAttribute("src"));
	}

}
