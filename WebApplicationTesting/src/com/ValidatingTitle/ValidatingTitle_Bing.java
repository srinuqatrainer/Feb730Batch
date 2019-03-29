package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Bing {

	public static void main(String[] args) {
		
		// FireFox Browser
				System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("http://bing.com");
				
				String expected_Title="Bing";
				System.out.println(" The expected title of Bing Home Page is : "+expected_Title);
				
				String actualTitle_Bing=driver.getTitle();
				System.out.println(" The title of Bing Home Page is : "+actualTitle_Bing);
				
			// Validating the title - Implementing Java in WebDriver
				if(actualTitle_Bing.equals(expected_Title))
				{
					System.out.println(" Title matched - PASS ");
				}
				else
				{
					System.out.println(" Title not matched - FAIL");
				}
				
				driver.quit();


	}

}
