package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop_Operation {

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
		
		// id="droppable" - drop here element property
		
		WebElement drop_ELement=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag_Element, drop_ELement).perform();;
				
		driver.switchTo().defaultContent();
		
		// <a href="https://jqueryui.com/resizable/">Resizable</a>
		
		driver.findElement(By.linkText("Resizable")).click();

	}

}
