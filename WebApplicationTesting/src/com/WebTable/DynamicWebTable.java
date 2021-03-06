package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// xpath of WebTable - /html/body/div[1]/div[6]/section[1]/div
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
			//List<WebElement>cols=table.findElements(By.tagName("td"));
						
			for(int j=0;j<cols.size();j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}

		driver.quit();
	}
}
