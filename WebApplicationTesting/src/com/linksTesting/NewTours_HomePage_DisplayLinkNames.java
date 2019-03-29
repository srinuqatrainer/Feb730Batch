package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_DisplayLinkNames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		//driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
//		driver = new ChromeDriver();
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		// <a href="mercurysignon.php">SIGN-ON</a>
		// <input type="text" name="userName" size="10">
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" The total number of links on NewTours HomePage are : "+linksCount);
		
		/*for(WebElement w:links)
		{
			String linkName=w.getText();
			System.out.println(linkName);
		}*/
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(linkName);
			
			links.get(i).click();
			
			Thread.sleep(5000);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			// Re creating the array list again
			// when click click operation is done on the index of any array and the
			// driver moves to next webPage the stored info in the array list will 
			links=driver.findElements(By.tagName("a"));
		}
		
		
		driver.quit();

	}

}
