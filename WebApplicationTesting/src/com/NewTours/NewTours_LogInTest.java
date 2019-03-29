package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		// <input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
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
		
		driver.quit();
	}

}
