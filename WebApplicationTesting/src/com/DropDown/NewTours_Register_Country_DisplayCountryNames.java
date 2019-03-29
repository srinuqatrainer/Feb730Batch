package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_DisplayCountryNames {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		// name="country" - property of country element
		
		WebElement country=driver.findElement(By.name("country"));
		
		/*String text_Country=country.getText();
		System.out.println(text_Country);**/
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		for(int i=0;i<countries.size();i++)
		{
			String countryName=countries.get(i).getText();
			System.out.println(countryName);
		}
		
		driver.quit();

	}

}
