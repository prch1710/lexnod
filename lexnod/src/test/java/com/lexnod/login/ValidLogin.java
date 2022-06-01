package com.lexnod.login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.FileLib;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.pages.SignInPage;

@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class ValidLogin extends BaseTest{

	@Test
	public void validLoginTest() throws Throwable {
		
		//Open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		//Login to App
		SignInPage lp=new SignInPage();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		//Verify Home Page is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Lexnod Home page");
	}
}
