package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url="http://facebook.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
		// locator - id
		// Selector - email
		
		driver.findElement(By.id("email")).sendKeys("Sriniiii");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		// locator - id
		// selector - pass
		
		driver.findElement(By.id("pass")).sendKeys("hello");
		
		// <label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		
		driver.findElement(By.id("loginbutton")).click();
	
	}

}
