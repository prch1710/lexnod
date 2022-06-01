package com.lexnod.leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.FileLib;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.pages.CreateNewLeadPage;
import com.lexnod.pages.LeadDetailPage;
import com.lexnod.pages.LeadsPage;
//Open the browser, enter the url
@Listeners(com.lexnod.GenericLib.MyListeners.class)
public class CreateNewLead extends BaseTest {
	
	@Test
	public void createNewLeadTest() throws Throwable
	{
		//enter login details and verify
		//click on leads tab and verify
		VerifyLeadsTab vp = new VerifyLeadsTab();
		vp.verifyLeadsTabtest();
		
		//click on new lead and verify
		LeadsPage lp = new LeadsPage();
		lp.clickNewLeadButton();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "newLeadTitle"),"Create Lead Page");
		//enter the valid details and save
		CreateNewLeadPage cnl = new CreateNewLeadPage();
		cnl.createNewLead(flib.readExcelData(EXCEL_PATH,"createLead",0,1),
				flib.readExcelData(EXCEL_PATH, "createLead", 1, 1),
				flib.readExcelData(EXCEL_PATH,"createLead", 2, 1),
				flib.readExcelData(EXCEL_PATH, "createLead", 3, 1));
		//Verify page
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "leadCreationTitle"),"LeadDetails Page");
		
		//verify lead name
		LeadDetailPage ldp = new LeadDetailPage();
		wlib.verify(ldp.getLeadNameText(), flib.readExcelData(EXCEL_PATH, "createLead", 4, 1),"Lead Name Text");
		
		
		
		
	}

}
