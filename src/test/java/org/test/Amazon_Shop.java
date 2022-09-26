package org.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Amazon_Shop {
	
	
	@Test(priority = -1, timeOut = 1000, expectedExceptions = ThreadTimeoutException.class, groups = "TC2")
	private void login() throws InterruptedException {
		Thread.sleep(2000);
    System.out.println("LOGIN");
	}
	@Test(groups = "Test1")
	private void search() {
    System.out.println("MOBILE");
	}
	@Test(priority = 1, groups = "Test1")
	private void cart() {
System.out.println("ADD TO CART");
	}

}
