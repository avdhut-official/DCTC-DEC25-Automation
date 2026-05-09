package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement txt_name= driver.findElement(By.id("name"));
		System.out.println("Name Textfield Visibility : "+txt_name.isDisplayed());
		System.out.println("Name Textfield Editable : "+txt_name.isEnabled());
		txt_name.sendKeys("Vinay");
		
		Thread.sleep(3000);
		driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
		WebElement txt_name_disabled= driver.findElement(By.name("test"));
		System.out.println("Name Textfield Visibility : "+txt_name_disabled.isDisplayed());
		System.out.println("Name Textfield Editable : "+txt_name_disabled.isEnabled());
		//txt_name.sendKeys("Vinay");
		
		/*WebElement chk_username=driver.findElement(By.id("ohrmList_chkSelectRecord_25"));
		System.out.println("User is Selected or Not : "+chk_username.isSelected());
		Thread.sleep(3000);
		chk_username.click();
		System.out.println("User is Selected or Not : "+chk_username.isSelected());
		*/
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement chk_sunday= driver.findElement(By.id("sunday"));
		System.out.println("User is Selected or Not : "+chk_sunday.isSelected());
		chk_sunday.click();
		System.out.println("User is Selected or Not : "+chk_sunday.isSelected());
	}

}
