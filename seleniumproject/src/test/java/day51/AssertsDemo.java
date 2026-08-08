package day51;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertsDemo {
	
	@BeforeTest
	public void testAssert()
	{
		System.out.println("Before Test Assert Demo");
	}
	
	@AfterTest
	public void afterTestAssert()
	{
		System.out.println("After Test Assert Demo");
	}
	
	@Test
	public void testEquals()
	{
		String actual = "Swag Labs";
		String expected = "Swag Labs";
		
		Assert.assertEquals(actual,expected);
		System.out.println("Title Verified Successfully");
	}
	
	@Test
	public void testEqualFail()
	{
		String actual = "Swag Labs";
		String expected = "Sauce Demo";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Title Verified or Not");
	}

}
