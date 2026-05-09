package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllGetMethodsDemo {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//Open URL
		driver.get("http://www.google.com");
		
		//Open Another URL
		driver.get("http://www.amazon.com");
		
		//getTitle
		System.out.println("Title of Web Page : "+driver.getTitle());
		
		//getCurrentURL
		System.out.println("Current URL : "+driver.getCurrentUrl());
		
		/*
		//getPageSource
		System.out.println("Page Source : "+driver.getPageSource());*/
	}

}
