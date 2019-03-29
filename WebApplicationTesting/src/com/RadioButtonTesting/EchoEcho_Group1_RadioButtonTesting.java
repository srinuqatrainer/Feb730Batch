package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_Group1_RadioButtonTesting {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		/*
		 <input type="radio" name="group1" value="Milk">
		<input type="radio" name="group1" value="Butter" checked="">
		<input type="radio" name="group1" value="Cheese">
		 */
		
WebElement radioButtonBlock=driver.findElement(By.
	xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/"
			+ "tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>group1_RadioButtons=radioButtonBlock.findElements(By.name("group1"));
		
		System.out.println(group1_RadioButtons.size());
		
		
		for(int i=0;i<group1_RadioButtons.size();i++)
		{
			group1_RadioButtons.get(i).click();
			
			for(int k=0;k<group1_RadioButtons.size();k++) // to get the status of the radioButtons
			{
	System.out.println(group1_RadioButtons.get(k).getAttribute("value")+" - "+
			                                  group1_RadioButtons.get(k).getAttribute("checked"));
			}
		}
		
		driver.quit();
	}

}
