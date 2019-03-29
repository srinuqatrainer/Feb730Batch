package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Bing {

	public static void main(String[] args) {
		
		// FireFox Browser
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://bing.com");
		
		//driver.navigate().to("http://google.com");
		
		String bing_Title=driver.getTitle();
		
		System.out.println(" The title of Bing Home Page is : "+bing_Title);
		
		driver.quit();

	}

}
