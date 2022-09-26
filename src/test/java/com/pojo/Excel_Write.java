package com.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\welcome\\eclipse-workspace\\Students\\9am_Maven\\Book1abcd.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("Abc").createRow(0).createCell(0).setCellValue("Arthiha");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("DATA GOT INSERTED");
	}

}
