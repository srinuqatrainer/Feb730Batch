package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_LinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		// <a href="mercurysignon.php">SIGN-ON</a>
		// <input type="text" name="userName" size="10">
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" The total number of links on NewTours HomePage are : "+linksCount);
		
		driver.quit();
		

	}

}
