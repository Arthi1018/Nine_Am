package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mobiles_Page {
	
	@BeforeSuite
	private void browser() {
    System.out.println("BROWSER IS LAUNCHED");
	}
	@BeforeTest
	private void url() {
    System.out.println("amazon.in");
	}
	@BeforeClass
	private void max() {
    System.out.println("WINDOW IS MAXIMIZED");
	}
	@BeforeMethod
	private void search() {
    System.out.println("SEARCH");
	}
	@Test
	private void m_Page() {
    System.out.println("MOBILES PAGE IS DISPLAYED");
	}
	@Test
	private void l_Page() {
    System.out.println("LAPTOP PAGE");
	}
	
	@AfterMethod
	private void screenshot() {
    System.out.println("SCREENSHOT IS TAKEN");
	}
	@AfterClass
	private void homepage() {
    System.out.println("COME BACK TO HOMEPAGE");
	}
	@AfterTest
	private void logout() {
    System.out.println("LOGOUT");
	}
	@AfterSuite
	private void close() {
    System.out.println("QUIT THE BROWSER");
	}

}
