package com.am_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Students\\9am_Maven\\chromedriver.exe");
		driver=new ChromeDriver(); //local
		return driver;
	}
	public static void url(String url) {
    driver.get(url);
    driver.manage().window().maximize();
	}
	
	public static void keysToSend(WebElement element, String send) {
    element.sendKeys(send);
	}
	
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void dropdown(WebElement element, String method, String value) {
    Select s=new Select(element);
    if (method.equals("value")) {
		s.selectByValue(value);
	}else if (method.equals("index")) {
		int i = Integer.parseInt(value);
		s.selectByIndex(i);
	}
	else if (method.equals("text")) {
		s.selectByVisibleText(value);
	}
	}
	
	public static String dataRead(String file,int sheet, int row, int cell) throws IOException {
        File f=new File(file);
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(sheet);
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
		int i = c.getCellType();  //int-0, String=1 or some other no.
		
		if (i==0) {
			double d = c.getNumericCellValue();
			int num=(int) d;
			String num1 = String.valueOf(num);
			return num1;
		} else {
                String stringCellValue = c.getStringCellValue();
                return stringCellValue;
		}

	}
	public static String title() {
    String title = driver.getTitle();
    return title;
	}
	
	public static String getUrl() {
    String url = driver.getCurrentUrl();
    return url;
	}

}
