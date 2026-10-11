package utils;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReportListener implements ITestListener {
	
	private static ExtentReports extent;
	
	private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	@Override
	public void onStart(ITestContext context)
	{
		extent = ExtentReportManager.getInstance();
	}
	
	@Override
	public void onTestStart(ITestResult result)
	{
		String testName = result.getMethod().getMethodName();
		Object [] parameters = result.getParameters();
		
		if(parameters !=null && parameters.length > 0)
		{
			testName += " - "+Arrays.toString(parameters);
		}
		
		ExtentTest extentTest = extent.createTest(testName);
		test.set(extentTest);
		test.get().info("Test Execution Started");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.get().fail(result.getThrowable());
		test.remove();
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		test.get().skip("Test Skipped");
		test.remove();
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		if(extent!=null)
		{
			extent.flush();
		}
	}
	
	

}
