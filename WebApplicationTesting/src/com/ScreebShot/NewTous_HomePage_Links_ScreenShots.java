package com.ScreebShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTous_HomePage_Links_ScreenShots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
				
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" The total number of links on NewTours HomePage are : "+linksCount);
		
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(linkName);
			
			links.get(i).click();
			
			//Thread.sleep(5000);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./screenShots/"+linkName+".png"));
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
		}
		
		
		driver.quit();



	}

}
