package day53;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {
			
			{"practice","SuperSecretPassword!",true},
			{"wrongUser","SuperSecretPassword!",false},
			{"practice","WrongPassword",false}
		};
	}
	
	@DataProvider(name="Data")
	public Object[][] getData()
	{
		return new Object[][] {
			
			{"Abhay","Pune",40,true},
			{"Shrawani","Mumbai",35,false},
			{"Sandeep","Delhi",30,true}
		};
	}

}
