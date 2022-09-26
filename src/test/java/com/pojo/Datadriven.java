package com.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\welcome\\eclipse-workspace\\Students\\9am_Maven\\Book1abcd.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(1);
		
		int i = c.getCellType();  //int-0, String=1 or some other no.
		
		if (i==0) {
			double d = c.getNumericCellValue();
			System.out.println(d);
		} else {
                String stringCellValue = c.getStringCellValue();
                System.out.println(stringCellValue);
		}
			
			
	}

}
