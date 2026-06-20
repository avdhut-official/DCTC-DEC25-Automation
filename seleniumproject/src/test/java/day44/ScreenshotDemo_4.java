package day44;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo_4 {
	
	
	public static void main(String[] args) {

		// Take Web Element Screenshot

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement header = driver.findElement(By.xpath("//div[@id='header']"));
		takescreeshot(header, "home");
		
		WebElement datta_entry_form=driver.findElement(By.xpath("//div[@id='main']"));
		takescreeshot(datta_entry_form, "form");
	}

	public static void takescreeshot(WebElement test, String name) {
		File source = test.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/" + name + ".png");

		source.renameTo(target);
	}

}
