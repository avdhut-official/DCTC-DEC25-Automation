package Tests_1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://shop.polymer-project.org/list/mens_outerwear");
        
        		
		WebElement shopApp = driver.findElement(By.cssSelector("shop-app"));
		SearchContext root1 = shopApp.getShadowRoot();

		WebElement shopList = root1.findElement(By.cssSelector("shop-list"));
		SearchContext root2 = shopList.getShadowRoot();

		WebElement heading = root2.findElement(By.cssSelector("h1"));

		System.out.println(heading.getText());
	}

}
