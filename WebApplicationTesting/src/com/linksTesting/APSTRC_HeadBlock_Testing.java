package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSTRC_HeadBlock_Testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://apsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// class="menu-wrap" - property of HeaderBlock
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
System.out.println(" The total number of links in the headerBlock are : "+headerBlockLinks.size());
		
		for(int k=0;k<headerBlockLinks.size();k++)
		{
			String headerBlockLinkName=headerBlockLinks.get(k).getText();
			System.out.println(k+" "+"The link Name is : "+headerBlockLinkName);
			
			headerBlockLinks.get(k).click();
						
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			// Identifying the Headerblock of the webPage again 
			headerBlock=driver.findElement(By.className("menu-wrap"));
			// Re-creating the ArrayList
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		}
		
		driver.quit();
		
		
		
		

	}

}
