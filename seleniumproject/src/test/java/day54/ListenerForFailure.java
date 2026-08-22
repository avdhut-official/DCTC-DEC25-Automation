package day54;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerForFailure implements ITestListener {
	
	
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("Test Failed :"+result.getName());
		
		Object testClass = result.getInstance();
		
		WebDriver driver = ((LoginDataProvider)testClass).driver;
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		// Convert WebDriver into Screenshot Object
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Capture Screenshot -- Store in Temporary memory
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Capture Screenshot -- Store in final location
		File target = new File("./Screenshots/LoginPage/Login_" + timestamp + ".png");

		source.renameTo(target);

		System.out.println("Screenshot Captured");
	}

}
