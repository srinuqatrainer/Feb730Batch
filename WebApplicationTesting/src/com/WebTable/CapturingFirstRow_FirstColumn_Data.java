package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingFirstRow_FirstColumn_Data {

	public static void main(String[] args) {

		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String cityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(cityName);

		driver.quit();
	}

}
