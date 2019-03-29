package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Gmail_getText {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		String Gmail_ElementText=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println("The text of Gmail element is : "+Gmail_ElementText);
		
		driver.quit();

	}

}
