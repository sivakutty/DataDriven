package com.learndata.DataLearn;

import java.io.File;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLsheet {
	
	public static void getdataX() throws InvalidFormatException, IOException {
		
		File fl=new File("C:\\ECLIPSE\\PROJECT\\DataLearn\\XLsheet\\test.xlsx");
		
		
		Workbook wb=new XSSFWorkbook(fl);
		org.apache.poi.ss.usermodel.Sheet sheetAt = wb.getSheetAt(0);
		
		row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		getdataX();
		
	}
	
}
