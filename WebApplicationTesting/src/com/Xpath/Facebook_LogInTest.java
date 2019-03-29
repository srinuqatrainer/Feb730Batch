package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
	
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Srini");
		
		//driver.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("Srini");
		
		// //*[@id="email"]
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Srini");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']"))
                                                                                .sendKeys("Hello");



	}

}
