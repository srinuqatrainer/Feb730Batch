package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_LogInTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		String userName="admin";
		String password="password";
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		// <input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		// <input name="txtPassword" id="txtPassword" type="password">
		WebElement Password=driver.findElement(By.name("txtPassword"));
		Password.sendKeys(password);
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		// Identifying the element with the property and saving into a Variable - the declaration
		// of the variable should be WebElement - since it is getting saved with an element
		WebElement logIn=driver.findElement(By.className("button"));
		logIn.click();
		
		String expected_Text="Welcome";
		System.out.println(" The expected text after logIn is :"+expected_Text);
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement welcomeAdminText=driver.findElement(By.linkText("Welcome Admin"));
		String actual_WelcomeText=welcomeAdminText.getText();
		System.out.println(" The actual text after logIn is : "+actual_WelcomeText);
		
		if(actual_WelcomeText.contains(expected_Text))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
		welcomeAdminText.click();
		
// Explicit wait -- WebDriver will wait for sure for the given time and then proceed to run the
// below Script Statement -- the wait will be applicable only for the below statement not to the
// complete Script		
		Thread.sleep(10000);
		
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		
		driver.quit();
	}
}
