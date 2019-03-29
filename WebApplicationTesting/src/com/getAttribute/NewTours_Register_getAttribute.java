package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_getAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		String expectedurl_Register=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println(" the Expected url is : "+expectedurl_Register);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String actualUrl_Register=driver.getCurrentUrl();
		System.out.println(" The actual url is :"+actualUrl_Register);
		
		
		if(actualUrl_Register.equals(expectedurl_Register))
		{
			System.out.println(" Reached Expected link WebPage - PASS ");
		}
		else
		{
			System.out.println(" Reached to unexpected link Webpage - FAIL");
		}
		
		
		driver.quit();
	}

}
