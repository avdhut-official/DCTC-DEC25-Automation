package day44;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
				//Convert WebDriver into Screenshot Object 
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				//Capture Screenshot -- Store in Temporary memory
				File source= ts.getScreenshotAs(OutputType.FILE);
				
				//Capture Screenshot -- Store in final location
				File target=new File("./Screenshots/Login_"+screenshotName+".png");
				
				source.renameTo(target);
				
				System.out.println("Screenshot Captured");
	}
}
