package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//absolute xpath
		WebElement txt_search= driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[1]/div[1]/div[3]/textarea"));
		txt_search.sendKeys("Selenium Automation");
		
		Thread.sleep(3000);
		
		WebElement btn_search=driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[1]"));
		btn_search.submit();
	}
	

}
