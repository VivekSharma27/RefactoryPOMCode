package Test;

import org.junit.Test;

import enums.applicationType;
import pages.BSBU_CustomerDashbaordPage;

public class BSBU_CustomerDashboardTest extends BaseTest {
	
	private BSBU_CustomerDashbaordPage customerDashboardPage;
	
	public BSBU_CustomerDashboardTest() {
		appType = applicationType.CUSTOMER;
	}
	
	@Test
	public void customerDashbaordTest() throws Exception {
		
		customerDashboardPage = new BSBU_CustomerDashbaordPage(driver);
		
		String accountName = customerDashboardPage.getAccountName();  //dynamic account name
		
		customerDashboardPage.selectAccount("PerfAccount_26");

		customerDashboardPage.openDeviceAlarm();
		customerDashboardPage.navigateBackToDashboard();

		customerDashboardPage.openControllerAlarm();
		customerDashboardPage.navigateBackToDashboard();

		customerDashboardPage.openManageAccessProfile();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openConfigureCalendar();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openManageOrganizations();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openManageBuildings();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openManagePortfolio();
		customerDashboardPage.navigateBackToDashboard();

		customerDashboardPage.openExpiredCredentials();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openCredentialsInventory();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openFileManagement();
		customerDashboardPage.navigateBackToDashboard();
		
		customerDashboardPage.openConfigureWidgets();
		customerDashboardPage.openContactInformation();
	}


}
