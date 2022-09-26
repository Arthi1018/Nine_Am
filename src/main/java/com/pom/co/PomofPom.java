package com.pom.co;

import org.openqa.selenium.WebDriver;

public class PomofPom {
	
	public WebDriver driver;
	
	private Login l;
	
	private Search_Hotels s;

	public PomofPom(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login getL() {
		l=new Login(driver);
		return l;
	}

	public Search_Hotels getS() {
		s=new Search_Hotels(driver);
		return s;
	}
	

}
