package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffMail_FullName {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		
		driver=new FirefoxDriver();
		driver.get(url);

		// name="name4c55aeb5"
		// name="nameee022c66"

		// Selector of name property is dynamically changing - xpath creation using javaSrcipt function 
		driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Srini");
		

	}

}
