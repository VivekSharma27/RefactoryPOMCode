package Test;

import org.junit.After;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import pages.BSBU_AccountSettingPage;
import pages.BSBU_AccountSetting_AdminLinkagePage;
import pages.SetUpAndLoginPage;
import utils.CommonMethods;

public class BSBU_AccountSettingTest extends BaseTest {
	
	
		
		public static void main(String[] args) throws InterruptedException {
			JUnitCore junit = new JUnitCore();
			junit.addListener(new TextListener(System.out));
			Result result = junit.run(BSBU_AccountSettingTest.class); // Replace "SampleTest" with the name of your class
			if (result.getFailureCount() > 0) {
				System.out.println("Test failed.");
				System.exit(1);
			} else {
				System.out.println("Test finished successfully.");
				System.exit(0);
			}
		}

		public BSBU_AccountSettingTest() {
		}

    private BSBU_AccountSettingPage accountSettingPage;
	private BSBU_AccountSetting_AdminLinkagePage accountSettingAdminLinkagePage;

    @Test
    public void accountSettingsFlow() throws Exception {
    	
    	long randomNumber = CommonMethods.getRandomLong(1000000000L, 9999999999L);
        String accountOrganizationName = "PerfUI_Organization_" + CommonMethods.getRandomLong(1000, 9999);
        String randomEmail = "PerfUIorganization" + CommonMethods.getRandomLong(100000, 999999) + "@yopmail.com"; // used for custormer portal organization creation
        
        long unique = CommonMethods.getRandomLong(10000, 99999); // Generate a unique identifier based on the current time for Manage Building section
        
        long random1_255 = CommonMethods.getRandomLong(1, 155);
        long random1_32 = CommonMethods.getRandomLong(1, 32);
    	
        accountSettingPage = new BSBU_AccountSettingPage(driver);
        accountSettingAdminLinkagePage = new BSBU_AccountSetting_AdminLinkagePage(driver);

        accountSettingPage.openAccountManagement();
        String accountName = accountSettingPage.getAccountName();
//      accountSettingPage.searchAccount(accountName);  // use for dynamic account search from config file
        accountSettingPage.searchAccount("Performance Account Web11");  // use for static account search
//        accountSettingPage.openCustomerPortal();
//      
//        accountSettingPage.loadManageOrganizationPage();
//        accountSettingPage.createOrganization(accountOrganizationName, Long.toString(randomNumber), randomEmail);
//        accountSettingPage.submitOrganization();
//        
//    accountSettingPage.openManageBuildings();
////        accountSettingPage.addSite(Long.toString(unique));
//        accountSettingPage.addBuilding(Long.toString(unique),Long.toString(unique));
//        accountSettingPage.addFloor(Long.toString(unique));
//        accountSettingPage.addRoom(Long.toString(unique));
//        accountSettingPage.openManageAlarms();
//        accountSettingPage.manageScanningTemplates(Long.toString(unique));
//        accountSettingPage.openManageServices();
//        accountSettingPage.addContract(Long.toString(unique));
//        accountSettingPage.editContract(Long.toString(unique));
//        accountSettingPage.manageServicesFeatures();
//        accountSettingPage.manageControllers(Long.toString(random1_255),Long.toString(unique));
//        accountSettingPage.addFAEController(Long.toString(random1_32),Long.toString(unique));
//        accountSettingPage.editFAEController();
//        accountSettingPage.manageACSDevice(Long.toString(random1_32),Long.toString(unique));
        
//        accountSettingAdminLinkagePage.manageLinkageGroupFlow(Long.toString(unique));
        
    }

    @After
    public void tearDown() throws Exception {
    	accountSettingPage.writeTestResult();
    	System.out.println("stepcount: "+ (accountSettingPage.stepCount ) );
//        driver.quit();
        System.out.println("Browser closed successfully.");
    }
}
