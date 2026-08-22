package day54;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class ListenerDemo {
	
	
	@Test
	public void test1()
	{
		System.out.println("Executing Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Executing Test 2");
		Assert.fail();
	}
	
	@Test
	public void test3()
	{
		System.out.println("Executing Test 3");
	}

}
