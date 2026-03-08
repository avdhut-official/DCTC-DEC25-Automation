package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//we are locating the web element using ID 
		//WebElement txt_firstname = driver.findElement(By.id("name-1"));
		
		WebElement txt_firstname=driver.findElement(By.name("enter-name"));
		txt_firstname.sendKeys("Vinay");
		
		// WebElement link_hire=driver.findElement(By.linkText("Get Shortlisted by Recruiters - Take QA Skill Assessments on TechSmartHire"));
		
		WebElement link_hire=driver.findElement(By.partialLinkText("Get Shortlisted by Recruiters"));
		
		link_hire.click();
		
		
		
		WebElement btn_alert=driver.findElement(By.id("alertbtn"));
		btn_alert.click();
		
		
	}

}
