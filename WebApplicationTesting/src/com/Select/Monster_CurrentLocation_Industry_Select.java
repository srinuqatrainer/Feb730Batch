package com.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// class="border_grey1" - property of current location
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
						
		Select selection = new Select(currentLocation);
		selection.selectByValue("491");

		// id="id_industry" - Industry element property
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select selection1 = new Select(industry);
		
		selection1.selectByIndex(2);
		selection1.selectByVisibleText("Any");
		selection1.selectByValue("5");
		
		selection1.deselectByValue("65");
		selection1.deselectAll();
			
		
		//driver.quit();


	}

}
