package day56;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
		sparkReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Tester","Automation Team");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Browser", "Chrome");
		System.out.println("Extent Report Started");
	}
	
	public void onTestStart(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
		System.out.println("Test Started :"+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL, "Test Failed");
		System.out.println("Test Failed : "+result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, "Test Passed");
		System.out.println("Test Passed : "+result.getMethod().getMethodName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test.log(Status.SKIP, "Test Skipped");
		System.out.println("Test Skipped : "+result.getMethod().getMethodName());
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
		System.out.println("Extent Report Generated");
	}
	
}
