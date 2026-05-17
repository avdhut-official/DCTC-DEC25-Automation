package day38;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDrmo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement drp_select= driver.findElement(By.id("dropdown-class-example"));
		
		Thread.sleep(3000);
		
		Select sel_dropdown=new Select(drp_select);
	/*	sel_dropdown.selectByIndex(1);
		
		Thread.sleep(3000);
		sel_dropdown.selectByVisibleText("Option2");
		
		Thread.sleep(3000);
		sel_dropdown.selectByValue("option3");
		
		List<WebElement> all_options = sel_dropdown.getOptions();
		
		System.out.println("Number of Options :"+all_options.size());
		
		for(WebElement opt : all_options)
		{
			System.out.println(opt.getText());
		}*/
		
		
		//Selecting a drop down value without Select Class Methods
		List<WebElement> all_options = sel_dropdown.getOptions();
		for(WebElement opt : all_options)
		{
			if(opt.getText().equals("Option1"))
			{
				opt.click();
				break;
			}
			
		}
		
	}

}
