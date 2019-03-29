package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		// Identifying the file on the system
FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		// Identifying the WorkBook in the FILE
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		// Identifying a particular Sheet in the WorkBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identifying a particular Row in the Sheet
		Row r=sheet.getRow(0);
		// Identifying a particular Cell in the ROW
		Cell c=r.getCell(0);
		
		//Getting the Value from the Row of a Cell
		String data=c.getStringCellValue();
		
		System.out.println(data);
	}

}
