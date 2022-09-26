package org.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.am_Maven.BaseClass;
import com.pom.co.Login;
import com.pom.co.PomofPom;

public class Adactin extends BaseClass{
	
	public static WebDriver driver=browser_Launch();
	public static PomofPom p=new PomofPom(driver);
	
	@Test
	private void launch() {
    url("https://adactinhotelapp.com/");
	}
	
	@Test
	private void titleCheck() {
    String s="Adactin.com - Hotel Reservation System";
    String title = title();
    Assert.assertEquals(title, s, "Title not equal! Assert failed");
    System.out.println("ASSERT PASSED");
	}
	
	@Test
	private void urlcheck() {
    String s1="ABC";
    String url = getUrl();
    SoftAssert s=new SoftAssert();
    s.assertEquals(s1, url, "Not equal");
    System.out.println("TITLE CHECKED");
    s.assertAll();
	}
	
	@DataProvider(name = "Datas")
	private Object[][] datas() {
		return new Object[][]{
		{"Arthi","1234"},{"Arun","5678"}};
	}
	

	@Test(dataProvider = "Datas")
	private void login(String name, String pass) {
    keysToSend(p.getL().getUsername(), name);
    keysToSend(p.getL().getPassword(), pass);
    click(p.getL().getLogin());
	}

}
