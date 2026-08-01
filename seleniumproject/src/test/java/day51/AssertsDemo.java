package day51;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo {
	
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
