package com.lexnod.Potentials;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.HomePage;
import com.lexnod.pages.PotentialsPage;
//open the browser enter url and verify

@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class VerifyPotentialsTab extends BaseTest{

	@Test
	public void verifyPotentialstabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on potentials tab and verify
		HomePage hp = new HomePage();
		hp.clickPotentialsTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		PotentialsPage pp = new PotentialsPage();
		wlib.elementIsDisplayedOrNot(pp.getPotentialsTextAddress(),"Potentials Text");
	}
}
