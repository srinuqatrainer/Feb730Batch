package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours {
	
	// Object Repository Class
	
	//WebElement SignOn=driver.findElement(By.linkText("SIGN-ON"));
	//SignOn.click();
	
	@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
	
	public void signOn()
	{
		SignOn.click();
		
		
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
		
		
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	
	public void support()
	{
		Support.click();
		
		
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;

	
	@FindBy(name="login")
	WebElement LogIn;

	public void logIn(String userName,String password)
	{
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		LogIn.click();
	}
	
	
	

}
