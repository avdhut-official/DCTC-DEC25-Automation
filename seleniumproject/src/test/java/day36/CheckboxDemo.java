package day36;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Single Checkbox
		/*
		WebElement chk_optio1 = driver.findElement(By.id("checkBoxOption1"));
		chk_optio1.click();*/
		
		Thread.sleep(3000);
		
		//locating multiple checkboxes
		List<WebElement> multiple_chk = driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
		
		//selecting using traditional for Loop
		/*
		for(int i=0;i<multiple_chk.size();i++)
		{
			multiple_chk.get(i).click();
		}*/
		
		/*
		//selecting using enhanced for Loop
		for( WebElement x : multiple_chk)
		{
			x.click();
		}
		
		//selecting the last checkbox
		for(int i=2;i<multiple_chk.size();i++)
		{
			multiple_chk.get(i).click();
		}
		
		//first 02 checkboxes
		for(int i=0;i<2;i++)
		{
			multiple_chk.get(i).click();
		}*/
		
		
		//selecting and un-selecting using for Loop
		for(int i=0;i<multiple_chk.size();i++)
		{
				multiple_chk.get(i).click();
		}
		Thread.sleep(3000);
		
		for(int i=0;i<multiple_chk.size();i++)
		{
				multiple_chk.get(i).click();
		}
		
	}

}
