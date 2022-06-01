package com.lexnod.Accounts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.AccountsPage;
import com.lexnod.pages.HomePage;
@Listeners(com.lexnod.GenericLib.MyListeners.class)
//open the browser, enter url, verify
public class VerifyAccountsTab extends BaseTest{

	@Test
	public void verifyAccountsTabTest() throws Throwable
	{
		//enter login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on accountstab and verify
		HomePage hp = new HomePage();
		hp.clickAccountsTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		AccountsPage ap = new AccountsPage();
		wlib.elementIsDisplayedOrNot(ap.getAccountsTextAddress(),"Accounts Text");
	}
}
