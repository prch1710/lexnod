package com.lexnod.Forecasts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.ForecastsPage;
import com.lexnod.pages.HomePage;

//open the browser and enter the url
@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class VerifyForecastsTab extends BaseTest {
	
	@Test
	public void verifyForecastsTabTest() throws Throwable 
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on forecasts tab and verify
		HomePage hp = new HomePage();
		hp.clickForecastsTab();
		ForecastsPage fp = new ForecastsPage();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.elementIsDisplayedOrNot(fp.getForecastsTextAddress(), "Forecasts Text");
		
	}

}
