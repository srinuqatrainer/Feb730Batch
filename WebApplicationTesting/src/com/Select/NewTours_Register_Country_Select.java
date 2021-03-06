package com.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

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
		
		Select selection = new Select(country);
		selection.selectByIndex(6);
		selection.selectByVisibleText("INDIA");
		selection.selectByValue("251");

	}

}
