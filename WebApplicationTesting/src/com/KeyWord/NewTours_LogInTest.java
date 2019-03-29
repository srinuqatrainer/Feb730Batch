package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest{
	
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream("./newTours.properties");
		
		Properties pr = new Properties();
		
		pr.load(file);
		
		//driver.findElement(By.name("userName")).sendKeys("srini");
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Sign"))).click();
				
		String expected_Title="Find";
		System.out.println(" The expected title after logIn is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual title after logIn is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull - PASS");
			
		}
		else
		{
			System.out.println(" LogIN Failed - FAIL");
			
		}
		
			
	}
	
	

}
