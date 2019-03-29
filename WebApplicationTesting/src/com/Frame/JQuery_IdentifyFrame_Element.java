package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JQuery_IdentifyFrame_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));;
		
		// id="draggable" - Drag me to my target element property
		
		Thread.sleep(5000);
		
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		driver.switchTo().defaultContent();
		


	}

}
