package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteWebTableData {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		
		for(int i=1;i<=36;i++) // goes to every Row of the table
		{
			
			for(int k=1;k<=8;k++) // goes to every Row of all the Columns
			{
				String data=driver.findElement(By.xpath(part1+i+part2+k+part3)).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
			
		}
		
		driver.quit();

	}

}
