package com.lexnod.Campaigns.copy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.CampaignsPage;
import com.lexnod.pages.HomePage;

@Listeners(com.lexnod.GenericLib.MyListeners.class)
//open the browser, enter url and verify
public class VerifyCampaignsTab extends BaseTest{
	
	@Test
	public void verifyCampaignsTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on campaigns tab and verify
		HomePage hp = new HomePage();
		hp.clickCampaignsTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		CampaignsPage cp = new CampaignsPage();
		wlib.elementIsDisplayedOrNot(cp.getcampaignsTextAddress(), "Campaigns text");
		
	}
	

}
