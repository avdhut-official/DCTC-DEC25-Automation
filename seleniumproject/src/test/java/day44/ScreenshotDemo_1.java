package day44;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo_1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		//Convert WebDriver into Screenshot Object 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Capture Screenshot -- Store in Temporary memory
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		//Capture Screenshot -- Store in final location
		File target=new File("./Screenshots/HomePage_"+timestamp+".png");
		
		source.renameTo(target);
		
		System.out.println("Screenshot Captured");
	}

}
