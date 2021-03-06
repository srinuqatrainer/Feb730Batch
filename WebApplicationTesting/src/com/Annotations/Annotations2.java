package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	
	@BeforeTest
	public void applicationLaunch()
	{
		System.out.println(" Gmail Application Launch ");
	}
	
	@Test(priority=0)
	public void inbox()
	{
		System.out.println(" Gmail Inbox functionality Testing ");
	}
	
	@Test(enabled=false) // This Test case will be ignored by the TestNG during test Run - Because
						// it is defined as a False Test Case - will be skipped during test Run
	public void composeMail()
	{
		System.out.println(" Gmail ComposeMail functionality Testing ");
	}
	
	@Test(priority=1)
	public void drafts()
	{
		System.out.println(" Gmail Drafts functionality Testing ");
	}
	
	@AfterTest
	public void applicationClose()
	{
		System.out.println(" Gmail Application close ");
	}


}
