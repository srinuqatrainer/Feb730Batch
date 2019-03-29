package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Vacations_BackToHome {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.linkText("Vacations")).click();
		
		// Back To Home
		// <img src="/images/forms/home.gif" width="118" height="23" border="0">
		
		// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		// Relative Xpath
		//driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
	
		// Absolute xpath
driver.findElement(By.
xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/"
		+ "table/tbody/tr[4]/td/a/img")).click();
		
		
		
		
	}

}
