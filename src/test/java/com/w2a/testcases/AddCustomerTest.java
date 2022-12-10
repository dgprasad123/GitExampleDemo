package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilties.TestUtil;

public class AddCustomerTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data ) throws InterruptedException {
		
		
		if(!data.get("runmode").equals("Y")) {
			
			throw new SkipException("Skipping the testcase as the Run mode is NO");
		}
		
		click("addCustBtn_CSS");
//		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		type("firstname_CSS",data.get("firstname"));
		type("lastname_XPATH",data.get("lastname"));
		type("postcode_CSS",data.get("postcode"));
		click("addbtn_CSS");
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstName);
//		driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastName);
//		driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postCode);
		
	//	driver.findElement(By.cssSelector(OR.getProperty("addbtn"))).click();
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
				
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		
		alert.accept();
		
		Thread.sleep(2000);
		
		//Assert.fail("Customer not added ");
		
		
		
	}
	
	
	
	

}
