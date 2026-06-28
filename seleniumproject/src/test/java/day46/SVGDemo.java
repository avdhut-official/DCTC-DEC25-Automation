package day46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SVGDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://heroicons.com/");
		
		//driver.findElement(By.xpath("//*[name()='svg'][1]")).click();
		
		Thread.sleep(3000);
		
		//Locating the SVG tag
		//WebElement svg = driver.findElement(By.xpath("//button[@id='academic-cap-btn']//*[name()='svg']"));
		
		//If Want a mouse hover we can have this alternate approach as well
		WebElement btn_svg=driver.findElement(By.id("academic-cap-btn"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(svg).perform();
		
		act.moveToElement(btn_svg).perform();
		
		Thread.sleep(3000);		//instead of this we can use the Explicit Wait for better execution time
		
		
		driver.findElement(By.xpath("//div[@id='academic-cap-svg']")).click();
		//driver.quit();
	}

}
