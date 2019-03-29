package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Gmail_click {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = null;
		String url="http://google.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		// <a class="gb_d" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		// <a class="gb_d" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		
		driver.findElement(By.className("gb_d")).click();
		String gmail_Title=driver.getTitle();
		System.out.println("The Title of Gmail is : "+gmail_Title);
		

		driver.quit();
	}

}
