package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.am_Maven.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel extends BaseClass{
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@Test
	private void amazon(String browsername) {
		if (browsername.equals("chromebroswer")) {
			WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
           driver=new FirefoxDriver();
		}
    url("https://www.amazon.in/");
	}
	@Parameters("browser")
    @Test
	private void flipkart(String browsername) {
		if (browsername.equals("chromebroswer")) {
			WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
           driver=new FirefoxDriver();
		}
    url("https://adactinhotelapp.com/");
	}
}
