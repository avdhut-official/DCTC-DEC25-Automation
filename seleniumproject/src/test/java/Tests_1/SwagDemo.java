package Tests_1;


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
		System.out.println("Inside Test Demo 1");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Opening Browser Demo 1");
	}
	
	@BeforeClass
	public void getData()
	{
		System.out.println("Getting Data from Excel Demo 1");
	}
	
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("Open an Application Demo 1");
	}
	
	@Test(groups = "Regression")
	public void test2()
	{
		System.out.println("Login to Application Demo 1");
	}
	
	@Test(groups = "Smoke")
	public void test3()
	{
		System.out.println("Adding product Demo 1");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing the Browser Demo 1");
	}
	
	@AfterClass
	public void generateReport()
	{
		System.out.println("Generate the Report Demo 1");	
	}
	
	@AfterTest
	public void demo_2()
	{
		System.out.println("After Test Demo 1");
	}
	
	@BeforeSuite
	public void demo_3()
	{
		System.out.println("Before Suite Demo 1");
	}
	
	@AfterSuite
	public void demo_4()
	{
		System.out.println("After Suite Demo 1");
	}
}

