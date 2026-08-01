package day51;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo2 {
	
	@Test
	public void testEquals()
	{
		String actual = "Swag Labs";
		String expected = "Swag Labs";
		
		Assert.assertEquals(actual,expected);		//both must be same pass
	}
	
	@Test
	public void testNotEquals()
	{
		String  expected = "Chrome";
		String actual = "Firefox";
		
		Assert.assertNotEquals(actual, expected);	//both must be different then only pass
	}

}
