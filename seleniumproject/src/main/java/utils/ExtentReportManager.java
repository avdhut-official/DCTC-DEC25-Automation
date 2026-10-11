package utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	private static ExtentReports extent;
	private static ExtentSparkReporter sparkReporter;
	
	public static synchronized ExtentReports getInstance()
	{
		if(extent == null)
		{
			String reportDirectory = "target/extent-reports";
			new File(reportDirectory).mkdirs();
			
			sparkReporter = new ExtentSparkReporter(reportDirectory+"/ExtentReport.html");
			sparkReporter.config().setTheme(Theme.DARK);
			sparkReporter.config().setReportName("Automation Test Report");
			
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			
			extent.setSystemInfo("Framework", "Selenoium + TestNg ");
			extent.setSystemInfo("Build Tool", "Maven");
		}
		
		return extent;
	}
	
}
