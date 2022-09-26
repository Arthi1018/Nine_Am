package com.pom.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
    @CacheLookup
	@FindBy(id = "password")
	private WebElement password;
	
	
	@FindAll({              //OR
		@FindBy(id = "login"),
		@FindBy(name="abc")
	})
	private WebElement login;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
}
