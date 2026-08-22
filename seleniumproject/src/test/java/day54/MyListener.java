package day54;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started: "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed: "+result.getName());
		System.out.println("Test Failed: "+result.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped: "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Passed: "+result.getName());
	}
}
