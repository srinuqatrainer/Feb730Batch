package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_Facebook {

	public static void main(String[] args) {
		
		// FireFox Browser
				System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("http://facebook.com");
				
				String actual_Title=driver.getTitle();
				System.out.println(" The title of Facebook Home Page is : "+actual_Title);
				
				String actual_Url=driver.getCurrentUrl();
				System.out.println(" The Url of Facebook Home Page is : "+actual_Url);
				
				driver.quit();
	}

}
