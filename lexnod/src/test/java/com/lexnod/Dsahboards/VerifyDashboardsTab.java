package com.lexnod.Dsahboards;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.DashboardsPage;
import com.lexnod.pages.HomePage;

//open the browser, enter the url and verify
@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class VerifyDashboardsTab extends BaseTest{
	
	@Test
	public void verifyDashboardsTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on dashboards and verify
		HomePage hp = new HomePage();
		hp.clickDashboardTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		DashboardsPage dp = new DashboardsPage();
		
		wlib.elementIsDisplayedOrNot(dp.getDashboardsTextAddress(), "Dashboard text");
	}

}
