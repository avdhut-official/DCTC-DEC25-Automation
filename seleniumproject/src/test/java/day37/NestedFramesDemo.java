package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		
		//Switched to Parent Frame Using Id attribute value of Frame tag
		driver.switchTo().frame("frame1");
		System.out.println("Switched to Parent Frame");
		WebElement body_tag= driver.findElement(By.tagName("body"));
		System.out.println(body_tag.getText());
		
		//Switched to Child Frame Using web element
		WebElement childFrame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		System.out.println("Switched to Child Frame");
		WebElement p_tag=driver.findElement(By.tagName("p"));
		System.out.println(p_tag.getText());
		
		driver.switchTo().frame("frame1");		//switching back to parent frame
		
		driver.switchTo().defaultContent();		//switching back to main page
		
	}

}
