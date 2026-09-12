package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {
	
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button");
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void enterUserName(String userText)
	{
		type(username, userText);
	}
	
	public void enterPassword(String passwordText)
	{
		type(password, passwordText);
	}
	
	public void clickLogin()
	{
		click(loginBtn);
	}
	
	public void login(String usernameText, String passwordText)
	{
		enterUserName(usernameText);
		enterPassword(passwordText);
		clickLogin();
	}
	
}
