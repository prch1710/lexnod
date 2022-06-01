package com.lexnod.Reports;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.HomePage;
import com.lexnod.pages.ReportsPage;

//open the browser, enter the url, and verify
@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class VerifyReportsTab extends BaseTest{
	
	@Test
	public void verifyReportsTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on reports tab and verify
		HomePage hp = new HomePage();
		hp.clickReportsTab();
		ReportsPage rp = new ReportsPage();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.elementIsDisplayedOrNot(rp.getReportsTextAddress(), "Reports text");
	}

}
