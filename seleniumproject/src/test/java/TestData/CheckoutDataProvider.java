package TestData;

import org.testng.annotations.DataProvider;

public class CheckoutDataProvider {
	
	@DataProvider(name="checkoutData")
	public static Object[][] getCheckoutData()
	{
		return new Object[][] {
			
			 	{"Vinay", "Tyagi", "411001"},
	            {"Rahul", "Sharma", "400001"},
	            {"Priya", "Patil", "411045"}
		};
	}

}
