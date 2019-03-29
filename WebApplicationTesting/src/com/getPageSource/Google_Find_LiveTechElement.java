package com.getPageSource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Find_LiveTechElement {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		String url="http://google.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
		String expected_Element="Gmail";
		System.out.println(" Expected Element is :: "+expected_Element);
		
		String actual_PageSource=driver.getPageSource();
		//System.out.println(actual_PageSource);
		
		if(actual_PageSource.contains(expected_Element))
		{
			System.out.println(" Element Gmail found ");
		}
		else
		{
			System.out.println(" Element not found ");
		}
driver.quit();
	}

}
