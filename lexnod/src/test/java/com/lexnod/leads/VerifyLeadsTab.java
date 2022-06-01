package com.lexnod.leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.HomePage;
import com.lexnod.pages.LeadsPage;
//Open the browser, enter the test url, verify loginpage is displayed 
@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class VerifyLeadsTab extends BaseTest{
	@Test
	public void verifyLeadsTabtest() throws Throwable
	{
		//Login to app verify home page is displayed
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//Click on leadstab
		HomePage hp = new HomePage();
		hp.clickLeadsTab();
		
		//verify leads text is displayed
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		LeadsPage lp = new LeadsPage();
		wlib.elementIsDisplayedOrNot(lp.getLeadsTextAddress(), "LeadsText");
		
		
		
	}

}
