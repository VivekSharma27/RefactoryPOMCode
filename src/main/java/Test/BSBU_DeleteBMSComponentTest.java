package Test;

import org.junit.After;
import org.junit.Test;

import pages.BSBU_DeleteBMSComponentPage;
import utils.CommonMethods;

public class BSBU_DeleteBMSComponentTest extends BaseTest {

	private BSBU_DeleteBMSComponentPage deleteBMSComponentPage;

	@Test
	public void createAccountforDeleteBMS() throws Exception {

		deleteBMSComponentPage = new BSBU_DeleteBMSComponentPage(driver);
		long unique = CommonMethods.getRandomLong(10000, 99999); // Generate a unique identifier based on the current
																	// time for Manage Building section

		deleteBMSComponentPage.openAccountManagement();
		String accountName = deleteBMSComponentPage.getAccountName();
		deleteBMSComponentPage.searchAccount(accountName); // use for dynamic account search from config file
//	    deleteBMSComponentPage.searchAccount("Performance Account Web11");  // use for static account search

		deleteBMSComponentPage.openManageBuildings();
		deleteBMSComponentPage.addSite(Long.toString(unique));
		deleteBMSComponentPage.addBuilding(Long.toString(unique), Long.toString(unique));
		deleteBMSComponentPage.addFloor(Long.toString(unique));
		deleteBMSComponentPage.addRoom(Long.toString(unique));
		deleteBMSComponentPage.deleteHierarchy();

	}
	
	@After
    public void tearDown() throws Exception {
		deleteBMSComponentPage.writeTestResult();
    	System.out.println("stepcount: "+ (deleteBMSComponentPage.stepCount ) );
//        driver.quit();
        System.out.println("Browser closed successfully.");
    }

}
