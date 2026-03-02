package Test;

import java.util.Random;

import org.junit.After;
import org.junit.Test;

import pages.BSBU_FileManagementPage;

public class BSBU_FileManagementTest extends BaseTest {
	
	 private BSBU_FileManagementPage fileManagementPage;
	
	 @Test
	 public void testFileManagementUI() throws Exception {
	 	fileManagementPage = new BSBU_FileManagementPage(driver);
	 	
	 	String filename = System.getProperty("user.dir") + "\\organizationType - Sheet1.csv";
	 	
	 	String description = "Test file upload";
	 	
	 	 String accountName = fileManagementPage.getAccountName();
	 	
	 	
	 	
	 	fileManagementPage.navigateToFileManagement();
	 	fileManagementPage.uploadFile(filename, description);
	 	fileManagementPage.downloadFile();

	 	String mainWindow = fileManagementPage.openCustomerPortal(accountName);
	 	fileManagementPage.validateDashboard(accountName);
	 	fileManagementPage.downloadFromCustomerPortal();
	 	fileManagementPage.closePortalAndSwitchBack(mainWindow);

	 	fileManagementPage.deleteFile();
	 }
	 
	 @After
	    public void tearDown() throws Exception {
		 fileManagementPage.writeTestResult();
	    	System.out.println("stepcount: "+ (fileManagementPage.stepCount ) );
//	        driver.quit();
	        System.out.println("Browser closed successfully.");
	    }

}
