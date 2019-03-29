package com.ValidatingURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_FaceBook {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		String expected_Url="facebook.com";
		System.out.println(" The expected Url of facebook home page is :"+expected_Url);
		
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" the actual url of facebook home page is :"+actual_Url);
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println(" URL matched - PASS");
		}
		else
		{
			System.out.println(" Url not matched - FAIL");
		}
		driver.quit();

	}

}
