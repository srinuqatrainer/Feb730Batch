package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		String url="http://google.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		// <a class="gb_d" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		// <a class="gb_d" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		
		//driver.findElement(By.className("gb_d")).click();
		
		// When used ClassName locator to automate Images , we Observe the locator is same for
		// both Gmail and Images Element - WebDriver identifies the Element based on the properties
		// and it will automate the very first element on the webPage found with given properties
		// and so consider another locator to recognize the element uniquely
		
		/*a - anchor tag

		 href - attribute (referance URL) 

		 Type of Element - link

		 loctor - linkText
		 selector - Images */
		
		driver.findElement(By.linkText("Images")).click();
		
		String Images_Title=driver.getTitle();
		System.out.println("The Title of Images WebPage is : "+Images_Title);
		
		driver.quit();
	}

}
