package com.lexnod.quotes;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.HomePage;

//open the browser, enter the url and verify
@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class VerifyQuotesTab extends BaseTest{

	@Test
	public void verifyQuotesTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on quotes tab and verify
		HomePage hp = new HomePage();
		hp.clickQuotesElement();
		
	}
}
