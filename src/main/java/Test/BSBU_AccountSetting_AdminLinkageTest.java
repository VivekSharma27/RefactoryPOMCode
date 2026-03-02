package Test;

import org.junit.After;
import org.junit.Test;

import pages.BSBU_AccountSetting_AdminLinkagePage;
import pages.BSBU_DashboardPage;
import utils.CommonMethods;

public class BSBU_AccountSetting_AdminLinkageTest extends BaseTest {
	
	private BSBU_AccountSetting_AdminLinkagePage linkageGroupPage;

	@Test
	public void testDashboard() throws Exception {

		linkageGroupPage = new BSBU_AccountSetting_AdminLinkagePage(driver);
		
		long unique = CommonMethods.getRandomLong(10000, 99999);
		
//		String accountName=linkageGroupPage.getAccountName();
		
		linkageGroupPage.navigateToAccountManagement();
		linkageGroupPage.searchAccount("Performance Account WebTest");
		linkageGroupPage.openAccountDetails();
		linkageGroupPage.navigateToManageLinkageGroups();
		linkageGroupPage.selectSite();
		linkageGroupPage.selectBuilding();
		linkageGroupPage.selectFloor();
		linkageGroupPage.selectControllerAndDeviceLinkage();	
		
		linkageGroupPage.loadCreateLinkageGroupPage();
		linkageGroupPage.fillLinkageGroupDetails("Linkage Group " + Long.toString(unique), "Linkage Group Description");
		linkageGroupPage.addInputDevices();
		linkageGroupPage.selectDevicesAndAdd();
		linkageGroupPage.selectFirstDeviceCategoryAndSignal();
		linkageGroupPage.selectSecondDeviceCategoryAndSignal();
		linkageGroupPage.saveAddedInputDevices();
		
		linkageGroupPage.navigateToFloorForControlDevices();
		linkageGroupPage.addControlDevices();
		linkageGroupPage.saveAddedControlDevices();
		
		linkageGroupPage.configureLinkageGroupLogic();
		linkageGroupPage.createLinkageGroup();
		linkageGroupPage.openEditLinkageGroup();
		linkageGroupPage.updateLinkageGroupName("Linkage Group " + Long.toString(unique) + " Update");
		linkageGroupPage.deleteLinkageGroup();
		
		//===================== Fire Alarm Linkage =================================
		
		linkageGroupPage.openCreateFireAlarmLinkageGroup();

		linkageGroupPage.fillFireAlarmLinkageGroupDetails(
		        "Fire Alarm Linkage Group " + Long.toString(unique),
		        "Fire Alarm Linkage Group Description"
		);

		linkageGroupPage.addFireAlarmInputDevices();
		
		linkageGroupPage.selectFirstFireAlarmDeviceDetails();
		linkageGroupPage.selectSecondFireAlarmDeviceDetails();
		
		linkageGroupPage.saveAddedInputDevicesFireAlarm();
		linkageGroupPage.configureOutputAndRecovery();
		linkageGroupPage.navigateToFloorForFireAlarmControlDevices();
		linkageGroupPage.addControlDevicesFireAlarm();
		linkageGroupPage.createFireAlarmLinkageGroup();
		linkageGroupPage.editAndUpdateFireAlarmGroup("Fire Alarm Linkage Group " + Long.toString(unique) + " Update");
		linkageGroupPage.deleteFireAlarmLinkageGroup();
	}
	
	@After
    public void tearDown() throws Exception {
		linkageGroupPage.writeTestResult();
    	System.out.println("stepcount: "+ (linkageGroupPage.stepCount ) );
//        driver.quit();
        System.out.println("Browser closed successfully.");
    }

}
