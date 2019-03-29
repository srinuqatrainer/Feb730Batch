package com.ApplicationToExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_ExcelWriteOperation {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		// name="country" - property of country element
		
		WebElement country=driver.findElement(By.name("country"));
		
		/*String text_Country=country.getText();
		System.out.println(text_Country);**/
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
	FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int i=0;i<countries.size();i++)
		{
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			
			String countryName=countries.get(i).getText();
			System.out.println(countryName);
			
			c.setCellValue(countryName);
			
FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
			workBook.write(file1);
		}
		
		driver.quit();


	}

}
