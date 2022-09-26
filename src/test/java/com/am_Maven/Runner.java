package com.am_Maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.file.ConfigurationReader;
import com.file.FileReaderManager;
import com.pom.co.Login;
import com.pom.co.PomofPom;
import com.pom.co.Search_Hotels;

public class Runner extends BaseClass{
	
	public static WebDriver driver=browser_Launch(); 
	
public static void main(String[] args) throws IOException {
	
	PomofPom p=new PomofPom(driver);

	url("https://adactinhotelapp.com/");
	
    String username = dataRead("C:\\Users\\welcome\\eclipse-workspace\\Students\\9am_Maven\\Book1abcd.xlsx",0, 0, 0);
	
	keysToSend(p.getL().getUsername(), username);
	
//	keysToSend(p.getL().getUsername(),FileReaderManager.getInstanceF().getInstanceC().getUsername());
	
	keysToSend(p.getL().getPassword(),FileReaderManager.getInstanceF().getInstanceC().getPassword());
	
	click(p.getL().getLogin());
	
	dropdown(p.getS().getLocation(), "text", "Sydney");

}
}
