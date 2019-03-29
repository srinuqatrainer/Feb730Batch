package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		String UserName="Srini";
		String Password="Hello";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(UserName);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys(Password).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
				

	}

}
