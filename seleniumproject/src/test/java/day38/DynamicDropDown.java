package day38;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("tutorial");
		
		Thread.sleep(3000);
		List<WebElement> all_suggestion= driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(WebElement suggest : all_suggestion)
		{
			System.out.println(suggest.getText());
			
			if(suggest.getText().contains("java"))
			{
				suggest.click();
				break;
			}
		}
	}

}
