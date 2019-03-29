package com.ScreebShot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_Bing {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		String url="http://bing.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		//TakesScreenshot  - its an interface of Webdriver
		// Type casting
		//OutputType - its an interface of WebDriver
		
		File bing_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_Screenshot, new File("./screenShots/bing.png"));
		
		driver.quit();
	}

}
