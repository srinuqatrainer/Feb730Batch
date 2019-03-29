package com.ApplicationNavigation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Google {

	public static void main(String[] args) {

		// FireFox Browser
				System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("http://www.google.com");
				
				driver.close();
				
		}

}
