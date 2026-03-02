package Test;

import org.junit.After;
import org.junit.Test;

import pages.BSBU_CreateAccessProfilePage;
import utils.CommonMethods;

public class BSBU_CreateAccessProfileTest extends BaseTest {
	
	private BSBU_CreateAccessProfilePage createAccessProfilePage;
	
	@Test
    public void accountSettingsFlow() throws Exception {
	 	
	 	
		 String accessProfileName = "PerfUI_AccessProfile_" + CommonMethods.getRandomLong(1000, 9999);
		 
		 createAccessProfilePage = new BSBU_CreateAccessProfilePage(driver);
		 
		 String accountName = createAccessProfilePage.getAccountName();
		 
		 createAccessProfilePage.openAccountManagement();
		 createAccessProfilePage.searchAccount("Access Profile Account");
		 createAccessProfilePage.openCustomerPortal();
		 createAccessProfilePage.loadManageAccessProfile();
		 createAccessProfilePage.createAccessProfile(accessProfileName);
		 createAccessProfilePage.editAccessProfile(accessProfileName);
		 createAccessProfilePage.assignCredentialsToAccessProfile();
		 createAccessProfilePage.assignEditCredentailsAccessProfile(accessProfileName);
		 createAccessProfilePage.deleteAccessProfile();
		 
		 
		 
		
		
	}
	
	 @After
	    public void tearDown() throws Exception {
		 createAccessProfilePage.writeTestResult();
	    	System.out.println("stepcount: "+ (createAccessProfilePage.stepCount ) );
//	        driver.quit();
	        System.out.println("Browser closed successfully.");
	    }

}
