package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewToursLogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("02March");
		
		Row r=sheet.getRow(1);
		
		// <input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
		// <input type="password" name="password" size="10">
		
		driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		System.out.println(" The expected title after logIn is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual title after logIn is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull - PASS");
			r.createCell(2).setCellValue("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIN Failed - FAIL");
			r.createCell(2).setCellValue("LogIN Failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream
				("./src/com/ApplicationTestResultFiles/NewTours_TestResult_SingleTestData.xlsx");
		workBook.write(file1);
		
		
		driver.quit();

	}

}
