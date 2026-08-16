package day53;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider = "Data", dataProviderClass = TestData.class)
	public void testData(String name, String city, int age, boolean status)
	{
		System.out.println("Name : "+name);
		System.out.println("City: "+city);
		System.out.println("Age: "+age);
		System.out.println("Status: "+status);
		System.out.println("----------------");
	}

	@DataProvider(name = "Data")
	public Object[][] getData()
	{
		return new Object[][] {
			
			{"Vinay","Pune",40,true},
			{"Amol","Mumbai",35,false},
			{"Ajay","Delhi",30,true}
		};
	}
}
