package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import enums.applicationType;
import pages.BSBU_CustomerACSPage;
import utils.CommonMethods;

public class BSBU_CustomerACSTest extends BaseTest {

	private BSBU_CustomerACSPage customerACSPage;

	public BSBU_CustomerACSTest() {
		appType = applicationType.CUSTOMER;
	}

	@Test
	public void customerACSTest() throws Exception {

		customerACSPage = new BSBU_CustomerACSPage(driver);
		
		long unique = CommonMethods.getRandomLong(1000, 9999);

		String accountName = customerACSPage.getAccountName();  // we will use static this account if required Performance Account Web12
		
		String credentialNum = "CR" + Long.toString(unique);
		String cardName = "CR2" + Long.toString(unique);

		customerACSPage.searchAndOpenPerformanceAccount(accountName);
		customerACSPage.openManageCredentials();
		customerACSPage.openCardInventory();
		customerACSPage.enrollCard(credentialNum);
		customerACSPage.openManageUserList();
		customerACSPage.addUser(Long.toString(unique), Long.toString(unique));
		customerACSPage.navigateToManageCredentials();
		customerACSPage.reopenCardInventoryFromManageCredentials();
		customerACSPage.enrollNewCard(cardName);
        customerACSPage.assignCardToUsers(credentialNum, cardName);
        customerACSPage.revokeCardFromUserCredentials(cardName);
        customerACSPage.reassignCard(cardName);
        customerACSPage.returnCardToInventory(cardName);
        customerACSPage.replaceCard();
        customerACSPage.removeCardDeleteUserViewTemplate();
        customerACSPage.manageCredentialsAndUserListFlow();
	}
	
	 @After
	    public void tearDown() throws Exception {
		 customerACSPage.writeTestResult();
	    	System.out.println("stepcount: "+ (customerACSPage.stepCount ) );
//	        driver.quit();
	        System.out.println("Browser closed successfully.");
	    }
}
