package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		String url="http://amazon.in";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// id="nav-link-yourAccount" - property of HelloSignIn Element
		
		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).perform();
						
		Thread.sleep(10000);
				
		driver.findElement(By.linkText("Your Orders")).click();

	}

}
