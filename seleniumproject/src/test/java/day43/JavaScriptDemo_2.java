package day43;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo_2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		WebElement name = driver.findElement(By.id("textinput-1"));
		
		//Sending Values to Disabled text field
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Vinay';", name);
		
		Thread.sleep(3000);
		
		//Scroll Down
		js.executeScript("window.scrollBy(0,1000)");		//move by given pixels from current position
		
		Thread.sleep(3000);
		//Scroll Up
		js.executeScript("window.scrollBy(0,-1000)");
		
		
		//scroll to bottom of page
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	//move by exact pixels
		System.out.println(js.executeScript("return document.body.scrollHeight"));
		
		//scroll to view of WebElement
		
		WebElement txt_kitchen = driver.findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",txt_kitchen);
		
		//Get Page Title
		System.out.println(js.executeScript("return document.title;"));
		
		//Get URL of Page
		System.out.println(js.executeScript("return document.URL;"));
	}

}
