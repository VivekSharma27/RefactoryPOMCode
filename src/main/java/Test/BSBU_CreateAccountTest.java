package Test;

import org.junit.Test;

import pages.BSBU_CreateAccountPage;

public class BSBU_CreateAccountTest extends BaseTest {
	
	private BSBU_CreateAccountPage createAccountPage;
	
	
	@Test
	public void createAccountFlow() throws Exception {
		
		createAccountPage = new BSBU_CreateAccountPage(driver);
		
		createAccountPage.openAccountManagement();
		
		// Add more steps to create account and verify account creation
}
}
