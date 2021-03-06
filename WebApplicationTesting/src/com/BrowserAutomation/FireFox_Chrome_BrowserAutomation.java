package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFox_Chrome_BrowserAutomation {
	public static void main(String[] args) {
	
		// FireFox Browser
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver f = new FirefoxDriver();
		
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		
		// Edge Browser
		System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
		EdgeDriver e = new EdgeDriver();
		
		// internet explorer Browser
		System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		InternetExplorerDriver i = new InternetExplorerDriver();
		
		
		

	}

}
