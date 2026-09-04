package Tests_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleShadowDOM {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://shop.polymer-project.org/list/mens_outerwear");
        
        WebElement shopApp = driver.findElement(By.tagName("shop-app"));
        SearchContext root1 = shopApp.getShadowRoot();
        /*
        List<WebElement> elements = root1.findElements(By.cssSelector("*"));

        for (WebElement e : elements) {
            System.out.println(e.getTagName());
        }*/
        
        /*WebElement ele =
                root1.findElement(By.cssSelector("iron-pages"));

        System.out.println(ele.getTagName());*/
        
        WebElement ele =
                root1.findElement(By.xpath(".//iron-pages"));

        System.out.println(ele.getTagName());
        
        
   	}

}
