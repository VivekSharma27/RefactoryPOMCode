package Test;

import org.junit.Test;

import enums.applicationType;
import pages.BSBU_CustomerAlarmHistoryPage;
import utils.CommonMethods;

public class BSBU_CustomerAlarmHistoryTest extends BaseTest{
	
	private BSBU_CustomerAlarmHistoryPage customerAlarmHistoryPage;
	
	public BSBU_CustomerAlarmHistoryTest() {
		appType = applicationType.CUSTOMER;
	}

	
	
	@Test
	public void alarmHistoryTest() throws Exception {
		
		customerAlarmHistoryPage = new BSBU_CustomerAlarmHistoryPage(driver);
		
		String accountName = customerAlarmHistoryPage.getAccountName();  //dynamic account name
		
		customerAlarmHistoryPage.searchAndOpenPerformanceAccount("Performance Account WebTest");  // static account name
		
		String alarmDescription = "PerfUI_Test_" + CommonMethods.getRandomLong(1000, 9999);
		
		customerAlarmHistoryPage.openAlarmHistoryPage();
		customerAlarmHistoryPage.applySiteBuildingFloorFilters();
		customerAlarmHistoryPage.verifyAlarmRecords();
		customerAlarmHistoryPage.applyAlarmStatusFilterAndClear();
		customerAlarmHistoryPage.clickRandomAlarmRecord();
		customerAlarmHistoryPage.acknowledgeAlarm(alarmDescription);
		customerAlarmHistoryPage.startResolutionAlarm(alarmDescription);
		customerAlarmHistoryPage.resolveAlarm(alarmDescription);
		customerAlarmHistoryPage.closeAlarm(alarmDescription);
		
		
		
	}

}
