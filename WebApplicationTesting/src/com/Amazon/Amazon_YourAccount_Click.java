package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_YourAccount_Click {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = null;
		String url="http://amazon.in";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Your Account - Link
		
		//WebElement yourAccount=driver.findElement(By.linkText("Your Account"));
		//yourAccount.click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("Your Orders")).click();

	}

}
