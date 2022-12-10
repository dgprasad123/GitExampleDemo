package com.w2a.testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		
		
		
		//Assert.assertEquals("abc", "xyz");
		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("Inside Login Test");
		click("bmlBtn_CSS");
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login Successfully executed");
		
		//Assert.fail("login not successful");
		
		
		
		
		
		

	}
}