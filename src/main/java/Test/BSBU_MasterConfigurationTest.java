package Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.After;
import org.junit.Test;
import utils.WaitUtils;

import pages.BSBU_AccountSettingPage;
import pages.BSBU_MasterConfigurationPage;

public class BSBU_MasterConfigurationTest extends BaseTest {
	
	private BSBU_MasterConfigurationPage masterConfigurationPage;
	
	 @Test
	    public void ManageDataModelFlow() throws Exception {

		 masterConfigurationPage= new BSBU_MasterConfigurationPage(driver);
	        // Generate unique values
	        String uniqueString = String.valueOf(System.currentTimeMillis());
	        String prefixUnique = "FLC";
	        
	     // Get current date-time
	        LocalDateTime now = LocalDateTime.now();

	        // Define format you want
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");

	        // Convert to string
	        String dateTimeString = now.format(formatter);

	        // ================= TEST FLOW =================
	        
	        masterConfigurationPage.configureManageDataModel(uniqueString, prefixUnique);
//	        masterConfigurationPage.configureACSManageDeviceModel(uniqueString);
//	        masterConfigurationPage.configureFAEEquipmentControllerModel(uniqueString);
	       
//	        masterConfigurationPage.configureACSControllerModel(uniqueString);
//	        Thread.sleep(2000);
//	        masterConfigurationPage.configureFAEControllerModel(uniqueString);
	        
//	        masterConfigurationPage.configureUnitOfMeasure();
//	        masterConfigurationPage.configureAuthModeCombinations(uniqueString);
	        
	        
	        
	        
	        masterConfigurationPage.navigateToEnergyCoefficientsPage();
	        masterConfigurationPage.loadManageCompanyPage();
	        masterConfigurationPage.manageEnergyCoefficients(dateTimeString);
	        masterConfigurationPage.updateEnergyCoefficient();
//	        masterConfigurationPage.deleteFAEControllerModel();
	        

	    }

	 @After
	    public void tearDown() throws Exception {
	    	masterConfigurationPage.writeTestResult();
	    	System.out.println("stepcount: "+ (masterConfigurationPage.stepCount ) );
//	        driver.quit();
	        System.out.println("Browser closed successfully.");
	    }

}
