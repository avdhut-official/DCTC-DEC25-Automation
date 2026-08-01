package day51;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagDemo {
	
	@BeforeTest
	public void demo()
	{
		System.out.println("Inside Demo");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Opening Browser");
	}
	
	@BeforeClass
	public void getData()
	{
		System.out.println("Getting Data from Excel");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Open an Application");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Login to Application");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Adding product");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing the Browser");
	}
	
	@AfterClass
	public void generateReport()
	{
		System.out.println("Generate the Report");	
	}
	
	@AfterTest
	public void demo_2()
	{
		System.out.println("After Completion of Class Execution");
	}
	
	@BeforeSuite
	public void demo_3()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void demo_4()
	{
		System.out.println("After Suite");
	}
}

